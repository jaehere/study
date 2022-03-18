package my.day18.c.generic;

import java.util.*;

// == 필드 생성 시 타입에 제한이 있거나 또는 필드 생성 시 제한이 없는 클래스 생성하기 == //

public class Box_wildCard_Employee{ 
	//  ?는 제네릭인데 아무거나  == Object
	private List<Box_Anything<?>> anything_list = new ArrayList<>();
	//						 <?>은 아무거나
	//private은 메소드를 통해 넣어준다.
	public void register_anything(Box_Anything<?> item) {
		anything_list.add(item);
		
	}
	public List<Box_Anything<?>> get_anything(){
		return anything_list;
		
	}
	
	///////////////////////////////////////
	
	private List<Box_Anything<? super Employee_Child_Executive>> executive_list = new ArrayList<>();
	// 하한제한
	//   ? super Employee_Child_Executive 은 
	// Employee_Child_Executive 부터 Employee_Child_Executive의 조상(부모의 부모의 부모...)클래스까지만 타입으로 들어올 수 있다.
	
	//register 네임같은데 빨간줄 안뜨네-> 오버로딩. 이름은 같아도 파라미터는 달라야함
	public void register_executive(Box_Anything<? super Employee_Child_Executive> item) {
		executive_list.add(item);
	}	
	public List<Box_Anything<? super Employee_Child_Executive>> get_executive() {
		return executive_list;
	}
	
		//////////////
		
	private List<Box_Anything<? extends Employee_Child_Plain>> plain_list = new ArrayList<>();
	// 상한제한
	//   ? super Employee_Child_Plain 은 
	//  Employee_Child_Plain 을 포함한 Employee_Child_Plain 의 자식클래스까지만 타입으로 들어올 수 있다. 
	
	//register 네임같은데 빨간줄 안뜨네-> 오버로딩. 이름은 같아도 파라미터는 달라야함
	public void register_plain(Box_Anything<? extends Employee_Child_Plain> item) {
		plain_list.add(item);
	
	
	}
	
	public List<Box_Anything<? extends Employee_Child_Plain>> get_plain(){
		return plain_list;
	}
	///////////////////////
	
	
}