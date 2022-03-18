package my.day18.c.generic;

public class Employee_Child_Executive extends Employee {
	
	String cardNo;// 법인카드번호

	public Employee_Child_Executive() {}  //기본생성자
	
	public Employee_Child_Executive(String userid, String passwd, String name, String jik,String cardNo) {
		super(userid, passwd, name, jik);  //부모클래스의 기본생성자인  public Employee() {}를 말한다.
		this.cardNo = cardNo;
	}
	
	@Override
	public String toString() {
		
		return " == 임직원 ==\n" +
			   super.toString() + 
			   "5.법인카드번호 : "+ cardNo +"\n";
	}
	
}
