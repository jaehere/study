package my.day02.c.constructor;

public class MemberMain {

	public static void main(String[] args) {
//어떤 생성자이든지 기본생성자면 생략됨?
		Member hongMbr = new Member(); // 파라미터가 없는 생성자를 기본생성자(default constructor)라고 부른다.   //소괄호는 1.메소드/2.생성자
		hongMbr.userid = "hongkd";
		hongMbr.passwd = "1234";
		hongMbr.name = "홍길동";
		hongMbr.age = 20;
		hongMbr.point = 100;
		
		hongMbr.showInfo();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~\n");
		
		Member iyouMbr = new Member("iyou","abcd","아이유",29,300);  //인자, parameter, 매개변수
		
		iyouMbr.showInfo();
		
		
		System.out.println("\n====================\n");
		
		Member chaewMbr = new Member("chaew","qwer","차은우",25);  //인자, parameter, 매개변수
		
		chaewMbr.showInfo();
		
		System.out.println("\n#######################\n");
		
		

		// == return 타입이 void 인(없는) 메소드 호출 == //
		// 행위=behavior=method
		
		// hongMbr 인스턴스(객체)의 암호를 변경해주는 메소드 호출
		hongMbr.updatePasswd("1234a","0070$"); //parameter argument 매개변수 인자
		// iyouMbr 인스턴스(객체)의 암호를 변경해주는 메소드 호출
		iyouMbr.updatePasswd("abcd","asdf!"); 

		System.out.println("\n====================\n");
		
		
		// == return 타입이 있는 메소드 호출 == //
		
		int jangoPoint = hongMbr.pointPayment(30);
		System.out.println("남은 포인트 : " + jangoPoint);
		
//		>> "홍길동" 님 30포인트 결제가 완료되었씁니다.!<<
//		남은 포인트 : 70
		
		System.out.println("\n-------------------------\n");
		
		String info = hongMbr.changeInfo("5678", 30, 400);
		              //                    암호, 나이, 포인트
		System.out.println(info);
		
		/*
		  	=== 홍길동님의 회원정보 수정하기전 ===
		  	1. 아이디 : hongkd
		  	2. 암호 : 1234
		  	3. 성명 : 홍길동
		  	4. 나이 : 20
		  	5. 포인트 : 70
		  	
		  	=== 홍길동님의 회원정보 수정후 ===
		  	1. 아이디 : hongkd
		  	2. 암호 : 5678
		  	3. 성명 : 홍길동
		  	4. 나이 : 30
		  	5. 포인트 : 400
		  	
		 */
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		info = iyouMbr.changeInfo("5678","이지은", 25, 8000);
        //                          암호, 성명,  나이, 포인트
		
		System.out.println(info);

		/*
	  	=== 아이유님의 회원정보 수정하기전 ===
	  	1. 아이디 : iyou
	  	2. 암호 : asdf!
	  	3. 성명 : 아이유
	  	4. 나이 : 29
	  	5. 포인트 : 70
	  	
	  	=== 아이유님의 회원정보 수정후 ===
	  	1. 아이디 : iyou
	  	2. 암호 : 5678
	  	3. 성명 : 이지은
	  	4. 나이 : 25
	  	5. 포인트 : 8000
	  	
	 */
	
	}

}
