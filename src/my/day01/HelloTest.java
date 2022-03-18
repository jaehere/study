package my.day01;

import java.util.Date;

//import java.lnag.*; // 기본적으로 생략되어져 있다.
public class HelloTest {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		System.out.println("안녕하세요~~");
		
//		java.util.Date now = new java.util.Date();   // import를 할 필요가 없는 경우
		Date now = new Date();  // import를 해야 할 경우
		System.out.println("현재시각 : "+ now);
	}

}
