package my.day18.a.generic;

import java.util.List;

public class Main_1 {

	public static void main(String[] args) {
		
		
		//Employee 만 저장할 수있는 Box_Anything 객체를 생성하자.
		Box_Anything<Employee> box_employee = new Box_Anything<>();
		box_employee.register(new Employee("leess","qwer","이순신","이사"));
		box_employee.register(new Employee("eomjh","qwer","엄정화","부장"));
		box_employee.register(new Employee("hongkd","qwer","홍길동","대리"));
		
		List<Employee> empList = box_employee.getList();
		
		for(Employee emp : empList) {
			System.out.println(emp);  //toString() 생략가능
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~\n");
		//String 만 저장할 수있는 Box_Anything 객체를 생성하자.
		Box_Anything<String> box_string = new Box_Anything<>();
		box_string.register("한석규");
		box_string.register("두석규");
		box_string.register("세석규");
		
		List<String> strList = box_string.getList();
		
		for(String str : strList) {
			System.out.println(str);
		}
		/*
		 한석규
		 두석규
		 세석규
		 */
		
		
		//Integer 만 저장할 수있는 Box_Anything 객체를 생성하자.
		Box_Anything<Integer> box_int = new Box_Anything<>();
		box_int.register(10);  //autoBOxing
		box_int.register(20);
		box_int.register(30);
		
		List<Integer> intg_list = box_int.getList();
		for(Integer intg : intg_list) {
			System.out.println(intg);
		}
		
		/*
		10
		20
		30

		 */

	}//end of main-------

}
