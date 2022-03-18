package my.day14.b.inheritance;

import my.day14.a.inheritance.Member;

public class NoChild_Member {
	void showInfo() {
		
		Member mbr = new Member();
//		System.out.println("ID : " + this.getId());
//		System.out.println("ID : " + super.getId());
//		System.out.println("ID : " + mbr.getId());
		//얘네는 안된다!
		
		
		//자바에서는 다중상속이 안된다. 인터페이스에서는 가능하다. 내일은 다형성을 배울거야
	}
}
