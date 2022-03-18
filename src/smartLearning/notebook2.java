package smartLearning;

import java.util.Calendar;
import java.util.Random;

public class notebook2 {

	public static void main(String[] args) {
		
		String s1;  //초기화 되지 않음
		String s2 = "";
		String s3 = null;
		
	
//		if(s1 == null) System.out.println("true");
		
		System.out.println(s2=="");
		System.out.println(s3==null);
		
		
		
		Random r = new Random();
		for(int i=0;i<5;i++) 
			System.out.println(r.nextInt(100)); //0부터 99사이의 랜덤한 값
		for(int i=0;i<5;i++)
			System.out.println(r.nextDouble());  //0.0~1.0 사이의 실수값 1.0은 불포함
		
		//Math클래스는 거의 Static은 객체생성 없이 바로 사용 가능한 

		Calendar now = Calendar.getInstance(); //컴터의 값을 가져와야 하기때문에 new연산자 사용하지x
		char[] dow = {' ', '일','월','화','수','목','금','토'};
		String[] ap = { "AM","PM"};
		
		String result = "Today : ";
	
		result += now.get(Calendar.YEAR) + "년 "
				+now.get(Calendar.MONTH) + "월 "
				+now.get(Calendar.DATE) + "일("
				+dow[now.get(Calendar.DAY_OF_WEEK)]+")";
		System.out.println(result);
		
		
		
	}//end of main----------

}
