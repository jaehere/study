package smartLearning;

import java.util.Random;
import java.util.Scanner;

public class _211217_smart_quiz {

	public static void main(String[] args) {
		// Random 클래스를 이용한 임의의 수 (1 에서 100 사이) 맞추기 게임
		// 키보드로 숫자를 입력 받아 임의의 수를 몇번에 맞추는지 출력
		

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int rd_num = rd.nextInt(100-1+1)+1;
		
		int input = 0;
		int count = 0;
		do {
				
			System.out.print(">>1에서 100사이의 임의의 수를 맞추시오 => ");
			count ++;
			try {
				input = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("!!숫자만 입력하시오\n");
				continue;
			}
			
			
			if(input > rd_num) {
				System.out.println("입력한 값보다 작은 수입니다");
				continue;
			}
			else if(input < rd_num) {
				System.out.println("입력한 값보다 큰 수입니다");
				continue;
			}
			else {
				System.out.println("정답입니다.");
				System.out.println(count +"번만에 맞췄습니다.");
				break;
			}
		} while (input != rd_num);
		
		if (!(1<=input && input<=100)) {
			System.out.println("1에서 100사이의 값만 입력하시오\n");
		}	
			
			
		
		
		
		
		
		
		
		sc.close();

	}//end of main----------

}
