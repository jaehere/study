package my.day06.quiz.For;

import java.util.Scanner;

public class Quiz3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		outer:
		for(;;) {
			System.out.print("▷ 휴대폰 번호를 입력하세요(예> 010-2345-6789) : " );
			String p_num = sc.nextLine();
	
			int leng = p_num.length();
		
			if(leng!=13) {
				System.out.println("올바른 휴대폰번호를 입력하시오\n");
				continue;
			}
			
		
			for(int i=0;i<leng;i++) {
				char ch = p_num.charAt(i);
				
				if(ch=='-')
					continue;
				
				System.out.print(ch);
				
			
			}//end of for------------
			sc.close();
			break outer;

		}//end of for---------
		
	
		
		
	}//end of main(String[] args)--------

}
