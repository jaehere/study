package my.day16.b.Interface;

public class Rectangle implements Figure{ // 사각형

	//Rectangle이라는 클래스는 Figure 라는 인터페이스를 implements(구현, 재정의)한다는 말이다.
	
	@Override
	public double area(double x, double y) {
		return x*y;
	}
	//내가 쓰지 않더라도 빈껍데기 만은 만들어둬야함.
	@Override
	public double circleArea(double r) {
		return 0;
	}

}
