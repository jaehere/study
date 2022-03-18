package my.day12.a.encapsulation;

public class Sungjuk_noncapsule {
	
	//필드에 private이 없다. 밖에서 막 치고 들어와. 이젠 이렇겐느 안한다. capsule로 private해서 쉴드를 쳐줌. if로
	
	String name;
	int kor;
	int eng;
	int math;
	
	boolean isCheckJumsu(int jumsu) {
		if(0 <= jumsu && jumsu <= 100) {
			return true;
		}
		else
			return false;
	}
	
	
	void showSungjuk() {
		System.out.println("1.성명 : "+ name+ "\n"
						  +"2.국어 : " + kor + "\n"
						  +"3.영어 : " + eng + "\n"
						  +"4.수학 : " + math + "\n"
						  );
		
	}
	
	
}
