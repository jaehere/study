package my.day04.b.scanner;

public class Sungjuk {

	
	
	String hakbun; //학번 "091234"
	String name; // 성명
	byte kor;  // 국어점수  byte  -128~ 127     0~100까지 제한해둠
	byte eng;   
	byte math;
	short age;  //나이   short -32768 ~ 32767   20 ~ 50 으로 제한 두기
	
//	public Sungjuk() {}  //기본생성자 생략

	//입력받은 점수가 0 ~ 100 사이의 점수인지 아닌지를 판별해주는 메소드 생성하기  <= 경우의 수 2가지 - boolean타입
	
	boolean checkJumsu(byte jumsu) {
		if( 0 <= jumsu && jumsu <= 100)  //한개라면{ 뺴도 되나  
			return true; 			
		
		
		else {  //명령이 두개이기때문에 { 필수
			System.out.println("### 점수 입력은 0 이상 100까지만 가능합니다. ###");
			return false;
		}
	
	}// end of boolean checkJumsu(byte jumsu)-----------------
	
	
	//입력받은 나이가 20 ~ 50 사이의 나이인지 아닌지 판별 메소드
	boolean checkAge(short age) {
		if (20 <= age && age <= 50)
			return true;
		else {
			System.out.println("### 나이 입력은 20 이상 50 까지만 가능합니다. ###");
			return false;
		}
		
	}// end of boolean checkAge(short age)---------------
	
	// 입력되어진 필드값을 화면에 출력해주는 메소드 생성하기
	void showInfo() {
		
		short total = (short)(kor + eng + math);  //byte short char 가 사칙연산을 만나는 순간 자동적으로 int로 싹 바뀜
		float avg = Math.round(total/3.0f*10)/10.0f;  //float은 4byte double은 8byte  평균구하는데 소숫점 길 필요 없지? 데이터 아끼게 float써
		//my.day05.a.math.MathMain 클래스 참조할 것!
	// switch문에는 byte short int char string 만 들어올 수 있음  
		
		String hakjum = "";
		
		if(avg >= 90)    	 	 hakjum = "A";
		else if(avg >= 80) 		 hakjum = "B";
		else if(avg >= 70)		 hakjum = "C";
		else if(avg >= 60) 		 hakjum = "D";
		else					 hakjum = "F";
		
		
		
		System.out.println("\n ==== "+name+" 님의 성적결과 ===== \n"
							+ "1. 학번 : " + hakbun + "\n"
							+ "2. 성명 : " + name + "\n"	
							+ "3. 국어 : " + kor + "\n"	
							+ "4. 영어 : " + eng + "\n"	
							+ "5. 수학 : " + math + "\n"
							+ "6. 총점 : " + total + "\n"	
							+ "7. 평균 : " + avg + "\n"
							+ "8. 학점 : " + hakjum  + "\n"	
							+ "9. 나이 : " + age  + "\n"	
							);
		
		
		
	}// end of void showInfo()--------------------------------

}
