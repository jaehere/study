package my.day08.a.random;

import java.util.*;

public class _4BingoMain_a {
	/*
    PC가 만들수 있는 숫자는  1 ~ 100 까지중 아무거나 1개를 만든다.

      예> 59 (PC가 랜덤하게 만든 숫자)
         
    1 부터 100 사이의 숫자입력 => 50엔터  1번시도
    >> 50보다 큰값입니다.

    1 부터 100 사이의 숫자입력 => 71엔터  2번시도
    >> 71보다 적은값입니다. 

    1 부터 100 사이의 숫자입력 => 60엔터  3번시도
    >> 60보다 적은값입니다.

    1 부터 100 사이의 숫자입력 => 58엔터  4번시도
    >> 58보다 큰값입니다.

    1 부터 100 사이의 숫자입력 => 59엔터  5번시도 
    #### 빙고!!  5번만에 맞추었습니다. ####       
*/   
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("1부터 100 사이의 숫자 입력 => ");
			String choice = sc.nextLine();//"안녕하세요" "1.2345"
										  //"9"
			int user_choice = 0;
			
			try {
				user_choice = Integer.parseInt(choice);
			} catch (NumberFormatException e) {
				System.out.println("[경고] 숫자로만 입력하시오 ");
			}
			if(!(1<=user_choice && user_choice<=100)) {
				System.out.println("▷ [경고] 1부터 100 사이의 숫자만 입력하시오.\n");
				continue;
			}
			
			int pc_num = rd.nextInt(100-1+1)+1;
			do {
				if(pc_num < user_choice) {
					System.out.println(">>"+user_choice +"보다 작은값입니다.\n");
					continue;
				}
				else if(pc_num < user_choice) {
					System.out.println(">>"+user_choice +"보다 큰값입니다.\n");
					continue;
				}
				
			} while (!(pc_num == user_choice));
					break;
//					String result = "";
//			System.out.println();
//			
			
			
			
		} while (true);
		
	}//end of main----------------

}
