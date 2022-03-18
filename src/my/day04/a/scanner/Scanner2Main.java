package my.day04.a.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner2Main {

	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 => ");
		
		try {	
			int inputNum = sc.nextInt();
			
			sc.nextLine();
			
			//nextLine이아니라면 무조건 스캐너 버퍼를 지어야 함
			System.out.println("입력한 정수 : "+ inputNum);
		} catch(InputMismatchException e) {
			System.out.println(">>> 정수만 입력하세요 !!! <<< \n");
			e.printStackTrace();
		}
		
		
		sc.close();
		
	}

}
