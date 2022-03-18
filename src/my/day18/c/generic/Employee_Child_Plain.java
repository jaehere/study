package my.day18.c.generic;

public class Employee_Child_Plain extends Employee{
	int salary; //연봉

	public  Employee_Child_Plain() {}  //기본생성자
	
	public  Employee_Child_Plain(String userid, String passwd, String name, String jik,int salary) {
		super(userid, passwd, name, jik);  //부모클래스의 기본생성자인  public Employee() {}를 말한다.
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		
		return " == 일반직원 ==\n" +
			   super.toString() + 
			   "5.연봉 : "+ salary +"만원\n";
	}
}
