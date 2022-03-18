package my.day15.b.abstractClass;

public class Dog extends Animal {
	// Dog 만 가지는 field를 정의(추상화)
	private int weight;

	//Dog 만 가지는 method를 정의(추상화 -필요한 것만 땡겨오는거)
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if(weight > 0)
			this.weight = weight;
	}
	//왜 몸무게는 public을 쓰는지? 제대로 이해 못함

	


	// == 메소드 오버라이딩(override)(메소드 재정의) == //
	//오버라이딩은 새롭게 바꾸는게 아니라 부모클래스로부터 물려받은 것을 새롭게 바꾸는 것이다. 
	//메소드 오버라이딩(메소드 재정의)란?
	//=> 부모클래스로 부터 상속받은 메소드를 내용물만 새롭게 바꾸어서 정의하는 것을 말한다.
	// 메소드오버라이딩(override)시 접근제한자는 부모클래스에서 주었던 접근제한자와 같거나 또는 더 크게 허용하는 접근제한자만 가능하다.					
	//대부분 public
	
	@Override   // @로 되어진 것을 "어노테이션","애노테이션"이라 부른다.  이걸 뺴주면 검증을 못받음.
	public void cry() {  //protected와 같던지 범위가 더 커야함 (public 이 가능하다)
						//		super.cry();  //super == Animal  부모클래스에 있는 cry를 호출하겠다 
		
		
		          		//다른 곳에서 돌리기에는 public이 좋은데 지금 부모클래스랑 protected
		
		System.out.println("강아지 "+ this.getName() +"가 '멍멍'하며 짖습니다.");
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("3.체중 :"+ weight + "kg\n");
	}
	

	@Override
	public void move() {
		System.out.println("강아지 "+getName()+"가 빠르게 달립니다.");
		
	}
	
	
}
