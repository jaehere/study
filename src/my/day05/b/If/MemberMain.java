package my.day05.b.If;

public class MemberMain {

	public static void main(String[] args) {
		
		Member mbr1 = new Member();
		mbr1.id = "leess";
		mbr1.name = "이순신";
		mbr1.nickName = new String("장군");
		
		Member mbr2 = new Member();
		mbr2.id = "eomjh";
		mbr2.name = "엄정화";
		mbr2.nickName = new String("가수");
		
		Member mbr3 = new Member();
		mbr3.id = "leess";
		mbr3.name = "이순신";
		mbr3.nickName = new String("장군");
		
		//new new new를 해왔기 때문에 , 메모리 주소 id 다 다름.
		
		if(mbr1 == mbr2) {
		// 인스턴스(객체)와 인스턴스(객체)를비교(==)할때는 메모리상에 올라가 있는 인스턴스(객체)의 메모리 주소를 비교하는 것이다.
			System.out.println("인스턴스 mbr1 과 인스턴스 mbr2 는 동일한 메모리 주소를 참조하고 있습니다.");
		}
		else if(mbr1 == mbr3) {
			System.out.println("인스턴스 mbr1 과 인스턴스 mbr3 는 동일한 메모리 주소를 참조하고 있습니다.");
		}
		else {
			System.out.println("인스턴스 mbr1 과 인스턴스 mbr2와 인스턴스 mbr3은 모두 다른 메모리 주소를 참조하고 있습니다.");
		}
		
		System.out.println("\n--------------\n");
		
		String passwd_1 = new String("abcd");
		String passwd_2 = new String("abcd");
		
		if(passwd_1 == passwd_2) {
		// 인스턴스(객체)와 인스턴스(객체)를비교(==)할때는 메모리상에 올라가 있는 인스턴스(객체)의 메모리 주소를 비교하는 것이다.
			System.out.println("passwd_1 과 passwd_2 는 동일한 메모리 주소를 참조하고 있습니다.");
		}
		else {
			System.out.println("passwd_1 과 passwd_2 는 서로 다른 메모리 주소를 참조하고 있습니다.");
		}
//-----new의 차이
		System.out.println("\n--------------\n");
		
		String passwd_3 = "abcd";
		String passwd_4 = "abcd";
		
		if(passwd_3 == passwd_4) {
		// 이떄의 passwd_3 == passwd_4 은 
		//	passwd_3에 저장된 값("abcd")과 passwd_4에 저장된 값("abcd")을 비교하는 것이다.  
			System.out.println("passwd_3 과 passwd_4 는 동일한 값을 가지고 있습니다.");
		}
		else {
			System.out.println("passwd_3 과 passwd_4 는 서로 다른 값을 가지고 있습니다.");
		}
		
		System.out.println("\n--------------\n");
		
		mbr1.showInfo();
		mbr2.showInfo();
		mbr3.showInfo();
		
		
		
		if(mbr1.name == mbr2.name) {
			System.out.println(mbr1.name + " 와 " + mbr2.name +" 은 같습니다.");
		}
		else {
			System.out.println(mbr1.name + " 와 " + mbr2.name +" 은 같지 않습니다.");
		}
		
		
		if(mbr1.name == mbr3.name) {
			System.out.println(mbr1.name + " 와 " + mbr3.name +" 은 같습니다.");
		}
		else {
			System.out.println(mbr1.name + " 와 " + mbr3.name +" 은 같지 않습니다.");
		}
//		new를 해오면  값을 비교한느게 아니라 메모리상의 주소를 비교함. 그래서 값은 같아도 메모리상 주소가 다르다.
//		값을 넣엇느냐 인스턴스(객체)를 넣었느냐가 중요해 
		
		if(mbr1.nickName == mbr2.nickName) {
			System.out.println(mbr1.nickName + " 와 " + mbr2.nickName +" 은 같습니다.");
		}
		else {
			System.out.println(mbr1.nickName + " 와 " + mbr2.nickName +" 은 같지 않습니다.");
		}
		
		if(mbr1.nickName == mbr3.nickName) {
			System.out.println(mbr1.nickName + " 와 " + mbr3.nickName +" 은 같습니다.");
		}
		else {
			System.out.println(mbr1.nickName + " 와 " + mbr3.nickName +" 은 같지 않습니다.");
		}
		
//		그래서 String 타입의 값을 비교하기 위해서 .equrals를 사용함
		
		System.out.println("\n-------문자열 값을 비교시 .equals() 메소드를 사용하자 -------\n");
		//문자열.equals()
		if(mbr1.name.equals(mbr2.name)) {
			System.out.println(mbr1.name + " 와 " + mbr2.name +" 은 같습니다.");
		}
		else {
			System.out.println(mbr1.name + " 와 " + mbr2.name +" 은 같지 않습니다.");
		}
		
		
		if(mbr1.name.equals(mbr3.name)) {
			System.out.println(mbr1.name + " 와 " + mbr3.name +" 은 같습니다.");
		}
		else {
			System.out.println(mbr1.name + " 와 " + mbr3.name +" 은 같지 않습니다.");
		}
		
		
		
		if(mbr1.nickName.equals(mbr2.nickName)) {
			System.out.println(mbr1.nickName + " 와 " + mbr2.nickName +" 은 같습니다.");
		}
		else {
			System.out.println(mbr1.nickName + " 와 " + mbr2.nickName +" 은 같지 않습니다.");
		}
		
		if(mbr1.nickName.equals(mbr3.nickName)) {
			System.out.println(mbr1.nickName + " 와 " + mbr3.nickName +" 은 같습니다.");
		}
		else {
			System.out.println(mbr1.nickName + " 와 " + mbr3.nickName +" 은 같지 않습니다.");
		}
		
	}

}
