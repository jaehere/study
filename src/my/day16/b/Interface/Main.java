package my.day16.b.Interface;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle();
		Triangle tri = new Triangle();
		Circle cir = new Circle();
		
		
		// == 다형성(Polymorphism) == //
	    // ==> 자식클래스로 생성되어진 객체를 부모클래스의 타입으로 받을 수 가 있다.
	    // ==> 암기 !!@ 특정한 인터페이스로 구현된 클래스의 객체는 특정한 인터페이스의 타입으로 받을 수 가 있다. 

//		Figure fg = new Figure();  //오류 !!  //미완성메소드가 있으면 클래스를 interface화 할 수 없다.
		
		Figure fg1 = new Rectangle();
		Figure fg2 = new Triangle();
		Figure fg3 = new Circle();
		// ==> 암기 !!@ 특정한 인터페이스로 구현된 클래스의 객체는 특정한 인터페이스의 타입으로 받을 수 가 있다. 
		
		System.out.println("가로 4, 세로 5인 사각형의 넓이 => "+ fg1.area(4, 5));
		//가로 4, 세로 5인 사각형의 넓이 => 20.0
		System.out.println("밑변 4, 높이 5인 삼각형의 넓이 => "+ fg2.area(4, 5));		
		//밑변 4, 높이 5인 삼각형의 넓이 => 10.0
		System.out.println("반지름이 4인 원의 넓이 => "+ fg3.circleArea(4));
		//반지름이 4인 원의 넓이 => 50.265472
		
		System.out.println("\n~~~~~~~~~\n");
		
		Figure[] fgArr = new Figure[3];
//		fgArr[0] = fg1;
//		fgArr[1] = fg2;
//		fgArr[2] = fg3;
//또는
		fgArr[0] = new Rectangle();
		fgArr[1] = new Triangle();
		fgArr[2] = new Circle();
		
		
		
		//확장 for문
		for(Figure fg : fgArr) {
			if(fg instanceof Circle )
				System.out.println(fg.circleArea(4));
			else
				System.out.println(fg.area(4, 5));
		}
		
		//면접질문 ! //미완성클래스(추상클래스)와 인터페이스 중 미완성메소드가 어느게 더 많으냐 -> 인터페이스!
		//
		
	}//end of main(String[] args)--------------

}
