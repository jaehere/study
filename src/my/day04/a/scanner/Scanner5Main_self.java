package my.day04.a.scanner;

import java.util.Scanner;

//혼자 연습해보기 !!

public class Scanner5Main_self {

	public static void main(String[] args) {
		
		System.out.println("== 키보드로부터 2개의 숫자를 입력받아서 사칙연산(+-*/)한 결과 알아보기 ==");
		
		Scanner sc = new Scanner(System.in);
//		String inputStr = "";
		
				System.out.println(">> 첫번째 정수 입력 : ");
				String inputStr = sc.nextLine();
				
				int num1 = Integer.parseInt(inputStr);
				
				System.out.println(">> 두번째 정수 입력 : ");
				inputStr = sc.nextLine();
				
				int num2 = Integer.parseInt(inputStr);
				
				System.out.println(">>사칙연산(+-*/) 선택 : ");
		
		
		
	
	}

}
