package my.day02.a;

public class Main01 {

	String id; //문자열 타입
	String pwd;
	String name;
	String email;
	int age; //int는 정수 타입
	double height; //실수 타입
	double weight = 58.6; //실수 타입
	
	
	/*
    멤버변수 => instance 변수 와 static 변수를 합친것을 멤버변수라고 부른다.
 instance 변수 및 static 변수는 초기화(처음부터 값을 넣어주는 것 ex. int age = 30; )를
  하지 않더라도 자동적으로 초기화가 되어진다.
    정수형인 데이터타입(byte, short, int, long)은 자동적으로 0 으로 초기화가 되고,
    실수형인 데이터타입(float, double)은 자동적으로 0.0 으로 초기화가 되고, 
    문자형인 데이터타입(char)는 자동적으로 ' ' 으로 초기화가 되고,
 ##String 을 포함한 클래스 타입은 자동적으로 null 로 초기화가 된다.##
*/
	
//기능은 메소드
	//자바에서 소괄호가 있는 경우 두가지 1.메소드method 2.생성자cunstructor
//	static void showInfo1(){     //static
	void showInfo1() {  //static이 없으면 instance메소드
		
		int hopeMoney = 5000;  //지역변수는 반드시 초기화를 해야한다. local variable
		//지역변수는 반드시 초기화(어떤 변수에 처음부터 값을 부여해주는 것)를 해주어야 한다.!!  member변수는 자동 , 얘는 수동!
		//지역변수는 { }내에서만 사용되어지기 때문에 {}을 벗어나는 순간 지역변수는 자동적으로 메모리(RAM)에서 삭제가 되어진다.
		// 메소드 안에서만 작용하고 끝나면 소멸
 
		//String hopeMoney = "오천"  //불가해
		
		System.out.println("=== 회원정보 ===\n"
				+ "1. 아이디 : " + id + "\n"
				+ "2. 암호 : " + pwd + "\n"
				+ "3. 이름 : " + name + "\n"
				+ "4. 이메일 : " + email + "\n"
				+ "5. 나이 : " + age + "\n"    //age가 정수여도 앞에 문자열이 나왔기 때문에 이때 +는 문자열 결합
				+ "6. 신장 : " + height + "\n"
				+ "7. 몸무게 : " + weight + "\n"
				+ "8. 희망급여 : " + hopeMoney + "만원\n"
				);
		// 문자열 과 문자열 사이의 + 는 문자열결합을 뜻하는 것이고,
	    // 숫자 와 숫자 사이의 + 는 더하기(plus)를 뜻하는 것이고,
	    // 문자열 과 숫자 사이의 + 는 문자열결합을 뜻하는 것이다.
	}
	
	void showInfo2() {  //static이 없으면 instance메소드
		
		int hopeMoney = 7000;  //지역변수는 반드시 초기화를 해야한다. local variable
		//지역변수는 반드시 초기화(어떤 변수에 처음부터 값을 부여해주는 것)를 해주어야 한다.!!  member변수는 자동 , 얘는 수동!
		//지역변수는 { }내에서만 사용되어지기 때문에 {}을 벗어나는 순간 지역변수는 자동적으로 메모리(RAM)에서 삭제가 되어진다.
			// 그러므로 showInfo1()메소드 내에서 선언되어진 int hopeMoney지역변수와 
			// showInfo2() 메소드 내에서 선언되어진 int hopeMoney지역변수는 전혀 다른 것이다.
		System.out.println("=== 회원정보 ===\n"
				+ "1. 아이디 : " + id + "\n"
				+ "2. 암호 : " + pwd + "\n"
				+ "3. 이름 : " + name + "\n"
				+ "4. 이메일 : " + email + "\n"
				+ "5. 나이 : " + age + "\n"    //age가 정수여도 앞에 문자열이 나왔기 때문에 이때 +는 문자열 결합
				+ "6. 신장 : " + height + "\n"
				+ "7. 몸무게 : " + weight + "\n"
				+ "8. 희망급여 : " + hopeMoney + "만원\n"
				);
		// 문자열 과 문자열 사이의 + 는 문자열결합을 뜻하는 것이고,
	    // 숫자 와 숫자 사이의 + 는 더하기(plus)를 뜻하는 것이고,
	    // 문자열 과 숫자 사이의 + 는 문자열결합을 뜻하는 것이다.
	}
	
	public static void main(String[] args) {
//콘솔의 시작과 끝은 Main
		
		Main01 ma1 = new Main01();//인스턴스화(==객체생성)
		ma1.id = "leess";  
		ma1.pwd = "qwer1234";
		ma1.name = "이순신";
		ma1.email = "leess@naver.com";
		ma1.age = 25;   //int 타입이기 때문에 문자열""에 숫자를 가두지 않는다.
		
		ma1.showInfo1();
		
		System.out.println("\n~~~~~~~~~~~~~~~~\n");
		
		Main01 ma2 = new Main01();//인스턴스화(==객체생성)
		ma2.showInfo1();
		
		System.out.println("\n~~~~~~~~~~~~~~~~\n");
		
		ma2.showInfo2();
/*		
		//인스턴스에 할당되었던 메모리 공간을 비워야 한다.
		ma1 = null;
		ma2 = null;
		System.gc();  //가비지컬렉터Garbage Collector (쓰레기 수집)
*/
/*		위의 인스턴스에 할당되었던 메모리 공간을 비우는 것과
		Garbage Collector(쓰레기 수집)를 하는 작업을 기술할 필요가 없다.
		왜냐하면 프로그램이 종료되는 순간 , 이런작업이 자동적으로 해주기 때문이다.
		작업을 안해도 jvm이 자동적으로 이루어지기 때문에 안해도 됨
*/
		
		
//		int hakbun = 01234;  8진수로 인식해버림
		String hakbun = "012345";
		System.out.println("hakbun : "+ hakbun);
		
	}

}
