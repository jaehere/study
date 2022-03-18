package my.day17.c.collection;

import java.util.*;
/*
 == ArrayList ==
 1. 출력 시 저장된 순서대로 나온다.
 2. 중복된 데이터를 저장할 수 있따.
 3. 데이터를 읽어오는 속도 : ArrayList가 LinkedList보다 상대적으로 빠르다.
 4. 순차적으로 데이터를 추가/삭제하는 경우에도 ArrayList가 LinkedList보다 상대적으로 빠르다.
 5. 일반적인 데이터 추가/삭제는 데이터 중간중간마다 발생하므로 이러한 경우에는 ArrayList가 LinkedList보다 상대적으로 느리다.
 6. 결과값은 ArrayList를 사용하든지 LinkedList를 사용하든지 동일한 결과값을 가진다.
 
 7. 결론 : LinkedList보다는 ArrayList를 사용하도록 하자!
 
 
 */


public class ArrayList_main_me {

	public static void main(String[] args) {
		// 1. Member 클래스의 객체만을 저장할 수 있는 ArrayList 객체 mbrList를 생성하시오.
		List<Member> mbrList = new ArrayList<>();
		
		// 2. Member 클래스의 객체 6개를 생성하여 mbrList에 저장하세요.
		mbrList.add(new Member("jh","1234","이재희"));
		mbrList.add(new Member("ky","1234","이경인"));
		mbrList.add(new Member("jhlee","1234","이지환"));
		mbrList.add(new Member());
		mbrList.add(new Member("jy","1234","이주엽"));
		mbrList.add(new Member("ky","1234","이경인"));
		
		 //3. mbrList에 저장되어진 모든 회원들의 정보를 출력하도록 Member클래스에 정의된 infoPrint()메소드를 실행하세요.
		//  mbrList에 저장되어진 Member객체의 개수는 mbrList.size()
		for(int i=0;i<mbrList.size();i++) {
			System.out.println(mbrList.get(i));
		}
		
		System.out.println("\n------\n");
		
		for(Member mbr : mbrList) {
			mbr.infoPrint();
		}
		
		System.out.println("\n ~~~~~~~~~[퀴즈1]~~~~~~~~~\n");
	    /*
	     [퀴즈1]
	     mbrList에 저장되어진 Member 객체들 중에서
	     id값이 "leess"인 회원만 그 회원의 정보를 출력하세요.
	     */
		boolean isFind = false;
		String id = "jy";
		for(int i=0;i<mbrList.size();i++) {
			if(id.equals(mbrList.get(i).getId())) {
				System.out.println(mbrList.get(i));
				isFind = true;
			}
		}
		if(!isFind) {
			System.out.println("못찾음");
		}
		   System.out.println("\n~~~또는~~~\n");
		   
		isFind = false;
		for(int i=0;i<mbrList.size();i++) {
			if(id.equals(mbrList.get(i).getId())) {
				mbrList.get(i).infoPrint();
				isFind = true;
			}
		}
		
		 System.out.println("\n~~~또는~~~\n");
		 isFind = false;
		 for(Member mbr : mbrList) {
			 if(id.equals(mbr.getId())) {
				 mbr.infoPrint();
				 isFind = true;
			 }
		 }
		
		 System.out.println("\n ~~~~~~~~~[퀴즈2]~~~~~~~~~\n");
		    /*
		     [퀴즈2]
		     mbrList에 저장되어진 Member 객체들 중에서
		     name이 "이"씨 인 회원만 그 회원의 정보를 출력하세요.
		     */

		 isFind = false;
		 String last_name = "이";
		 for(int i=0;i<mbrList.size();i++) {
			 if(mbrList.get(i).getName() != null &&
				mbrList.get(i).getName().startsWith(last_name)) {
				 
				 mbrList.get(i).infoPrint();
				 isFind = true;
				 
			 }
		 }
		 
		 if(!isFind) {
			 System.out.println(last_name+"으로 시작하는 이름의 회원은 없습니다.");
		 }
		
		 
		 System.out.println("\n~~~또는~~~\n");
		 
		 isFind = false;
		 last_name = "이";
		 
		 for(Member mbr : mbrList) {
			 if(mbr.getName() != null &&
				mbr.getName().startsWith(last_name)){
				mbr.infoPrint();
				isFind = true;
			 }
		 }
		 if(!isFind) {
			 System.out.println(last_name+"으로 시작하는 회원은 없소");
		 }
		 
	    // *** ArrayList 타입인 mbrList 에 새로운 Member 객체 추가시 
	    //     특정  index(위치)에 들어가도록 할 수 있다.
	    System.out.println("\n ~~~ mbrList 에 새로운 Member 객체 추가하기 ~~~ ");
	 
	    mbrList.add(new Member("sh","1234","김설현"));
	    //인덱스값 없으면 mbrList 맨뒤에 추가됨
	    mbrList.add(3, new Member("bj","1234","김부진"));
	    
	    for(Member mbr: mbrList) {
	    	mbr.infoPrint();
	    }
	    
	    // *** ArrayList 타입인 mbrList 에 저장되어진 Member 객체 삭제하기 *** 
	    System.out.println("\n ~~~ ArrayList 타입인 mbrList 에 저장되어진 Member 객체 삭제하기 ~~~ ");
	    System.out.println(">> 삭제전  mbrList.size() => "+ mbrList.size());  
	 
	    mbrList.remove(3);
	    for(Member mbr:mbrList) {
	    	mbr.infoPrint();
	    }
	    System.out.println(">> 삭제한 후 mbrList.size() => "+ mbrList.size());  
		    
	    
	    
		///////////////////////
			    
		System.out.println("\n~~~~~~~~ [퀴즈3] ~~~~~~~~~~~~\n");
		/*
		[퀴즈3]
		mbrList 에 저장되어진 Member 객체들 중에서
		name 이  "이" 씨인 회원들은 삭제하고
		삭제한 후 mbrList 에 저장되어진 Member 객체들의 정보를 출력하세요
		*/
		
		//뒤에서부터 제거해야함
		
		last_name = "이";
		
		for(int i=mbrList.size()-1;i>=0;i--) {
			if(mbrList.get(i).getName() != null &&
			   mbrList.get(i).getName().startsWith(last_name)) {
				mbrList.remove(i);
				
			}
		}
		for(Member mbr:mbrList) {
			mbr.infoPrint();
		}
			    
	    System.out.println("\n----\n");
	    
	    System.out.println("\n~~~~~~~~ [퀴즈4] ~~~~~~~~~~~~\n");
	      /*
	        [퀴즈4]
	        mbrList 에 저장되어진 Member 객체들 중에서
	         특정한 조건(id 가 null 인 것)에 만족하는 Member 객체를 하나를 삭제하고
	         삭제되어진 그 인덱스(위치)자리에 새로운 Member 객체를 넣어주기
	         그런데 만약에 id 가 null 인 것이 없다라면 새로운 Member 객체는 맨 뒤에 넣어주기
	      */   
	    
	     
	    boolean flag = false;
	    for(int i=mbrList.size()-1;i>=0;i--) {
	    	String iD = mbrList.get(i).getId();
	    	if(iD == null ) {
	    		mbrList.remove(i);
	    		mbrList.add(i,new Member("sj","1234","송서정"));
	    		flag = true;
	    		break;
	    	}
	    	
	    }
	    if(!flag) {
	    	mbrList.add(new Member("sj","1234","송서정"));
	    }
	    
	    
	    for(Member mbr:mbrList) {
	    	mbr.infoPrint();
	    }
	    
	    mbrList.clear();
	    System.out.println(mbrList.size());
	    
	    
	}//end of main----

}
