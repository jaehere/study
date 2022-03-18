package my.day0809.c.array;

public class Member {

	// field
	String id;
	String passwd;
	String name;
	int point;  //그 인스턴스만 쓰는것
	
	static int count = 2; //공용  //원래는 0명이여야하는데 2명의 정보를 넣었기 때문에 start값이 2가 나오게 하기 위해ㅓ 
	
	
	//method
	//특정사용자의 개인정보를 보여주도록 하는 메소드
	public String showMyInfo() {
		return "1.아이디 : "+id+"\n"
			 + "2.비밀번호 : "+passwd+"\n"
			 + "3.성명 : "+name+"\n"
			 + "4.포인트 : "+point;
	}
	//모든사용자의 비밀번호를 제외한 개인정보를 보여주도록 하는 메소드 
	public String showInfo() {
		return id + "\t" + name + "\t"+point;
			  
	}
	
	
	
}
