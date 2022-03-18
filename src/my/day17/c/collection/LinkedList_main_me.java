package my.day17.c.collection;

import java.util.*;

import javax.print.attribute.AttributeSetUtilities;

/*
== LinkedList == 
   1. 출력시 저장된 순서대로 나온다.
   2. 중복된 데이터를 저장할 수 있다.
   3. 데이터를 읽어오는 속도는 LinkedList 가 ArrayList 보다 상대적으로 느리다.
   4. 순차적으로 데이터를 추가/삭제하는 경우에는 LinkedList 가  ArrayList 보다 상대적으로 느리다.
   5. 일반적인 데이터 추가/삭제는 데이터 중간 중간마다 발생하므로 이러한 경우에는 LinkedList 가 ArrayList 보다 상대적으로 빠르다.    
   6. 결과값은 ArrayList 를 사용하든지 LinkedList 를 사용하든지 동일한 결과값을 가진다.
   7. LinkedList 보다는 ArrayList 를 사용하도록 하자. 
   
   == LinkedList (저장소) ==   
   
             유재석(자신의 메모리주소 1372)----(앞서존재하던객체의 메모리주소 1372)엄정화(자신의 메모리주소 3236)----(앞서존재하던객체의 메모리주소 3236)강호동(자신의 메모리주소 1034)----(앞서존재하던객체의 메모리주소 1034)이순신(자신의 메모리주소 2340)---(앞서존재하던객체의 메모리주소 2340)김태희(자신의 메모리주소 5236)   
   
   == 엄정화 를 삭제할 경우
             유재석(자신의 메모리주소 1372)----(앞서존재하던객체의 메모리주소 1372)강호동(자신의 메모리주소 1034)----(앞서존재하던객체의 메모리주소 1034)이순신(자신의 메모리주소 2340)---(앞서존재하던객체의 메모리주소 2340)김태희(자신의 메모리주소 5236)
       
   == 엄정화 를 특정 위치에 추가할 경우
             엄정화(자신의 메모리주소 7876)를 유재석 다음에 추가하고자 한다.
             유재석(자신의 메모리주소 1372)----(앞서존재하던객체의 메모리주소 1372)엄정화(자신의 메모리주소 7876)----(앞서존재하던객체의 메모리주소 7876)강호동(자신의 메모리주소 1034)----(앞서존재하던객체의 메모리주소 1034)이순신(자신의 메모리주소 2340)---(앞서존재하던객체의 메모리주소 2340)김태희(자신의 메모리주소 5236)
*/
public class LinkedList_main_me {

	public static void main(String[] args) {
		// 1. Member 클래스의 객체만을 저장할 수 있는 LinkedList 객체 mbrList를 생성하시오.
		List<Member> mbrList = new LinkedList<>();
		
		// 2. Member 클래스의 객체 9개를 생성하여 mbrList에 저장하세요.
		mbrList.add(new Member("youjs","qwer1234$","유재석"));
	    mbrList.add(new Member("eom","qwer1234$","엄정화"));
	    mbrList.add(new Member("kanghd","qwer1234$","강호동"));
	    mbrList.add(new Member("leess","qwer1234$","이순신"));
	    mbrList.add(new Member("kimth","qwer1234$","김태희"));
	    mbrList.add(new Member("kangkc","qwer1234$","강감찬"));
	    
	    mbrList.add(new Member());
	    mbrList.add(new Member("leess","qwer1234$","이순신"));
	    mbrList.add(new Member("leemh","qwer1234$","이민호"));
	   
	    //3. mbrList에 저장되어진 모든 회원들의 정보를 출력하도록 Member클래스에 정의된 infoPrint()메소드를 실행하세요.
	    //   mbrList에 저장되어진 Member 객체의 개수는 mbrList.size()로 알아본다.
//	    for(int i=0;i<mbrList.size();i++) {
//	    	System.out.println(mbrList.get(i));
//	    }
//	    
//	    
//	    //또는
//	    System.out.println("\n~~~또는~~~\n");
//	    for(Member mbr : mbrList) {
//	    	mbr.infoPrint();
//	    }
//	    
	    System.out.println("\n ~~~~~~~~~[퀴즈1]~~~~~~~~~\n");
	    /*
	     [퀴즈1]
	     mbrList에 저장되어진 Member 객체들 중에서
	     id값이 "leess"인 회원만 그 회원의 정보를 출력하세요.
	     */
	    
	    boolean isFind = false;
	    String id = "leess";
	    for(int i=0;i<mbrList.size();i++) {
	    	if(id.equals(mbrList.get(i).getId())) {
	    		mbrList.get(i).infoPrint();
	    		isFind = true;
	    	}
	    }
	    if(!isFind) {
	    	System.out.println("그런 애 없다");
	    	
	    	
	    }
	    
	    System.out.println("\n---\n");

	    for(Member mbr:mbrList) {
	    	if(id.equals(mbr.getId())) {
	    		mbr.infoPrint();
	    		isFind = true;
	    	}
	    }
	    if(!isFind) {
	    	System.out.println("그런애없다");
	    }

	    System.out.println("\n ~~~~~~~~~[퀴즈2]~~~~~~~~~\n");
	    /*
	     [퀴즈2]
	     mbrList에 저장되어진 Member 객체들 중에서
	     name이 "이"씨 인 회원만 그 회원의 정보를 출력하세요.
	     */
	    
	    isFind = false;
	    String last_name = "이";
	    
	    for(int i=mbrList.size()-1;i>=0;i--) {
	    	if(mbrList.get(i).getName() != null&&
	    			mbrList.get(i).getName().startsWith(last_name)) {
	    		mbrList.get(i).infoPrint();
	    		isFind = true;
	    	}
	    }
	    if(!isFind) {
	    	System.out.println("그런애 읍다");
	    	
	    }

// *** LinkedList 타입인 mbrList 에 새로운 Member 객체 추가시 
//     특정  index(위치)에 들어가도록 할 수 있다.
	    System.out.println("\n ~~~ mbrList 에 새로운 Member 객체 추가하기 ~~~ ");
	    
	    
	    
	    
	}//end of main----

}
