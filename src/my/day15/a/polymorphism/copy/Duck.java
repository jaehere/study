package my.day15.a.polymorphism.copy;

public class Duck extends Animal{
	// Duck 만 가지는 field 정의(추상화)
	private int price;
	
	
    // Duck 만 가지는 method 정의(추상화)
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price > 0)
			this.price = price;
	}

	@Override
	public void cry() {
		System.out.println("오리 "+getName()+"는 '꽥꽥'하고 말합니다.");
	}

	@Override
	public void showInfo() {
		System.out.println("=== 오리 \""+getName()+"\" 정보 ===\n"
				 + "1.성명 : "+ super.getName() + "\n"
				 + "2.생년 : " + getBirthYear() + "년 " + "\n"
				 + "3.가격 : "+ price +"원\n"
				 );
	}
//	메소드이름 똑같고 파라미터 똑같은데 리턴타입 다르다 ? 
	//메소드 오버라이딩 은 상속!관계 자식클래스에서 상속받은 부모클래스의 메소드를 접근제한자나 더 큰범위로 바꿔주고 알맹이만 바꿔주는 것임.
	
	public void swim() {
		System.out.println("오리 "+getName()+"가 물가에서 헤엄을 칩니다.");
	}
	
	
}
