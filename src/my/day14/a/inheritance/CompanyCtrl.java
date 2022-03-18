package my.day14.a.inheritance;

import java.util.Scanner;

public class CompanyCtrl {

	// == 구인회사 메뉴를 보여주는 메소드 생성하기 == //
	public void showMenu(Scanner sc, Company[] comArr) {
		
		String str_login_logout = "";
		String str_addname = "";
		Company com = null;
		String str_menuNo = "";
		String str_menuno3 = "";
		String str_menuno4 = "";
		do {
			if(com == null) {//로그인 안한 경우
				str_login_logout = "로그인";
//				str_addname = "["+com.getComname()+"회사에서 로그인중..]";
			}
			else {//로그인 한 경우
				str_login_logout = "로그아웃";
				
			}
			
			System.out.println("\n ====== >> *** 구인회사 메뉴"+str_addname+"*** << === \n"
							 + "1.구인회사 회원가입   2."+str_login_logout  +str_menuno3 
							 + "\n4.관리자전용메뉴   5.시작메뉴로 가기" + "\n"
							  );
	   
			System.out.print("▷ 메뉴번호 선택 => "); 
			str_menuNo = sc.nextLine();
			
			switch (str_menuNo) {
				case "1":
					co_register(sc,comArr);
					break;
					
				case "2":
					if("로그인".equals(str_login_logout )) {
						com = (Company)login_co(sc, comArr);
						
						if(com == null) {//로그인 못 한경우
							System.out.println(">> 로그인 실패! <<");
						}
						else {//로그인 한 경우
							System.out.println(">> 로그인 성공! <<");
							str_addname = "["+com.getComname()+" 회사에서 로그인중..]";
							str_menuno3 = "   3.내회사정보보기";
//							str_login_logout = "로그아웃";
							
							
						}
					}//end of if
					else
						com = null;
					
					break;
				case "3": //내정보보기
					if(com != null) {
						System.out.println("\n===>> "+com.getComname()+"의 회원정보입니다.<==");
						com.showInfo();
					}
					else
						System.out.println(">> [경고] 메뉴에 없는 번호입니다.(실은 로그인해야 볼수 있는) <<\\n");
					
					
					break;
					
				case "4":
						
					showAdminMenu(sc, comArr);
				case "5":
							
					
					break;
				default:
					System.out.println(">> [경고] 메뉴에 없는 번호입니다. <<\n");
					break;
			}//end of switch(str_menuNo)----
			
			
		}while(!(("2".equals(str_menuNo)&& "로그아웃".equals(str_login_logout))||"5".equals(str_menuNo)));
    	//end of do~while---------  
		
	}//end of public void showMenu(Scanner sc)----
	
	
	//로그인 해주는 메소드 생성하기
	private Member login_co(Scanner sc, Company[] comArr) {
		System.out.println("\n ==로그인하기==");
		System.out.print("▶ 아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("▶ 비밀번호 : ");
		String passwd = sc.nextLine();
		
		Company com = null;
		for(int i=0; i<Company.count;i++) {
			String stored_id = comArr[i].getId();
			String stored_passwd = comArr[i].getPasswd();
			
			if(stored_id.equals(id)&& stored_passwd.equals(passwd))
				com = comArr[i];
			
		}//end of for---
		return com;
		
		
	}//end of private Member login_co(Scanner sc, Company[] comArr)--
	
	
	// == 구인회사 신규 회원가입을 해주는 메소드 생성하기 ==//
	
	private void co_register(Scanner sc,Company[] comArr) {
		//id passwd comname combunho jobtype seedmoney
		
		if(Company.count < comArr.length) {
			System.out.println("\n >> === 구인회사 신규회원 가입 === <<");
			String id = null;
			for(;;) {
				System.out.print("1.아이디: ");
				id = sc.nextLine();
				
				boolean isDuplicate = false;
				
				for(int i=0;i<Company.count;i++) {
					String stored_id = comArr[i].getId();
					if(stored_id.equals(id)) {
						System.out.println("[경고] 이미 사용중인 아이디입니다.");
						isDuplicate = true;
						break;
					}//end of if---
				}//end of for---
				
				if(!isDuplicate)
					break;
			}//end of for---
			
			System.out.print("2.비밀번호: ");
			String passwd = sc.nextLine();
			
			System.out.print("3.회사명: ");
			String comname = sc.nextLine();
			
			System.out.print("4.사업자번호[예:12-345]: ");
			String combun = sc.nextLine();
			
			System.out.print("5.업종명: ");
			String jobtype = sc.nextLine();
			
			System.out.print("6.자본금: ");
			long seedmoney = Integer.parseInt(sc.nextLine());
			
			Company com = new Company();
			com.setId(id);
			com.setPasswd(passwd);
			com.setComname(comname);
			com.setCombunho(combun);
			com.setJobtype(jobtype);
			com.setSeedmoney(seedmoney);
			
			
			
			if(com.isUseCompany()) {
				comArr[Company.count++] = com;
				System.out.println(">> 회원가입 성공!! <<\n");
			}
			else
				System.out.println(">> 회원가입 실패!! <<\n");
		}//end of if(Company.count < comArr.length) ---
		else {
			System.out.println(">> [경고] 총 회사 정원 "+ comArr.length +"개 다 차서 더이상 구인회사 가입이 불가합니다. <<\n");
		}
	
	}//end of private void co_register(Scanner sc) {
	
	//관리자 전용 메뉴를 보여주는 메소드 작성하기
	private void showAdminMenu(Scanner sc, Company[] comArr){
		String str_menuNo = "";	
		
		for(;;) {
			System.out.print(" ▷ 관리자 ID : ");
			String admin_id = sc.nextLine();
			
			System.out.print(" ▷ 관리자 Passwd : ");
			String admin_pw = sc.nextLine();
			
			
			if("admin".equals(admin_id)&&"qWer1234$".equals(admin_pw)) {
				do {
					System.out.println("\n==== 관리자 전용메뉴 ====\n"
									 + "1. 모든구인회사 정보조회   2.업종별 검색   3.구인회사메뉴로 돌아가기");
					System.out.print("▷ 메뉴번호 선택 => ");
					
					str_menuNo = sc.nextLine();
					
					switch (str_menuNo) {
					case "1":
						showAllCompany_info(comArr);
						break;
					case "2":
						
						break;
					case "3":
						break;
		
					default:
						System.out.println("메뉴에 없는 번호를 입력하셨습니다.");
						break;
					}//end of switch(str_menuNo)---
					
				}while(!"3".equals(str_menuNo));
			}
			else {
				System.out.println("관리자 로그인에 실패하였습니다.");
				break;
			}
		}//end of for
	}//end of private void showAdminMenu(Scanner sc, Company[] comArr)-----
	
	//모든 회원사 정보조회 메소드 생성하기
	
	private void showAllCompany_info(Company[] comArr) {
		if(Company.count == 0)
			System.out.println(" >> 등록되어진 구인회사가 없습니다. <<\n");
		else {
			System.out.println("------------------------------------------------------------------");
			System.out.printf("%-10s\t%-15s\t%-8s\t%6s\t%-10s\t%-15s\n", "아이디","암호","회사명","사업자번호","업종명","자본금");
			System.out.println("------------------------------------------------------------------");
			for(int i=0; i<Company.count;i++) {
				comArr[i].viewInfo();
			}
		}//end of else--
		
		
	}//	private void showAllCompany_info(Company[] comArr) ---
	
}
