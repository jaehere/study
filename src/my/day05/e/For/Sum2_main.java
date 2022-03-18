package my.day05.e.For;
//숫자를 입력하고 누적의 합을 구한다.  
// @@@이문제 풀어보기 !!!! 1+2+3+4= 누적보여지게 만드는거.!
import java.util.Scanner;

public class Sum2_main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for(;;) {
			
			try {
			
				System.out.print(">> 누적해야할 시작 숫자 => ");
				
				int startNo = Integer.parseInt(sc.nextLine());
				// startNo ==> 3
				
				
				System.out.print(">> 누적해야할 마지막 숫자 => ");  //누적에서 마지막숫자가 첫숫자보다 작으면 말이 안된다.
				int endNo = Integer.parseInt(sc.nextLine());
				// endNo ==> 1
				
				
				
				if(endNo < startNo) {
					System.out.println("==[경고] 마지막 숫자는 시작 숫자 보다 같거나 커야 합니다. == \n ");
					continue;  //가장 가까운 증감식으로 올라가버리는데, 증감식이 없는 경우 , 처음부터 진행
				}
				
				//startNo   => 1   2   3
				//endNo     => 10  9   5
				//반복해야할 횟수  endNo - startNo + 1
				//반복해야할 횟수  10   8   3 번  
				
				int cnt = endNo-startNo+1;//반복해야할 회수 => endNo - startNo + 1
				int sum = 0; //누적의 합을 저장시켜주는 변수. 0으로 초기화 함.
				
				int start = startNo;

				String str = "";
				
				for(int i=0; i<cnt;i++) { // i<3 
					String str_add = (i<cnt-1)?"+":"";  //(조건)?참일때:거짓일때;
					
					str += start + str_add;
					
					sum += start++;   //sum = sum + startNo;  //startNo를 먼저 더해준다음에 그다음에 1 증가 후위
											  //sum =  0  + 3;
											  //sum =  0+3+4;
											  //sum = 0+3+4+5;
			
					
					
				}//end of for ------
							
				System.out.println(startNo+" 부터 "+ endNo + " 까지의 누적의 합은 "+sum+" 입니다.");
				System.out.println(str + " = " + sum);
					
				
				
				
				
				
				break;
			} catch(NumberFormatException e) {
				System.out.println("\n== [경고] 정수만 입력해주세요~~ ==\n");
			}
			
		}//end of for--------------------
		
		
		
	
		
		sc.close();
	}

}
