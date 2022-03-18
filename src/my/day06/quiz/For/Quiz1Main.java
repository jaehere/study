package my.day06.quiz.For;

import java.util.Scanner;

public class Quiz1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("▷ 문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		System.out.println("입력한 문자열 : "+ str);
		System.out.println("입력한 문자열 길이 : " + str.length());
		
		
		int upp_cnt = 0, low_cnt=0, num_cnt=0, spe_cnt=0;
		for(int i=0;i<str.length();i++) {
			
			char ch_1= str.charAt(i);
			
			if(Character.isUpperCase(ch_1)) //if(65 <= ch_1 && ch_1 <= 90)
				upp_cnt ++;
			else if(Character.isLowerCase(ch_1))  //else if(97 <= ch_1 && ch_1 <= 122)   소문자인지 알아본다.
				low_cnt ++;
			else if(Character.isDigit(ch_1))  //else if(48 <= ch_1 && ch_1 <= 58) 숫자인지 알아본다.
				num_cnt++;
			else
				spe_cnt++;
			
		}//end of for-----
		
		System.out.println("대문자 개수 : "+upp_cnt + "개");		
		System.out.println("소문자 개수 : "+low_cnt + "개");	
		System.out.println("숫자 개수 : "+num_cnt + "개");	
		System.out.println("특수문자 개수 : "+spe_cnt + "개");	
		
		
		sc.close();
		
	}//end of main(String[] args)--------------

}
