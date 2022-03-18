package my.day07.b.Dowhile;

import java.util.Scanner;

public class _2FactorialMain {
// == 입사문제 == //
/*
  >> 알고 싶은 팩토리얼 수 입력 => 5엔터
  >> 5! ==> 126
  
  
  5! ==> 5*4*3*2*1
  7! ==> 7*6*5*4*3*2*1
 	
 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		outer:
		do {
			try {
				System.out.print(">>알고 싶은 팩토리얼 수 입력 =>") ;
				int num = Integer.parseInt(sc.nextLine());  //  5   가능 
												// 1.234  안녕   불가능
												//  "-7"  "0" 도 없음
				if(num <= 0) {              //자연수 = 1이상의 자연수
					System.out.println(">>[경고] 자연수를 입력하시오\n");
					continue;
					//continue 를 만나면 아래로 떨어지지 않고 do~while(조건식);의 조건식으로 간다
				}
				// 5*4*3*2*1
				long result = 1;
				for(int i=num;i>0;i--) { //5*4*3*2*1
					result *= i; // result = result * i;
								 // result = 1*5;
								 // result = 1*5*4;
								 // result = 1*5*4*3*2*1;	
				}//end of for----
				System.out.println(num+"! ="+result);
				
				do {
					System.out.print(">> 또할래?[y/n] ");
					String yn = sc.nextLine();
					if("Y".equalsIgnoreCase(yn)) {
						break;//자기와 가장가까운 반복문을 빠져나감
					}
					else if("N".equalsIgnoreCase(yn)) {
						break outer; //outer라고 적혀져있는 반복문 빠져나감
					}
					else {
						System.out.println(">>[경고] Y  또는 N만 입력하시오 \n");
					}
				} while (true);
				//end of do~while----------------
				
				
				
				
			} catch(NumberFormatException e){
				System.out.println(">>[경고] 정수를 입력하시오\n");
			}
		} while (true);
		//end of do~while-------------------------
		
		
		
		sc.close();
		System.out.println("\n~~~~~ 프로그램 종료 ~~~~~~~");
		
	}//end of main(String[] args)-----------

}
