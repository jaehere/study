package my.day06.b.multifo.gugudan;

import java.util.Scanner;

public class Gugudan_main1_self {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		outer:
		for(;;) {
			try {
				System.out.print(">> 몇단볼래? => ");
				String str = sc.nextLine();
	
				int dan = Integer.parseInt(str);
			
				if(2<=dan&&dan<=9) {
					System.out.println("==="+dan+"단===");
					for(int i=0;i<9;i++) {
						System.out.println(dan+"*"+(i+1)+"="+dan*(i+1));
						
					}
					for(;;) {
						System.out.println(">>또 할래? [Y/N} \n");
						String yn = sc.nextLine();
						
						if("N".equalsIgnoreCase(yn)) {
							sc.close();
							break outer;
						}
						else if("Y".equalsIgnoreCase(yn)) {
							break;
						}
						else {
							System.out.println(">>[경고] Y또는 N만 가능");
						}
					}
				}//end of if ----
				else {
					System.out.println(">>[경고] 2~9단만 가능");
				}
		
			} catch (NumberFormatException e) {
				System.out.println(">>[경고] 2~9단만 가능");
			}
		}//end of for-----	
		
		
		

	}//end of main---------

}
