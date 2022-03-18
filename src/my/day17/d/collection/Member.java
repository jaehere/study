package my.day17.d.collection;

import my.util.MyUtil;

public abstract class Member implements InterMember{  // 부모클래스 , 미완성클래스(추상클래스,abstract class) 를 재정의 안하겠다 -> 추상클래스
// Member를 오버라이딩 해줘야함 
	//부모클래스에서showinfo를 재정의한다해도 별로 영향 x
	
	
	// field(속성) 생성
	private String id;     // 아이디
	private String passwd; // 비밀번호
	//id와 passwd는 계속 바꿔야하기 때문에 인터페이스가 아닌 미완성으로 한거다/
	
	

	// method 생성(==> field(속성)를 어떤 방식으로 처리하고자 할때 메소드를 통해서 처리한다.)
	protected String getId() {
		return id;
	}
	
	protected void setId(String id) {
		// 아이디 (글자수가 2글자 이상 10글자 이하)
		
		if( id != null && !id.trim().isEmpty() ) {
		
			int len = id.length();
			
			if(2 <= len && len <= 10)
				this.id = id;
			else 
				System.out.println(">> [경고] 아이디는 2글자 이상 10글자 이하이어야 합니다. << \n");
		}
		else {
			System.out.println(">> [경고] 아이디는 null 또는 공백만으로 될 수는 없습니다. << \n");	
		}
		
	}
	
	protected String getPasswd() {
		return passwd;
	}
	
	
	protected void setPasswd(String passwd) {
		
		if( MyUtil.isCheckPasswd(passwd) ) 
			this.passwd = passwd;
		
		else
			System.out.println(">> [경고] 비밀번호는 8글자 이상 15글자 이하의 대,소문자 및 숫자, 특수기호가 혼합되어야만 합니다. << \n"); 		
	}
	
	
	
	//////////////////////////////////////
	
	
}
