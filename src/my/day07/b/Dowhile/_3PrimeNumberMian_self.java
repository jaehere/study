package my.day07.b.Dowhile;

import java.util.*;

public class _3PrimeNumberMian_self {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int startNo=0; int endNo =0;
		
		do {
			try {
				System.out.print(" ▷시작 자연수 : ");
				startNo = sc.nextInt();
				sc.nextLine();
				
				System.out.print(" ▷끝 자연수 : ");
				endNo = sc.nextInt();
				sc.nextLine();
				
				if(startNo < 1 || endNo < 1) {
					System.out.println("[경고]자연수만 입력하시오 ");
				}
				else if(startNo>endNo) {
					System.out.println("[경고]두번째 입력한 숫자가 첫번쨰 숫자보다 커야합니다");
				}
				else {
					break; //올바르니 빠져나가자
				}
			} catch (InputMismatchException e) {
				System.out.println("[경고]자연수만 입력하시오 ");
			}
		} while (true);
		
		
		String str_result = "";
		int cnt = 0; int sum = 0;
		
		
		for(int i=startNo; i<20;i++) {
			if(i==1)
				continue;
			
			boolean isSosu = true;
			
			for(int j=2; j<i;j++) {
				if(i%j == 0) {
					isSosu = false;
					break;
				}
			}//end of for----
			if(isSosu) {
				String str_add = (!"".equals(str_result))?",":"";
				str_result += str_add +i;
				
				cnt++;
				sum += i;
			}
			
			
			
		}//end of for----
		
		System.out.println(startNo+"부터 "+endNo+" 까지의 소수는?\n"+str_result+"\n");
		
		System.out.println(startNo+"부터 "+endNo+" 까지의 소수의 개수? "+cnt + "개");
		System.out.println(startNo+"부터 "+endNo+" 까지의 소수들의 합? "+sum);
		
		
		sc.close();
		System.out.println("== 프로그램 종료 ==");

	}

}
