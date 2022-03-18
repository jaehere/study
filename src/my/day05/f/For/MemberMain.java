package my.day05.f.For;

import java.util.Scanner;

import my.util.MyUtil;

public class MemberMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 회원가입 하기 (유효성검사) ===\n");
		
		String userid = "";
		
		for(;;) {
			System.out.print("1. 아이디 => ");
			userid = sc.nextLine();
//			int u_length = userid.length();
			
			if(userid.length() == 0) {
				System.out.println("경고 입력하시오");	
			}
			else{
				break;
				
			}
			
		}//end of for-------------
		String passwd = ""; // 지역변수를 밖으로 뺴둬야함
		
		for(;;) {
			System.out.print("2. 암호 => ");
			passwd= sc.nextLine();  
			
			if(!MyUtil.isCheckPasswd(passwd)) {
				System.out.println(">> [경고] 암호는 8글자 이상 15글자 이하의 대문자, 소문자, 숫자, 특수문자가 혼합되어져야만 합니다. ");
			}
			else {
				break;
			}
		}//end of for-------------
		
		
		//암호는 8글자 이상 15글자 이하의 대문자, 소문자, 숫자, 특수문자가 혼합되어져야만 통과한다.
		//자주 쓸거기때문에 util에 static메소드로 따로 빼줌
		String name = "";
		for(;;) {
			System.out.print("3. 성명 => ");
			name= sc.nextLine();
			
			if(name.length()==0) {
				System.out.println("경고] 입력하시오");
			}
			else {
				break;
			}
			
		}//end of for ----------
		
		
		Member mbr = new Member();
		mbr.userid = userid;
		mbr.passwd = passwd;
		mbr.name = name; 
		
		mbr.showInfo();
		
		
		
		sc.close();
		
	}

}
