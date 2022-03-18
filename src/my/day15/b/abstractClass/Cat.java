package my.day15.b.abstractClass;

public class Cat extends Animal{
	// Cat 만 가지는 field 정의(추상화)
	private String color;  //color는 고양이만 가진다고 하자

	
	//Cat만 가지는 method를 정의(추상화)
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if(color != null && !color.trim().isEmpty())
			this.color = color;
	}
	
	// == 메소드 오버라이딩(override)(메소드 재정의) == //
	@Override
	public void cry() {
		System.out.println("고양이 "+getName()+"는 '야옹'하며 웁니다.");
	}

	@Override
	public void showInfo() {
		System.out.println("=== 고양이정보 ===\n"
				 + "1.성명 : "+ super.getName() + "\n"
				 + "2.생년 : " + getBirthYear() + "년 " + "\n"
				 + "3.피부색 : "+color +"\n"
				 );
	}
	
	

	@Override
	public void move() {
		System.out.println("고양이 "+getName()+"이 점프를 합니다.");
		
	}
	
	
}
