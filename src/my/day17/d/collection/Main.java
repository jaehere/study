package my.day17.d.collection;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Member> mbrList = new ArrayList<>();
		
		
		Member[] mbrArr = new Member[8];
		
//		Main ma = new Main();
//		mbrArr[7] = ma;  //메인은 멤버로 다른 변수가 못들어옴.
		
		Gujikja admin_gu = new Gujikja();
		admin_gu.setId("admin");
		admin_gu.setPasswd("qWer1234$");
		admin_gu.setName("관리자");
		admin_gu.setJubun("8905071");
		
		Gujikja lss_gu = new Gujikja();
		lss_gu.setId("leess");
		lss_gu.setPasswd("qWer1234$");
		lss_gu.setName("이순신");
		lss_gu.setJubun("9005071");
		
		Gujikja ejh_gu = new Gujikja();
		ejh_gu.setId("eomjh");
		ejh_gu.setPasswd("qWer1234$");
		ejh_gu.setName("엄정화");
		ejh_gu.setJubun("9810072");
		
		Gujikja yks_gu = new Gujikja();
		yks_gu.setId("youks");
		yks_gu.setPasswd("qWer1234$");
		yks_gu.setName("유관순");
		yks_gu.setJubun("9103012");
		
		
		
		
		
		Company com1 = new Company();
		com1.setId("samsung");
		com1.setPasswd("aBcd1234$");
		com1.setComname("삼성전자");
		com1.setCombunho("12-345");
		com1.setJobtype("IT");
		com1.setSeedmoney(7000);
		
		Company com2 = new Company();
		com2.setId("sist");
		com2.setPasswd("aBcd1234$");
		com2.setComname("쌍용강북교육센터");
		com2.setCombunho("82-345");
		com2.setJobtype("교육서비스업");
		com2.setSeedmoney(5000);
		
		mbrList.add(admin_gu);
		mbrList.add(lss_gu);
		mbrList.add(ejh_gu);
		mbrList.add(yks_gu);
		mbrList.add(com1);
		mbrList.add(com2);
		
//		Main ma = new Main();
//		mbrArr[7] = com1; //가능
	
		
		
		///////////////////////////////////////////////////////////////////
		Scanner sc = new Scanner(System.in);
		
		Controller ctrl = new Controller();
		ctrl.startMenu(sc,mbrList);
		
		
		sc.close();
		System.out.println(">> 프로그램이 종료 되었습니다. <<");
		
	}
	
	
}
