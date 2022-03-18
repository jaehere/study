package my.day16.d.Interface;

import java.util.Scanner;

public interface InterController {
	//인터페이스는 목차기능을 할 수 있다.
	
	// == 메뉴를 보여주는 메소드 생성하기 == //
		void startMenu(Scanner sc, Member[] mbrArr);
		//public abstract 생략가능
		//빨간줄은 final때문 final 제거 .// interface에 만드는 미완성메소드는 반드시 재정의를 해야함. final은 재정의와 모순관계이기 때문에 빨간줄.
		
		
	// 구직자 또는 구인회사로 로그인 처리해주는 메소드 생성하기 //
		Member login(Scanner sc, Member[] mbrArr);
		//인터페이스는 접근제어자가 무조건 public abstract여야 함.
}
