package my.day01;

// import my.day02.Member; //Member가 다른 패키지에 있을 경우, import로 가지고 옴

public class Main {
	// Main과 Member가 동일 패키지에 있기 때문에 Main에서 Member를 쓸 때 import를 따로 할 필요가 없다.
	// 콘솔프로그램의 실행은 main(String[] args) 메소드에서 실행한다.
	public static void main(String[] args) {

		// 1명의 새로운 회원이 필요하다.
		
		Member lssmbr = new Member();  //RAM에 올리자  이순신
		// lssmbr 을 Member 클래스의 객체(==인스턴스)라고 부른다.
		
		lssmbr.id = "leess"; // = 은 어떤값을 어떤 변수에 대입한다(넣어준다)라는 뜻이다,
		lssmbr.pwd = "abcd";
		lssmbr.name = "이순신";
		lssmbr.email = "leess@naver.com";
		
		
		System.out.println("lssmbr : " + lssmbr);
		//lssmbr : my.day01.Member@379619aa
		// @다음에 나오는 16진수의 값은 메모리(RAM) 상의 위치(주소)를 가리키는 것이다.
		

		// 또 1명의 새로운 회원이 필요하다.
		
		Member emojhmbr = new Member();  //RAM에 올리자  이순신
		// emojhmbr 을 Member 클래스의 객체(==인스턴스)라고 부른다.
		
		emojhmbr.id = "emojh"; // = 은 어떤값을 어떤 변수에 대입한다(넣어준다)라는 뜻이다,
		emojhmbr.pwd = "qwer1234";
		emojhmbr.name = "엄정화";
		emojhmbr.email = "emojh@gmail.com";

		System.out.println("emojhmbr : " + emojhmbr);
		//emojhmbr : my.day01.Member@7de26db8

		/*
			== RAM(메모리) ==
		  	@379619aa --> lssmbr    
		  					id ==> "leess"
		  					pwd ==> "abcd"
		  					name ==> "이순신"
		  					email ==> "leess@naver.com" 
		  					
		  					showInfo() 메소드
		  					System.out.println("==== 회원정보 ====\n"  // \n은 줄바꿈을 해준다.
												+ "1. 아이디 : " + id +"\n"        
												+ "2. 비밀번호 : " + pwd + "\n"
												+ "3. 성명 : " + name + "\n"
												+ "4. 이메일 : " + email + "\n"
												);  
		  	@7de26db8 --> emojhmbr
		  					id ==> "emojh"	
		  					pwd ==> "qwer1234"
		  					name ==> "엄정화"
		  					email ==> "emojh@gmail.com" 
		  						  	
		 */
		
		lssmbr.showInfo();  // lssmbr 인스턴스(객체)에 대한 회원정보 출력하기
		emojhmbr.showInfo(); // emojhmbr 인스턴스(객체)에 대한 회원정보 출력하기
		
		/////////////////////////////////////////
		System.out.println("~~~~~~~~~~~~~~~~~~~~\n");
		
		lssmbr.address = "인천광역시 송도구";   //공유해버리네!
		lssmbr.showInfo(); // lssmbr 인스턴스(객체)에 대한 회원정보 출력하기
		emojhmbr.showInfo(); // emojhmbr 인스턴스(객체)에 대한 회원정보 출력하기
		
		System.out.println("###################\n");
		
		emojhmbr.address = "서울특별시 마포구";
		lssmbr.showInfo(); // lssmbr 인스턴스(객체)에 대한 회원정보 출력하기
		emojhmbr.showInfo(); // emojhmbr 인스턴스(객체)에 대한 회원정보 출력하기
		
		System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@\n");
		
		Member.address = "경기도 군포시";
		//static 변수는 클래스명.static변수명 으로 사용한다.  //이렇게 쓰는게 좋다는 소리
		
		lssmbr.showInfo();
		emojhmbr.showInfo();
		
	}

}
