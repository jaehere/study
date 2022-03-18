package my.day19.d.ENUM;

// 아래는 조금 전 my.day19.c.ENUM.EntranceFee_2 클래스를 enum 을 사용하여 변경한 것이다.

// >> === enum(열거형)에 멤버(field, method)추가하기 === <<
// 모든 enum(열거형)은 추상 클래스 Enum 의 자손이다. 그러므로 field 및 생성자와 method를 만들 수 있다.


public enum EntranceFee_2 {

	CHILD(0), TEENAGER(150),ADULT(300),OLD(100);  // 끝에 ; 을 붙여야 한다. 
	// !!! 사실은 열거형 상수CHILD, TEENAGER, ADULT, OLD 하나하나가 자기 자신인 EntranceFee_2 객체라는 것이다. !!!
	
	private final int FEE;
	//enum(열거형)의 인스턴스 변수는 반드시 final이어야 한다는 규칙은 없지만 
	//FEE는 열거형 상수값을 저장하기 위한 용도이므로 final을 붙인 것이다.
	
	EntranceFee_2(int fee) {
	// enum(열거형)의 생성자는 접근제한자가 private이 생략되어져 있는 것이다.
		this.FEE = fee;
	}
	
	public int getFee() {
		//외부에서 FEE 값을 읽을 수 있도록 접근제한자를 public 으로 준다.
		return FEE;
	}
	
	
}
