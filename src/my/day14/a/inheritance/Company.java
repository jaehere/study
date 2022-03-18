package my.day14.a.inheritance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Company extends Member { //extends 부모클래스이름
	
	//field 생성
//	private String userid; //아이디  중복내용 삭제?
//	private String passwd; //비밀번호
	
	private String comname;  //성명
	private String combunho; // 사업자등록번호
	private String jobtype; //업종명(예: 제조업, it, 서비스업 등)
	private long seedmoney; // 자본금
	

	static int count; // Gujikja 객체(인스턴스)의 개수를 알아오려는 용도
	
	public String getComname() {
		return comname;
	}



	public void setComname(String comname) {
		if(!(comname == null || comname.trim().isEmpty())) {
			int len = comname.length(); //null이 아니기 때문에 .을 쓸 수 있는거임
			if( 2 <= len && len <= 10) {
				this.comname = comname;
			}
			else
				System.out.println(">> [경고] 회사명은 2글자 이상 10글자 이하이어야 합니다. <<\n");
		}
		else {
			System.out.println(">> [경고] 회사명은 null 또는 공백만으로 될 수는 없습니다. <<\n");

		}
		
		
		
	}



	public String getCombunho() {
		return combunho;
	}



	public void setCombunho(String combunho) {
		//사업자등록번호는 12-345 이라는 형식을 취한다.라고 하자.
		//그런데 첫번째 오는 글자는 0은 올 수 없다라고 하자.
		Pattern p = Pattern.compile("^[1-9][0-9]-[0-9]{3}$");
		Matcher m = p.matcher(combunho);
		boolean bool = m.matches();
		if(bool) {
			this.combunho = combunho;
		}
		else{
			System.out.println(">> [경고] 사업자등록번호가 올바르지 않습니다. <<\n");
		}
		
		
	}



	public String getJobtype() {
		return jobtype;
	}



	public void setJobtype(String jobtype) {
		if(!(jobtype == null || jobtype.trim().isEmpty())) 
				this.jobtype = jobtype;
		
		else 
			System.out.println(">> [경고] 업종명은 null 또는 공백만으로 될 수는 없습니다. <<\n");
		
	}



	public long getSeedmoney() {
		return seedmoney;
	}



	public void setSeedmoney(long seedmoney) {
		
		if(seedmoney > 0)
			this.seedmoney = seedmoney;
		else 
			System.out.println(">> [경고] 자본금은 0보다 커야합니다. <<\n");
	}

	public boolean isUseCompany() {
		if(getId() != null &&
		   getPasswd() != null &&
			comname != null &&
			combunho != null &&
			jobtype != null &&
			seedmoney != 0) 
			return true;
		else
			return false;
			
	}//end of public boolean isUseCompany()---
	
	//구인회사 1곳의 정보를 보여주는 메소드 생성하기
	
	public void showInfo(){
		System.out.println("1.아이디: " + getId() + "\n"
						 + "2.비밀번호: " +getPasswd() + "\n"
						 + "3.회사명: " +comname + "\n"
						 + "4.사업자번호: " +combunho + "\n"
						 + "5.업종명 " +jobtype + "\n"
						 + "6.자본금: "+seedmoney + "\n"
						 );
	}//end of public void showInfo---
	
	public void viewInfo(){
		
		System.out.printf("%-10s\t%-15s\t%-8s\t%6s\t%-10s\t%-15s\n", getId(),getPasswd(),comname,combunho,jobtype,seedmoney);
		
	}//end of 	public void viewInfo()----
	
	public String getInfo() {
		return getId() + "   "+ getPasswd() + "   "+ comname + "   "+ combunho + "   " + jobtype + "   "+ seedmoney ;
	}
	
}
