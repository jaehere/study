package my.day02.a;

import my.util.MyUtil;
//자주쓰는 util은 클래스를 따로 뺴두고 static메소드에 활용한다.
//=== static 메소드에 대해서 알아봅니다. ===
public class Main03 {

	public static void main(String[] args) {

		System.out.println("==여기는 Main03 클래스 입니다.==");
		
		//현재시각 출력
		MyUtil.currentTime();
		
	}

}
