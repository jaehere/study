package my.day18.c.generic;

public class Employee {
	//원래 겟터셋터 프라이빗인데 귀찮으니 디폴트로 해왔다.
	   String userid;  // 아이디
	   String passwd;  // 암호
	   String name;    // 사원명
	   String jik;     // 직급 
	   
	   public Employee() {}
	   
	   public Employee(String userid, String passwd, String name, String jik) {
	      this.userid = userid;
	      this.passwd = passwd;
	      this.name = name;
	      this.jik = jik;
	   }
	   
	   @Override
	   public String toString() {  //toString() 재정의, Object클래스에서 재정의 해온다.
	      
	      return "1.아이디: "+userid+"\n"+
	            "2.비밀번호: "+passwd+"\n"+
	            "3.성명: "+name+"\n"+
	            "4.직급: "+jik+"\n";
	   }
}
