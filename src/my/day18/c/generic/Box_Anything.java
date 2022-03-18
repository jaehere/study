package my.day18.c.generic;

import java.util.*;

// == 타입에 제한이 없는 제네릭 클래스 == //

public class Box_Anything<T> { // 클래스 이름 다음에 제네릭 타입 T 를 선언한다.
							   // T는 type이라는 뜻으로 쓴 것으로서, T 대신에 아무 글자가 와도 괜찮다.
							   // 제네릭 타입 T의 뜻은 Box_Anything 클래스에서 선언되어지는 필드의 타입과 메소드의 파라미터 및 리턴타입에서 
							   // 어떤 클래스라도 타입으로 들어올 수 있다는 것이다.
	//필드가 저장소
	private List<T> list = new ArrayList<>();  //초기화작업
	//private List<M> list = new ArrayList<M>();   <>에 똑같이 들어옴 
	
	//getter setter로 가져옴
	public List<T> getList() {
		return list;
	}

	  //이미 초기화를 해준거니 set은 없애줌
	public void register(T item) {
		list.add(item);
	}
}
