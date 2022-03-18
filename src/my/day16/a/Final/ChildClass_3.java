package my.day16.a.Final;

//public class ChildClass_3 extends FinalClass_1 {  //상속불가함.
public class ChildClass_3 extends NoFinalClass_2 {
	
	void test() {
		String name = super.name;
//		super.pi = 0.234231; //super.pi는 final이므로 값 변경이 불가하다.
		double radius = 5.5;
		double circle_area = radius*radius*super.PI;
		
		System.out.println(circle_area);
		
	}

	@Override
	protected void test1() {
		System.out.println("~~안녕하세요 허허허");
	}
	
	/*
	@Override
	protected void test2() {
		System.out.println("~~안녕하세요 허허허");
	}
	*/
}
