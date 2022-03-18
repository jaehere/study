package my.day08.a.random;

import java.util.*;

public class _3GawibawiboMain_self {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		Scanner sc = new Scanner(System.in);
		outer:
		do {
			try {
				System.out.print("선택[1:가위  2:바위  3:보] => ");
				String choice = sc.nextLine();
				int user_choice_no = Integer.parseInt(choice);
				
				if(user_choice_no != 1 && user_choice_no != 2 &&user_choice_no != 3) {
					System.out.println("\n>> [경고] 1,2,3만 입력하세요!! << \n");
				}
				else {
					//PC 에서 랜덤하게 1 또는 3까지 중 하나 만 가지도록 만들자.
					int pc_choice_no = rnd.nextInt(3-1+1)+1;
					
					String result = "";
					
					if( pc_choice_no == user_choice_no) 
						result = "비겼습니다";
					else if(pc_choice_no < user_choice_no || (pc_choice_no == 3 && user_choice_no == 1)) {
						result = "이겼습니다";
					}
					else {
						result = "졌습니다";
					}
					
					System.out.println("컴퓨터가 낸 수: " + pc_choice_no +"=> "+result+"\n");
					
					do {
						System.out.print(">> 또 할래? [Y/N] => ");
						String yn = sc.nextLine();
						
						if("Y".equalsIgnoreCase(yn)) {
							break;
						}
						else if("N".equalsIgnoreCase(yn)) {
							break outer;
						}
						else {
							System.out.println(">> [경고] Y 또는 N 만 입력하세요 !! <<\n");
						}
						
					} while (true);
					//end of do~while------------------
					
					
				}//end of else--------
		
			} catch (NumberFormatException e) {
				System.out.println(">> [경고] 1,2,3만 입력하세요!! << \n");
			}
		} while (true);
		
		
		
		
		
		sc.close();
		

	} //end of main(String[] args)---------

}
