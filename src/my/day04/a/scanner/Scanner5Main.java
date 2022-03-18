package my.day04.a.scanner;

import java.util.Scanner;

public class Scanner5Main {

	public static void main(String[] args) {
		System.out.println("== 키보드로부터 2개의 숫자를 입력받아서 사칙연산(+ - * /)한 결과 알아보기 ==\n");
		
		Scanner sc = new Scanner(System.in);
		String inputStr = "";
		try {
			System.out.print(">> 첫번째 정수 입력 : ");
			inputStr = sc.nextLine(); // "25"
			  	   					  // "똘똘이"
			// "문자열"을 int 타입으로 형변환 시켜주는 방법 
			int num1 = Integer.parseInt(inputStr);
			
			System.out.print(">> 두번째 정수 입력 : ");
			inputStr = sc.nextLine(); // "2"
						   			  // "안녕"
			
			// "문자열"을 int 타입으로 형변환 시켜주는 것
			
			int num2 = Integer.parseInt(inputStr);

		// [참고] int 타입을 문자열로 형변환 시켜주는 방법
			String str_num1 = Integer.toString(num1);  //아직 입력한 지역변수를 사용하지 않아서 노란밑줄이 생김.
			String Str_num2 = String.valueOf(num2); 
			
			
			System.out.print(">> 사칙연산(+ - * /) 선택 : "); // "+"
														  // "-"
													   	  // "*"			
														  // "/"
			String operator = sc.nextLine();
			
			
			double result = 0;  //초기화  // int가 자동적으로 형변환되어 double로 들어가기 때문에
		// double result = 0.0; 과 같다.
			
			boolean b_flag = false;
			
			
			switch (operator) {  //byte , short, int , char, string 만 들어갈 수 있음
			case "+":
				result = num1 + num2;
				break; //switch문에서 break;를 만나면 switch문을 빠져나간다는 말이다.
			
			case "-":
				result = num1 - num2;
				break;	
				
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = (double)num1 / num2;
				break;
				
			default:
				b_flag = true;  //사칙연산이 아닌 경우에만 true가 될 것임.
				break;
			} // end of switch (operator)-------------------
			
			if(b_flag == false) {  // operator 가 "+" 또는 "-" 또는 "*" 또는 "/"인 경우
				if("/".equals(operator)) { //"문자열1"과 "문자열2"의 값이 같은지 다르지를 비교할때는 == 또는 != 를 쓰면 안된다.
 // ★ "문자열1".equals("문자열2")을 사용한다. ★☆★
					//만약에 "문자열1"와 "문자열2"의 값이 같다라면 "문자열1".equals("문자열2") 은 true가 되고,
					//"문자열1"와 "문자열2"의 값이 다르다면 "문자열1".equals("문자열2")은 false가 된다.
					// "/".equals(operator) == true 라고 굳이 써줄 필요 없음 true는 안 적어도 됨.
					
					
					System.out.println(">> 결과1 : " + num1 + operator + num2 + "=" + result);
				}
				else {
					System.out.println(">> 결과2 : " + num1 + operator + num2 + "=" + (int)result); //강제형변환 소수자르고 무조건 정수만 나옴
				}
			}
			else {
				System.out.println(">> " + operator+ "는(은) 사칙연산(+ - * /)가 아니므로 계산이 불가합니다.!! <<");
			}
			
			
		
			
		} catch(NumberFormatException e) {
			System.out.println(">> " + inputStr +" 은(는) 정수가 아닙니다. 정수만 입력하세요. <<");
		}
		sc.close();
		
	}// end of main(String[] args)------
	
	

}
