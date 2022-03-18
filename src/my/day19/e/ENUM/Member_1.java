package my.day19.e.ENUM;

import java.util.Calendar;

public class Member_1 {

	private String name;
	private String jubun;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getJubun() {
		return jubun;
	}
	
	public void setJubun(String jubun) {
		this.jubun = jubun;
	}
	
	public int getAge() {
		Calendar currentDate = Calendar.getInstance();  // 현재날짜와 시간을 얻어온다.
		int currentYear = currentDate.get(Calendar.YEAR); 
		
		String gender = jubun.substring(6); // "9710201" "9710202" "0110203"  "0110204"
		//"1" "2" "3" "4"
		
		int birthYear = 0;
		switch (gender) {
			case "1":
			case "2":
				birthYear = 1900 + Integer.parseInt(jubun.substring(0, 2));
				break;
			
			case "3":
			case "4":
				birthYear = 2000 + Integer.parseInt(jubun.substring(0, 2));
				break;
				
			default:
				break;
		}
		
		return currentYear- birthYear + 1;
	}
	
	
	@Override //재정의
	public String toString() {
		
		return "1.성명 : "+name + "\n"+
			   "2.주민번호 : "+jubun + "\n"+
			   "3.나이 : "+getAge() + "세";
	}
	
}
