package my.day17.d.collection;

import java.util.*;

public interface InterGujikjaCtrl extends InterController{
//login이 같은와중에 이름달리하면 헷갈리니깐 통일하기위해 InterController를 써주는거야. 똑같이 상속을 받아온거야. InterController에서 
	//각각의 해당클래스에서 구현해주고 있는거임.
	//start와 로그인을 재정의 해줘야함 중복을 피하려고 공통의 기능을 Controller로 하나 만들어온거임. 거기에 InterController를 구현해 온거임/
	//중복을 피하려고 이미 구현되어져 있는 것을 상속받음. 구현되어진 Controller를 GujikjaCtrl 이런 곳에 상속해주는거임. 
	
	// == 구직자 메뉴를 보여주는 메소드 생성하기 == //
	void showMenu(Scanner sc,  List<Member> mbrList);
	
	// == 구직자(Gujikja) 신규 회원가입을 해주는 메소드 생성하기 == //
	void register(Scanner sc,  List<Member> mbrList);
	
	// 관리자 전용 메뉴를 보여주는 메소드 생성하기 //
	void showAdminMenu(Scanner sc,List<Member> mbrList);
	
	// 관리자를 제외한 모든 구직자 정보를 조회해주는 메소드 생성하기 //
	void showAllGujikja_info(List<Member> mbrList);
	
	// 연령대및성별을 검색해주는 메소드 생성하기 //
	void searchAgeLineGender(List<Member> mbrList, Scanner sc);
	
	
	
}
