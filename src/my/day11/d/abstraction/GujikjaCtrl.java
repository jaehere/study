package my.day11.d.abstraction;

import java.util.Scanner;

import my.util.MyUtil;

public class GujikjaCtrl {
// 메인이 있는 곳에서 왠만하면 코딩하는게 아니다.
// 메인은 불러만 오고 따른쪽에서 다 짜둬야함.
	// == 구직자(Gujikja) 신규 회원가입을 해주는 메소드 생성하기 ==//
	Gujikja register(Scanner sc, Gujikja[] guArr) {
		String userid=null;
		String passwd;
		String name;
		String jubun;
		boolean isUseridDuplicate ;  //디폴트가 false
		do {
			isUseridDuplicate = false;
		
			System.out.print("1.아이디: ");
			userid = sc.nextLine();//useerid는 고유해야 한다.
									// "eomjh" "leess" "youks"
			
			// == 중복 아이디 검사하기 ==//
		
			for(int i=0;i<Gujikja.count;i++) {
				
				
				if (userid.equals(guArr[i].userid)){
					System.out.println(">> [경고] 이미 사용중인 아이디입니다. \n");
					isUseridDuplicate = true;
					break;   //브레이크를 빠져나올때 중복이 있는지 없는지를.
		 	
				}
			}//end of for--------------
			
			// == 아이디는 반드시 공백만이 아닌 글자를 입력했는지 검사한다 ==//
			
				if(userid.trim().isEmpty()) {
					System.out.println(">> [경고] 아이디는 필수입력 사항입니다.  << \n");
					isUseridDuplicate = true; //못빠져나가게 불린값 설정
				}
				
			
			
		} while(isUseridDuplicate);
		///////////////////////////////////
		
		do {
			System.out.print("2.비밀번호 : ");
			passwd = sc.nextLine();
			
			if(!MyUtil.isCheckPasswd(passwd)) {
				System.out.println(">> [경고] 암호는 8글자 이상 15글자 이하의 대, 소문자 및 숫자, 특수문자가 혼합되어야 합니다.  << \n");
		
			}//end of if---------
			
			else 
				break;
			
		}while(true);	
			
		///////////////////////////////////	
		
		
		do {
			System.out.print("3.성명 : ");
			name = sc.nextLine();
			
			
			if(name.trim().isEmpty()) {
				System.out.println(">> [경고] 성명은 필수입력 사항입니다.  << \n");
			}
//			else if(name.length()==0)
//				System.out.println(">> [경고] 성명은 필수입력 사항입니다.  << \n");
			else
				break;
		
		}while(true);
		///////////////////////////
		
		
		do {
			System.out.print("4.주민번호 앞의 7자리만 : ");
			jubun = sc.nextLine();
			
			if(!MyUtil.isCheckJubun(jubun)) {
				System.out.println(">> [경고] 주민번호 7자리를 올바르게 입력하세요!!  << \n");
		
			}//end of if---------
			
			else 
				break;
			
		}while(true);	
		///////////////////////
		
		
			
		Gujikja gu = new Gujikja();  
		gu.userid  = userid;
		gu.passwd = passwd;
		gu.name = name;
		gu.jubun = jubun;
		
		return gu;
		
		
	}//end of Gujikja register()---------------------------------
	

	
	
	
	
	void showAll(Gujikja[] guArr) {

		if(Gujikja.count == 0) {
			System.out.println(">> 현재 가입된 구직자가 아무도 없습니다.<< \n");
		}
		else {
			System.out.println("--------------------------------------------------------");
		    System.out.printf("%-10s\t%-15s\t%-8s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
		    System.out.println("---------s-----------------------------------------------");
			
			for(int i=0;i<Gujikja.count;i++) {
	//			guArr[i].showInfo();
				guArr[i].viewInfo();
				
			}//end of for--------------
			System.out.println("\n");
		}
	}//end of showAll(Gujikja[]){
	
	
	//==연령대를 입력받아 해당 연령대에 속하는 구직자 정보를 출력해주는 메소드 생성하기 ==//

	void showByAgeline(Gujikja[] guArr, int ageline) {

		if(Gujikja.count == 0) {
			System.out.println(">> 현재 가입된 구직자가 아무도 없습니다.<< \n");
		}
		else {
			System.out.println("--------------------------------------------------------");
		    System.out.printf("%-10s\t%-15s\t%-8s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
		    System.out.println("---------s-----------------------------------------------");
			
		    boolean isFind = false;
		    
			for(int i=0;i<Gujikja.count;i++) {
				int stored_ageline = guArr[i].getAge()/10*10;
										//27  27/10   2 *10 ==> 20
										//25  25/10   2 *10 ==> 20
										//20  20/10   2 *10 ==> 20
				if(stored_ageline == ageline) {
					isFind = true;
					guArr[i].viewInfo();
				}
				
				
			}//end of for--------------
		if(!isFind) {	
			System.out.println(">>검색하신 "+ ageline +" 연령대는 없습니다. <<");
		}//end of if(!isFind)----
		
			System.out.println("\n");
		}
	}//end of showAll(Gujikja[]){
	
	
	//== 성별(남 또는 여) 입력받아 해당 성별에 속하는 구직자 정보를 출력해주는 메소드 생성하기 ==//
	void showByGender(Gujikja[] guArr, String gender) { //gender <== "남" or "여"
		
		if(Gujikja.count == 0) {
			System.out.println(">> 현재 가입된 구직자가 아무도 없습니다.<< \n");
		}
		else {
			System.out.println("--------------------------------------------------------");
		    System.out.printf("%-10s\t%-15s\t%-8s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
		    System.out.println("---------s-----------------------------------------------");
			
		    
			for(int i=0;i<Gujikja.count;i++) {
				//guArr[i] 요 한개가 엄정화 이순신 이런거 
				if(gender.equals(guArr[i].getGender())) {
					guArr[i].viewInfo();
					
				}
				
			
				
				
			}//end of for--------------
	
		
			System.out.println("\n");
		}
	
		
		
		
		
	}//end of void showByGender(Gujikja[] guArr, String gender)-----------------------
	
/////////////////////////////////////--------------/////////	
	
	
	//특정 연령대에 속하는 특정성별을 가지는 구직자들만 조회가 되도록 한다.
	
	void showByAgelineGender(Gujikja[] guArr, int ageline, String gender){
		
		if(Gujikja.count == 0) {
			System.out.println(">> 현재 가입된 구직자가 아무도 없습니다.<< \n");
		}
		else {
			System.out.println("--------------------------------------------------------");
		    System.out.printf("%-10s\t%-15s\t%-8s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
		    System.out.println("--------------------------------------------------------");
			
		    boolean isFind = false;
		    
			for(int i=0;i<Gujikja.count;i++) {
			
				int stored_ageline = guArr[i].getAge()/10*10;
				String stored_gender = guArr[i].getGender();
				
				if(stored_ageline == ageline && stored_gender.equals(gender)) {
					isFind = true;
					guArr[i].viewInfo();
					
				}
				
			}//end of for--------------
			
			if(!isFind) {
				System.out.println(">> 검색하신 연령 "+ ageline +"대에 속하는 "+gender+"자는 없습니다. << \n");
			}
		
		
			System.out.println("\n");
		}
		
		
	}//end of void showByAgelineGender(guArr, ageline,gender)
	
	
	
}
