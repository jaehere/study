package my.day17.c.collection;

import java.util.*;

public class HashMap_main_4 {
/*
   === Map 계열 ===
   1. HashMap 과 Hashtable 이 있다.
   2. Map 계열은 List 계열(Vector, ArrayList, LinkedList)처럼 index 가 사용되어 저장되는 것이 아니라, 
      Map 계열은 key값과 value값을 쌍으로 사용하여 저장하는데  
         데이터 저장시 사용되는 메소드는 put(String key, Object value)메소드를 사용한다.
         이때 key값은 반드시 고유한 값을 가져야 하고, value값은 중복된 값이 와도 괜찮다.
   3. Map 계열에 저장된 key값들은 순서와는 상관없이 저장된다.  
   4. Map 계열에 저장된 value값을 추출하려면 key를 이용해서 가져오는데 
      value 값의 추출은 get(String key) 메소드를 사용한다. 
*/
	public static void main(String[] args) {
//		HashMap<String, Member> mbrMap = new HashMap<String, Member>();
//		또는
//		HashMap<String, Member> mbrMap = new HashMap<>();
//		또는
		Map<String, Member> mbrMap = new HashMap<>();
//		Map<K,V>
		
		mbrMap.put("youjs", new Member("youjs","qwer1234$","유재석"));
		// mbrMap 이라는 HashMap 저장소에 new Member("youjs","qwer1234$","유재석")을 저장하는데 
	    // 저장된  new Member("youjs","qwer1234$","유재석")을 찾고자 할때는 
	    // "youjs" 만 넣어주면 new Member("youjs","qwer1234$","유재석") 이 나오도록 저장하겠다는 말이다.
		
		mbrMap.put("eom", new Member("eom","qwer1234$","엄정화"));
		mbrMap.put("kanghd", new Member("kanghd","qwer1234$","강호동"));
		mbrMap.put("leess", new Member("leess","qwer1234$","이순신"));
		mbrMap.put("kimth", new Member("kimth","qwer1234$","김태희"));
		mbrMap.put("kangkc", new Member("kangkc","qwer1234$","강감찬"));
	
		
		
		
		// == mbrMap 에 저장되어진 Member 객체들중에 key 가 "leess" 인 value값(지금은 Member)을 추출해서
	    //    추출된 회원(Member)의 정보를 출력하세요.
		String id = "leess";
//		String id = "superman";
		
		Member mbr = mbrMap.get(id);
		
		if(mbr != null)
			mbr.infoPrint();
		else
			System.out.println(">> 검색하신 "+id+"에 해당하는 회원은 없습니다.<<\n");
		/*
				 == 이순신님의 회원정보 == 
				1.아이디 : leess
				2.비밀번호 : qwer1234$
				3.성명 : 이순신
		 */
		

/////////////////////////////////////////////////
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~\n");
		//해쉬맵의 기능은 덮어씌우는것이다.
		
		Member seolh_mbr_1 = new Member("seolh","qWer1234$","설현");
		Member seolh_mbr_2 = seolh_mbr_1;
		
		mbrMap.put("seolh_1", seolh_mbr_1);
		mbrMap.put("seolh_2", seolh_mbr_1);  //밸류값은 똑깥은데 키가 다르다. 키는 덮어쓰기 이기 때문에 고유한 값을 가진다.
		
		Member seolh_1 = mbrMap.get("seolh_1");
		if(seolh_1 != null) {
			seolh_1.infoPrint();
		}
		else {
			System.out.println(">> 해당하는 key 값이 존재하지 않습니다.<<\n");
		}
		Member seolh_2 = mbrMap.get("seolh_2");
		if(seolh_2 != null) {
			seolh_2.infoPrint();
		}
		else {
			System.out.println(">> 해당하는 key 값이 존재하지 않습니다.<<\n");
		}
	
		/////////////////////////////////////////////////
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		Member suji_mbr = new Member("suji","qWer1234$","배수지");
		mbrMap.put("seolh_1", suji_mbr); //똑같은 키값이 따블되었다. 덮어씌우기
		
		seolh_1 = mbrMap.get("seolh_1");
		if(seolh_1 != null) {
			seolh_1.infoPrint();
		}
		else {
			System.out.println(">> 해당하는 key 값이 존재하지 않습니다.<<\n");
		}
		
		
		seolh_2 = mbrMap.get("seolh_2");
		if(seolh_2 != null) {   //항상 널을 기억해야한다. 꼭 해주어ㅑ한다. 안그럼 익셉션 팡 떨어짐
			seolh_2.infoPrint();
		}
		else {
			System.out.println(">> 해당하는 key 값이 존재하지 않습니다.<<\n");
		}
		
		System.out.println("\n=====================\n");
		
		// === mbrMap 에 저장되어진 모든 회원들의 정보를 출력해보세요 ===//
		
		// //Map에 저장되어진 key값을 알아야 불러올 수 있음   list같은 경우는 다음다음다음 i로 index 넣어주면 됐음.
		// 1. mbrMap에 저장되어진 모든 key들을 읽어오는 첫번째 방법
		Set<String> keySets = mbrMap.keySet();
		for(String key : keySets) {
			System.out.println(key);
		}
		/* 순서 상관없이 나옴
		 	eom
			youjs
			kimth
			kangkc
			seolh_2
			kanghd
			leess
			seolh_1
		 */
		System.out.println("");
		
		for(String key : keySets) {
//			if(mbrMap.get(key) != null)  //어차피 저장되어진 key값을 불러오는거라 null값이 존재하지 안ㅇㅎ으므로 필요x
			mbrMap.get(key).infoPrint();
		}
		
		System.out.println("\n~~~~~~~~~~~~~~\n");
		// 2. mbrMap에 저장되어진 모든 key들을 읽어오는 두번째 방법
		Set<String> keySets2 = mbrMap.keySet();
		
		//Iterator 는 저장소가 아니라 Collection에 저장되어진 요소(Element)를 반복해서 읽어오는 용도로 쓰인다.
		//그래서 Iterator 를 반복자 라고도 부른다.뺑뺑이
		
		Iterator<String> iterator_key = keySets2.iterator();
		
		while(iterator_key.hasNext()) {  //do~while문이 아니라  while문으로 처음부터 조건을 본다.
			/* iterator_key.hasNext()는
			   iterator_key 에서 현재 iterator_key 가 가지고 있는 여러 String 데이터 중
			   					하나를 끄집어내서 존재하는지를 알아보는 것이다.
			   					존재하면 true, 존재하지 않으면 false 를 리턴해준다.
			   					그러므로 현재는 키의 갯수가 8개 이므로 8번 반복을 할 것이다.
			*/  // .next() : 끄집어내는 것.
			String key = iterator_key.next();
			/*
			 	실제로 키값인 String 값을 iterator_key에서 끄집어 낸다.
			 	그러면 끄집어 낸 String 값은 더 이상 iterator_key에는 남아 있지 않게 된다.
			 	
			 */
			
			System.out.println(key);
			
		}//end of while-------
		
		System.out.println("\n~~~또 한번 더 ~~~~~~~~~~~\n");
		
		while(iterator_key.hasNext()) {  //do~while문이 아니라  while문으로 처음부터 조건을 본다.
			String key = iterator_key.next();
			
			System.out.println(key);  //key값없음 다 뺏기 때문에
			
		}//end of while-------
		
		System.out.println("\n~~~다시 처음부터 해본다. ~~~~~~~~~~~\n");
		
		iterator_key = keySets2.iterator();
		
		while(iterator_key.hasNext()) {  //do~while문이 아니라  while문으로 처음부터 조건을 본다.
			String key = iterator_key.next();
			System.out.println(key);
		}//end of while-------
		
		System.out.println("\n~~~~~~~~~\n");
		
		iterator_key = keySets2.iterator();
		
		while(iterator_key.hasNext()) {  //do~while문이 아니라  while문으로 처음부터 조건을 본다.
			String key = iterator_key.next();
			System.out.println(key);
			mbrMap.get(key).infoPrint();
		}//end of while-------
		
		
		
		// == mbrMap 에 저장되어진 데이터 중 키값이 "leess"인 데이터를 삭제하세요 ===//
		System.out.println("\n~~~~~키값이 \"leess\"인 데이터를 삭제한 후~~~~\n");
		
		mbrMap.remove("leess");
		
		for(String key : keySets) {
			mbrMap.get(key).infoPrint();
		}
		
		// == mbrMap 에 저장되어진 모든 데이터를 삭제하세요 ===//
		System.out.println("\n~~~~모든 데이터를 삭제한 후~~~~\n");
		
		mbrMap.clear();
		
		for(String key : keySets) {
			mbrMap.get(key).infoPrint();
		}
		
		
		System.out.println("mbrMap.isEmpty() =>"+mbrMap.isEmpty());
		//mbrMap.isEmpty() =>true
	
	}//end of main---------

}
