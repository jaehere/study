package my.day02.b.dataType;

public class Sungjuk {
	
	/*
	   === *** 자료형 *** ===

	       ※ 자료형의 종류

	   1. 원시형 타입(Primitive Type)

	   1.1  정수형(byte, short, int, long)
	    -- 자바에서 정수형의 기본타입은 int 이다.
	     -- 그러므로 정수형의 값이 -2,147,483,648 ~ 2,147,483,647 범위를 벗어난 것이라면 반드시 숫자뒤에 소문자 l 또는 대문자  L 을 붙여야 한다.  
	            
	      byte (1byte == 8bit)  : -2^7(-2의 7승)  ~ 2^7-1(2의 7승 -1)  ==> -128 ~ 127 
	      short(2byte == 16bit) : -2^15 ~ 2^15-1 ==> -32,768 ~ 32,767
	      int  (4byte == 32bit) : -2^31 ~ 2^31-1 ==> -2,147,483,648 ~ 2,147,483,647  
	      long (8byte == 64bit) : -2^63 ~ 2^63-1 ==> -9,223,372,036,854,775,808 ~  9,223,372,036,854,775,807         
	            
	   
	   1.2 실수형(float, double) 
	       float(4byte)  : 단정밀도   소수점이하 7자리까지 표현됨.   135.3246235
	      double(8byte) : 배정밀도   소수점이하 15~16자리까지 표현됨. 135.3246234502345642
	    -- 자바에서 실수형의 기본타입은 double 이다. 
	      그러므로 실수값을 float 형태로 나타내기 위해서는 실수뒤에 반드시 소문자 f 또는 대문자 F를 붙여야 한다. 
	            
	        
	   1.3 문자형(char) : 글자 한개
	      char : 자바는 유니코드 체계를 사용하므로
	             문자형 타입인 char 는 2byte 이며, 범위는 0 ~ 65535 이다.
	             그래서 char 타입에는 문자 1개 또는 숫자(0~65535)도 올 수 있다.              
	                               
	           UNICODE 표 참조 //16진수방식
	           http://www.tamasoft.co.jp/en/general-info/unicode.html                     
	        
	        === !!! 꼭 기억합시다 !!! ===
	        int(4byte) 아래의 크기인  byte(1byte), short(2byte), char(2byte) 타입이 
	             사칙연산(+ - * /)을 만나면 자동적으로 int 타입으로 자동 형변환이 발생된다.
	        
	        'A' => 65     'a' => 97
	        'B' => 66     'b' => 98
	        'C' => 67     'c' => 99
	        
	        '대문자' + 32 => 소문자에 해당하는 숫자
	        '소문자' - 32 => 대문자에 해당하는 숫자
	        
	        '0' => 48
	        '1' => 49
	        '2' => 50
	        '9' => 57
	        ' ' => 32
	        
	        
	   1.4 참(true) 또는 거짓(false)을 담아주는 boolean 타입 
	   -- 크기가 1byte 이다.
	        
	           
	   2. 참조형 타입(Reference Type)
	      --> 클래스 객체(==object ==instance) 타입   
	      --> 메모리상에 저장되어진 객체의 메모리 주소를 참조하는 것이다.
	      --> 참조형 타입(Reference Type) 메모리상에 크기는 4byte 를 차지한다.  

	           
	 */
	
	//==속성, property, attribute, field ===//
	/*
	  	=== 변수의 명명규칙 === 
		1. 변수명의 길이에는 제한이 없다.
		2. 대,소문자 구분이 있다.
		3. 첫글자는 숫자는 안된다.
		4. 특수문자는 '_' 와 '$'만 사용이 가능하다.
		5. 예약어(ex. package, import, public, class, String, int, float ...)는 변수명으로 사용불가하다.
		6. 필수사항은 아니지만 변수명명규칙의 관례인데, 카멜표기법과 스네이크표기법을 따른다.
	 */

	String hakbun; // 학번 null  "12345"  "20191234"  "091234"   "013456"
	//int hakbun; 은 번포표기할때 앞자리 0이 생략되는 경우가 발생하므로, String으로 함.
		//데이터값이 숫자로만 이루어지더라도 맨 앞에 0이 올 수 있는 경우라면,
		//String 타입으로 해야한다.
	String name; //학생명 null 
		
	byte korPoint; //국어점수 0  카멜표기법 : 단어와 단어가 결합된 경우이라면 두번째 단어는 대문자로 시작하도록 하는 것. 
	byte eng_point; //영어점수 0 스네이크 표기법 : 단어와 단어가 결합된 경우이라면 단어 사이에 _를 붙여주는 것.
	byte mathpoint; //수학점수 0 대문자로 시작하면 클래스랑 헷갈릴 수 있으니 왠만하면 소문자로 시작하는 것이 좋음.
	//long mathpoint = 4000000000L;
	
	char hakjum; // 학점 default로 ' '공백이 들어감. 'A' 'B' 'C' 'D' 'F'

	//=== 기능, 행위, behavior, method ===//
	// 성적결과를 화면에 출력해주는 메소드(기능)를 만들고자 한다.
	
	void showSungjuk() {
		
		short total = (short)(korPoint + eng_point + mathpoint);  // 0 ~ 300  byte는 -128~ 127까지임
		//자바에서 그 데이터 타입이 byte 또는 short 또는 char 인 변수가 사칙연산(+ - * /)을 만나면 
	      // 자동적으로 그 변수의 데이터 타입은 int 로 변하게 되어있다.!!!!
		// korPoint + eng_point + mathpoint ==> 자동적으로 int타입으로 형변환 (casting)됨
		// (short)(korPoint + eng_point + mathpoint) ==> int타입을 강제로 short타입으로 형변환(casting) 시킨것. 강제형변환(casting)이라고 부른다.
		
		//double avg = total/3; //   정수 /정수 ==> 정수(몫)
		//double avg = total/3.0;  //   정수/실수 ==> 실수 ,
								 //   실수/정수 ==> 실수 
								 //   실수/실수 ==> 실수  ,,분자나 분모 중에 한개만 실수이면 됨
		
		double avg_double = (double)total/3;
		float avg_float = (float)total/3;
		
//		float avg_float2 = total/(float)3.0;
		float avg_float2 = total/3.0f;
		
		
		double avg_double2 = total/3.0f;
		//double avg_double = (double)(total/3);   // 이렇게하면 안됨. ! 정수가 된 상태에서 실수가 되면 그저 87.0 점영만 붙음
		
		//if(조건)
		if(avg_double >= 90) {
			hakjum = 'A';  //"A"는 String 타입, 'A'는 char타입
		}
		else if(avg_double >= 80) {
			hakjum = 'B';
		}
		else if(avg_double >= 70) {
			hakjum = 'C';
		}
		else if(avg_double >= 60) {
			hakjum = 'D';
		}
		else {
			hakjum = 'F';
		}
		
		
		String star = "";
		
		switch (hakjum) {   //switch는 등호밖에 못씀
			case 'A':
				star = "☆☆☆☆☆";
				break;// switch문을 빠져나오는 것이다.
			case 'B':
				star = "☆☆☆☆";
				break;// switch문을 빠져나오는 것이다.
			case 'C':
				star = "☆☆☆";
				break;// switch문을 빠져나오는 것이다.
			case 'D':
				star = "☆☆";
				break;// switch문을 빠져나오는 것이다.
			default :
				star = "☆";
				break;
		}
		
		
		String diamond = "";
		switch ((total/3)/10*10) {  //300/3 299/3    288/3   270/3 
								  // 100   99       96      90
								  // 100/10 99/10  96/10   90/10
								  //  10    9        9       9
		// 주의할 점은 switch(어떤식)에서 어떤식에는 byte, short, int, char, String 타입만 들어올 수 있다.
		//    위의 어떤식에는 long, float, double 이 들어올 수 없다 !  실수형은 No! 
			case 100:	
//				diamond = "◆◆◆◆◆";
//				break;
			case 90:
				diamond = "◆◆◆◆◆";
				break;
			case 80:
				diamond = "◆◆◆◆";
				break;
			case 70:
				diamond = "◆◆◆";
				break;
			case 60:
				diamond = "◆◆";
				break;
			default:
				diamond = "◆";
				break;
			}
		
		
		//선생님이 하신거
//		String diamond = "";
//		switch ((total/3)/10) {  //300/3 299/3    288/3   270/3 
//								  // 100   99       96      90
//								  // 100/10 99/10  96/10   90/10
//								  //  10    9        9       9
//		// 주의할 점은 switch(어떤식)에서 어떤식에는 byte, short, int, char, String 타입만 들어올 수 있다.
//		//    위의 어떤식에는 long, float, double 이 들어올 수 없다 !  실수형은 No!
		//정수형 중에는 int만 되고 long은 안되는 거임
//			case 10:	
////				diamond = "◆◆◆◆◆";
////				break;
//			case 9:
//				diamond = "◆◆◆◆◆";
//				break;
//			case 8:
//				diamond = "◆◆◆◆";
//				break;
//			case 7:
//				diamond = "◆◆◆";
//				break;
//			case 6:
//				diamond = "◆◆";
//				break;
//			default:
//				diamond = "◆";
//				break;
//			}
//		
		
		
		char ch1 = 'k';
		char ch2 = 107;
//		char ch3 = 'k'+1;  //107+1 = 108 ==> l
		char ch3 = 'k'+2;  //107+2
		// char타입에 사칙연산(+-*/)이 붙으면 자동적으로 char타입은 int타입으로 변경된다.
		//그런애들은 3가지: char byte short ==> int
		char ch4 = '\u23F3';   // \\u 유니코드를 뜻한다
		//역슬래시하고 u했더니 오류가 뜨네? 검색해보기 이스케이프 문장?
		
		
		// === boolean 타입 === //
		boolean bool_1 = false;  //true ==> 참, false거짓
		
		boolean bool_2 = (5-3 == 4);  //false
		
		boolean bool_3 = (5-3 != 4);  // != : 같지않다
		
		
		System.out.println("=== "+ name + " 성적결과 ===\n"
				+"1. 학번 : " + hakbun + "\n"
				+"2. 성명 : " + name + "\n"
				+"3. 국어 : " + korPoint + "\n"
				+"4. 영어 : " + eng_point + "\n"
				+"5. 수학 : " + mathpoint + "\n"
				+"6. 총점 : " +  total + "\n"
				+"7. 평균 : " +  avg_double + "\n"
				+"8. 평균 : " +  avg_float + "\n"
				+"9. 평균 : " +  avg_float2 + "\n"
				+"9-1. 평균 : " +  avg_double2 + "\n"
				+"10. 학점1 : " +  hakjum + "\n"
				+"11. 학점2(☆) : " +  star + "\n"
				+"12. 학점3(◆) : " +  diamond + "\n"
				+"소문자 k :  " + ch1 + "\n"
				+"소문자 k :  " + ch2 + "\n"
				+"소문자 m :  " + ch3 + "\n"
				+"모래시계 : "+ ch4 + "\n"
				+"boolean 타입인 bool_1 : " + bool_1 +"\n"
				+"boolean 타입인 bool_2 : " + bool_2 +"\n"
				+"boolean 타입인 bool_3 : " + bool_3 +"\n"
				);
		
	}

}
