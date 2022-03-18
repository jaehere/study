package my.day18.c.generic;

public class Employee_Child_Plain_Child extends Employee_Child_Plain{
	int month; //계약기간개월수

	public  Employee_Child_Plain_Child() {}  //기본생성자
	
	public  Employee_Child_Plain_Child(String userid, String passwd, String name, String jik,int salary, int month) {
		super(userid, passwd, name, jik,salary);  //부모클래스의 기본생성자인  public Employee() {}를 말한다.
		this.month = month;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + 
			   "6.계약개월수 : "+ month +"개월\n";
	}
}
