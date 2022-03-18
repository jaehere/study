package my.day16.b.Interface;

public class Triangle implements Figure { //삼각형

	//Triangle이라는 클래스는 Figure 라는 인터페이스를 implements(구현, 재정의)한다는 말이다.
	
	@Override
	public double area(double x, double y) {
		// TODO Auto-generated method stub
		return x*y*0.5;
	}

	@Override
	public double circleArea(double r) {
		return 0;
	}

}
