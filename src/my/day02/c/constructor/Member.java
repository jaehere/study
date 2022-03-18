package my.day02.c.constructor;

public class Member {

	//field , attribute, property, 속성
	String userid;
	String passwd;
	String name;
	int age;
	int point;
	//생성자(constructor) ==> 인스턴스(객체)화 할 때 상용되어지는 일종의 메소드라고 보면 된다. 메소드는 아님.. 생성자

	
	//파라미터 생성자 만들면 위에 기본생성자도 꼭 써줘야지 홍길동같은 애들이 오류없이 나타남!
	//Q.홍길동같이 나열된 애 없으면 기본생성자 안써줘도 됨? 바로 파라미터 생성자만 써도 되는건지??
	//A. Yes. 대신 웹에서는 파라미터 생성자 안써서, 홍길동 방식으로 써줘야함. 
	// 파라미터(인자)가 없는 생성자를 기본생성자(default constructor)라고 부른다.   //소괄호는 1.메소드/2.생성자
	//모든 클래스는 아래와 같이 기본생성자(default constructor)를 명기하지 않으면
	//기본생성자가 없는 것이 아니라 생략되어져 안 보일 뿐이다.
	//밑에 public Member(){ 없어도 눈에 안보이는 것 뿐 있는것이다.
	public Member() {
		System.out.println(">>> 기본생성자 Member() 이 호출됨 <<<");
		
	}
	
	// >>> 파라미터가 있는 생성자의 주목적은 필드를 초기화시켜 주는 것이다.
	// ★파라미터가 있는 생성자를 만들면 자동적으로 생략되어져 있던 기본생성자가 삭제가 되어져 버린다.★ !!!
	public Member(String userid, String passwd, String name, int age) {
			this.userid = userid;
			this.passwd = passwd;
			this.name= name;
			this.age = age;
			//this 는 자기자신 클래스인 Member 클래스를 뜻하는 것이다.  대명사 
	}

	
	//기본생성자, 파라미터생성자 둘다 사용하려면 위와 같이 기본생성자 한번 더 입력해줘야합함 삭제되니깐.
	

	
//파랑색은 멤버변수	
//밑에 userid 갈색은 지역변수
	
	// >>> 파라미터가 있는 생성자
	// ★파라미터가 있는 생성자를 만들면 자동적으로 생략되어져 있던 기본생성자가 삭제가 되어져 버린다.★ !!!
public Member(String userid, String passwd, String name, int age, int point) {
		//String userid, String passwd, String name, int age, int point을 파라미터(parameter) 또는 매개변수 또는 인자 라고 부른다. 
/*	
	this.userid  = userid;
	// 지역변수명과 필드명이 동일할 경우 지역변수명이 더 우선 하므로 모두 지역변수명으로 되어져버린다.
	//this 는 자기자신 클래스인 Member 클래스를 뜻하는 것이다.  대명사 
	this.passwd = passwd;
	this.name = name;
	
*/	
	//또는 
	
	this(userid, passwd, name, age);  // 생성자 내에서 또 다른 생성자를 호출 한 것임.  //웹에서는 파라미터 형식의 생성자 사용 못함.
	
//	this.age = age;
	this.point = point;
	
	
	System.out.println(">>> 파라미터가 있는 생성자가 호출됨 <<<");
	
	}
	
	


	


	// behavior, 행위, operation, 기능, 함수, method메소드
//behavior, 행위, 기능, 함수, method 메소드

	void showInfo() {
		
		System.out.println("=== "+ name + "님의 회원정보 ===\n"
						+ "1. 아이디 : " + userid + "\n"
						+ "2. 암호 : " + passwd + "\n"
						+ "3. 성명 : " + name + "\n"
						+ "4. 나이 : " + age + "\n"
						+ "5. 포인트 : " + point + "\n"
						);
		
		
		
	}

	// == return 타입이 void 인(없는) 메소드 호출 == //
	//static이 없으므로 필드가 instance변수
	void updatePasswd(String currentPasswd, String newPasswd) {  //메소드 생성시 void는 리턴타입이 없는 타입이다. 
		if(passwd != currentPasswd) { //현재 인스턴스의 암호인 passwd와 입력받은 currentPasswd 값이 서로 일치하지 않으면
			System.out.println(">> \""+name+"\"님 현재 사용중인 암호와 틀린 암호를 입력하셔서 암호 변경이 불가합니다.!! <<\n");
		}		// 문자열 안에 " 넣고 싶을때 \" 역슬래시와 함께 넣음.
		else { //현재 인스턴스의 암호인 passwd와 입력받은 currentPasswd 값이 서로 일치
			passwd = newPasswd;
			
			System.out.println(">> \"" +name+"\"님 암호가 성공적으로 변경되었습니다. << ");
			showInfo();
		}
	}
	
	// == return 타입이 있는 메소드 호출 == //
	// 포인트로 결제 후 포인트를 차감해주는 기능(메소드)
	// 리턴값은 결제하고 남은 포인트 잔고이다. 
	int pointPayment(int point) {
		
		int jangoPoint = this.point;
		
		
		if(this.point == 0) {
			System.out.println(">> \""+name + "\" 님 현재 포인트가 0 이므로 포인트 결제가 불가합니다!<<");
		}
		else if(this.point < point) {
			System.out.println(">> \""+name + "\" 님 현재 포인트 잔고가 부족하므로 결제가 불가합니다!<<");

		}
		else {
			System.out.println(">> \"" + name + "\" 님 " + point + "포인트 결제가 완료되었씁니다.!<<");
			jangoPoint = jangoPoint - point;
		}
		
		return jangoPoint;
		
	} // end of int pointPayment(int point)----------------------
	
	
	String memberInfo(int n){
		
		String title = "";
		
		if(n==0) {
			title = "=== " + name + "님의 회원정보 수정하기전 ===\n";
		}
		else if(n==1) {
			title = "=== " + name + "님의 회원정보 수정후 ===\n";	
		}
		
		return title
				+ "1. 아이디 : " + userid + "\n"
				+ "2. 암호 : " + passwd + "\n"
				+ "3. 성명 : " + name + "\n"
				+ "4. 나이 : " + age + "\n"
				+ "5. 포인트 : " + point;
		
		
	}// end of String memberInfo()------------
	
	String changeInfo(String passwd, int age, int point) {
	
		String before_info = memberInfo(0); //String 변경전 정보
		
		this.passwd = passwd;
		this.age = age;
		this.point = point;
		
		String after_info = memberInfo(1); // String 변경후 정보
		
		return before_info + "\n\n" + after_info;
		
				
	}//end of String changeInfo(String passwd, int age, int point)------

	//메소드의 오버로딩과 오버라이딩의 차이점에 대해서 말해보라 <== 빈출면접 질문
	
	// !!!★ 메소드의 오버로딩(overloading) !!!  중복이 없는 것?
	// 1. 메소드의 이름은 같더라도 파라미터의 개수가 다르면 다른 메소드로 취급 하므로 메소드 중복이 아니다.
	// 2. 메소드의 이름이 같고, 파라미터의 개수도 같더라도 파라미터의 데이터타입의 순서가 다르면 다른 메소드로 취급하므로 메소드 중복이 아니다.  
	// 3. 메소드의 이름이 같고,파라미터의 개수도 같고, 파라미터의 데이터타입의 순서도 같고, 단 return타입은 다를 경우라도 메소드 중복이라고 본다. 
	// 그러므로 메소드의 이름이 같지만, 메소드가 중복이 안되려면 리턴타입은 필요가 없고 오로지 파라미터가 달라야한다. 
	String changeInfo(String passwd,String name, int age, int point) {
		
		String before_info = memberInfo(0); //String 변경전 정보
		
		this.passwd = passwd;
		this.name = name;
		this.age = age;
		this.point = point;
		
		String after_info = memberInfo(1); // String 변경후 정보
		
		return before_info + "\n\n" + after_info;
		
				
	}//end of String changeInfo(String passwd,String name, int age, int point) ------



}
