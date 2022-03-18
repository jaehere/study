package my.day11.d.abstraction;

import java.util.Scanner;

import my.util.*;

public class Gujikja_main {

	public static void main(String[] args) {
		Gujikja[] guArr = new Gujikja[5];
		
		Gujikja gu1 = new Gujikja(); //기본생성자
		gu1.userid = "eomjh";
		gu1.passwd = "qwer1234$A";
		gu1.name = "엄정화";
		
//		String jubun = null  ==> false       // "9510202"; //숫자여야함
//		String jubun = "951220";  //==> false
//		String jubun = "95122012"; //==> false
//		String jubun = "9513201"; //통과 
//		String jubun = "9512t01"; //==> false
//		String jubun = "9512207"; //==> false 성별을 나타날때 7은 없다
		String jubun = "9512202"; //==> true  //이런것이 정규표현식이다.

		
		
		boolean bool = MyUtil.isCheckJubun(jubun);
		
//		System.out.println(bool); //null이 오면 false

		if(bool) {
			gu1.jubun = jubun;
			guArr[0] = gu1;
			Gujikja.count++;
			
		}
		Gujikja gu2 = new Gujikja();
	      gu2.userid = "leess";
	      gu2.passwd = "qwer1234$B";
	      gu2.name = "이순신";
	      gu2.jubun = "9710201";
	      
	      
//	      guArr[1] = gu2;
//	      Gujikja.count++;
	      guArr[Gujikja.count++] = gu2;
	      
	      
	      Gujikja gu3 = new Gujikja();
	      gu3.userid = "youks";
	      gu3.passwd = "qwer1234$C";
	      gu3.name = "유관순";
	      gu3.jubun = "8510202";
	      
	      guArr[Gujikja.count++] = gu3;
	      
	      
	      /////////////////////////////////////
	      //Ctrl 에 대한 ?가 필요해
	      
	      GujikjaCtrl ctrl = new GujikjaCtrl();
	      
	      
	      Scanner sc = new Scanner(System.in);
	      String smenuNo = "";
	      do {
	    	  System.out.println(" === 메인메뉴 === \n"
                      + "1.구직자 회원가입   2.구직자 모두 보기  3.검색   4.프로그램 종료 \n");
       
	    	  System.out.print("▷ 메뉴번호 선택 => "); 
	    	  smenuNo = sc.nextLine();
	    	  
	    	  switch (smenuNo) {
	    	  
	    	  case "1": //구직자 회원가입
					if(Gujikja.count <guArr.length) {
		    		  	Gujikja gu = ctrl.register(sc, guArr);   //메모리 주소를 넘겨준다.
						guArr[Gujikja.count++] = gu;   //후위인거임
						System.out.println(">> 회원가입 성공!! <<\n");
					}
					else {
						System.out.println(">> [경고] 정원 "+ guArr.length +"명이 다 차서 더 이상 회원가입은 불가합니다,! <<\n");
					}
					
					break;
					
				case "2": //구직자 모두 보기
					ctrl.showAll(guArr);
					
					
					break;
					
				case "3": //검색 메뉴를 보여주도록 호출
//					Gujikja_main m = new Gujikja_main();
//					m.searchMenu();//메인메소드이기 때문에 위에 두줄처럼 불러와야한다.
					searchMenu(sc,guArr,ctrl); //넘긴다.
					//ㅁㅔ인메소드가 있는 클래스에서 메인메소드가 아닌 다른 메소들 ㄹ불렁오고싶을 때 static이 아니라면 안되어지기 때문에
					//직접 객체를 하나 더 만들어야함. 그런다음 점을 찍어줘야함. 난ㄴ이렇게 하기 싫어 그럼 그냥 메소드에  static 붙여 
					//동일 클래스에 있기떄문에 Gujikja.searchMenu();까지는 안해줘도 됨
					
					break;
					
				case "4": //프로그램종료
					
					break;
			

			default:  //메뉴 번호에 없는 값
				System.out.println(">> [경고] 선택하신 번호는 메뉴에 없습니다. << \n");
				break;
			}//end of switch(key)------
	    	  
	      
	      } while (!("4".equals(smenuNo)) );  //String smenuNo=""; 초기치 심어줘서 null뜰일 없지만 안전하게 순서 바꿔서 써줌
	      //end of do~while----
	      
	      
	      sc.close();
	      
	      System.out.println("\n~~~~~~~ 프로그램 종료 ~~~~~~~\n");
	}//end of main(String[] args) ----------
	/////////////////////////////////
	
	static void searchMenu(Scanner sc, Gujikja[] guArr,GujikjaCtrl ctrl) {  //받는다
		String sMenuNo ="";
		do {
			System.out.println(" === 검색메뉴 === \n"
	                + "1.연령대검색   2.성별검색  3.연령대및성별검색   4.메인메뉴로 돌아가기 \n");
	 
	  	  	System.out.print("▷ 검색메뉴번호 선택 => "); 
	  	  	sMenuNo = sc.nextLine();
	  	  	
	  	  	switch (sMenuNo) {
			case "1": //연령대검색
				int ageline =0;	
				for(;;) {
					System.out.print("▷ 검색할 연령대[예: 20] => ");
					String sAgeline = sc.nextLine();   // 20  30  "강아지"
				
				
					try {
							ageline = Integer.parseInt(sAgeline);
							break;  //잘 썼으면 빠져나오고,   //for문의 break;
					} catch (NumberFormatException e) {
						System.out.println(">> [경고] 숫자만 입력하세요!! <<\n");
					}
				}
				
				ctrl.showByAgeline(guArr, ageline);
				
				
				
				break;//switch의 break

			case "2": //성별검색
				
				for(;;) {
					System.out.print("▷ 검색할 성별[남/여] => ");
					String gender = sc.nextLine();   // "남" or "여" or "10" or "똘똘이"
					
					if(!"남".equals(gender)&& !"여".equals(gender)) {
						System.out.println(">> [경고] 남 또는 여 만 입력하세요!! <<");
						
					}//end of if---
					else {
						ctrl.showByGender(guArr, gender);
						
						break;
					}//end of else----
					
				}//end of for--------------
				
				break;
				
			case "3": //연령대및성별검색
				String gender = "";
				for(;;) {
					try {
						System.out.print("▷ 검색할 연령대[예: 20] => ");
						String sAgeline = sc.nextLine();   // 20  30  "강아지"
						ageline = Integer.parseInt(sAgeline);
						
					}catch(NumberFormatException e) {
						System.out.println(">> [경고] 숫자만 입력하세요 !!<< \n");
						continue;//continue를 만나면 밑으로 안떨어지고 위의 증감식으로 가버림. 증감식에 아무것도 없으면 무조건 참이라는 소리
					}
				
					System.out.print("▷ 검색할 성별[남/여] => ");
					gender = sc.nextLine();   // "남" or "여" or "10" or "똘똘이"
					
					if(!"남".equals(gender)&& !"여".equals(gender)) {
						System.out.println(">> [경고] 남 또는 여 만 입력하세요!! <<");
						
					}//end of if---
					else {
						
						break;//for문의 break;
					}//end of else----
					
					
				
				}//end of for-----------
				
				//특정 연령대에 속하는 특정성별을 가지는 구직자들만 조회가 되도록 한다.
				ctrl.showByAgelineGender(guArr, ageline,gender);  //배열 넣어주고, 
				
				
				
				
				
				break; //switch-case문의 break
				
			case "4"://메인메뉴로 돌아가기(종료)
				
				break;
				
			default: //메뉴에 없는 번호를 입력할 경우
				System.out.println(">>[경고] 검색메뉴에 없는 번호입니다.<<\n");
				break;
			}//end of switch()----------
	  	  	
	  	  	
	  	  	
	  	  	
		}while(!("4".equals(sMenuNo)));
	}//end of void searchMenu()-------------
	
	
}
