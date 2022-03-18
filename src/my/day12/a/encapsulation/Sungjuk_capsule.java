package my.day12.a.encapsulation;

public class Sungjuk_capsule {
/*
    -----------------------------------------------------------------------------------------------------------------------
   접근제한자(접근지정자, accessmodifier)   자기자신클래스내부      동일패키지에있는다른클래스      다른패키지에있는하위(자식)클래스        그외의영역  
   ----------------------------------------------------------------------------------------------------------------------- 
   public    (초록색)                          O                    O                         O                 O  
   protected (노랑색)                          O                    O                         O                 X
   default                                   O                    O                         X                 X
   private                                   O                    X                         X                 X
*/
	
	//private  이 필드가 선언된 자기 자신 내부(요 클래스)에서만 접근이 가능함. 
	//getter setter  는 필드 만들어주고 상단바 Source에서 전체선택해서 만들수있음
	
	private String name;
	private int kor = -1;
	private int eng = -1;
	private int math = -1;
	
	static int count;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null || name.trim().isEmpty()) {  //스캐너에서 엔터는 null이 아님 / =null; 이게 널임.
			System.out.println(">> [경고] 입력하신 성명이 null 또는 공백만으로 이루어지면 안되며 성명은 null로 되어집니다.  <<\n");
		}
		else {
			this.name = name;  //디폴트값 -1
		}
		
	}
	
	
	public void setKor(int kor) { //셋터라고 부름
		if( 0 <= kor && kor <= 100) {
			this.kor = kor;
		}
		else {
			System.out.println(">> [경고] 입력하신 국어점수 "+ kor +"는 0 이상 100 이하가 아니므로 국어점수는 -1으로 되어집니다.  <<\n");
		}
			
		
	}
	
	
	
	public int getKor() {  //겟터라고 부름
		return kor;
	}
	
	
	
	

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if( 0 <= eng && eng <= 100) {
			this.eng = eng;
		}
		else {
			System.out.println(">> [경고] 입력하신 영어점수 "+ eng +"는 0 이상 100 이하가 아니므로 영어점수는 -1으로 되어집니다.  <<\n");
		}
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if( 0 <= math && math <= 100) {
			this.math = math;
		}
		else {
			System.out.println(">> [경고] 입력하신 수학점수 "+ math +"는 0 이상 100 이하가 아니므로 수학점수는 -1으로 되어집니다.  <<\n");
		}
	} //end of public void setMath(int math)------------
	
	
	public boolean isPass() {  //instance method 
		
		if(name == null || kor == -1 || eng == -1 || math == -1) {
			return false;  //통과가 안되어진거야
		}
		else
			return true;
		
		
	}//end of public boolean isPass()-------------
	

	public void showSungjuk() {
		System.out.println("1.성명 : "+ name+ "\n"
						  +"2.국어 : " + kor + "\n"
						  +"3.영어 : " + eng + "\n"
						  +"4.수학 : " + math + "\n"
						  );
		
	}
	
}
