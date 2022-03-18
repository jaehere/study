package my.day04.b.scanner;

import java.util.Scanner;

public class sungjukMain_self {



	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Sungjuk lssSj = new Sungjuk(); //기본생성자   기본생성자는 생략되어 있다지 
		
		try {
		
			System.out.print("1. 학번 : ");
			lssSj.hakbun = sc.nextLine();  // "091234"
			
			System.out.print("2. 성명 : ");
			lssSj.name = sc.nextLine(); //"이순신"
			
			System.out.print("3. 국어 : ");
			byte kor = Byte.parseByte(sc.nextLine()); //"90"  "안녕하세요"
														// "-80" "2000"
														// "110"
		
		//우리가 원하는 숫자의 범위는 0 ~ 100
		// byte : -128 ~ 127
		
			if (lssSj.checkJumsu(kor)) {
				lssSj.kor = kor; //kor => 0 ~ 100	
			}
			else {  //kor => -128 ~ -1 또는 101 ~ 127
	//			System.exit(0); // 프로그램 강제종료
	//			또는
				sc.close();
				return;
	//			// main()메소드내에서  return; 은  main()메소드에서 작업중인 것을 종료해라는 말이다. 
	//            // 즉, 프로그램을 종료해라는 말이다.
			}
		
			System.out.print("4. 영어 : ");
			byte eng = Byte.parseByte(sc.nextLine());
		
			if (lssSj.checkJumsu(eng)) {
				lssSj.eng = eng; //eng => 0 ~ 100	
			}
			else {  //eng => -128 ~ -1 또는 101 ~ 127
				sc.close();
				return;
			}
			
			System.out.print("5. 수학 : ");
			byte math = Byte.parseByte(sc.nextLine());
			
			if (lssSj.checkJumsu(math)) {
				lssSj.math = math; //math => 0 ~ 100	
			}
			else {  //math => -128 ~ -1 또는 101 ~ 127
				sc.close();
				return;
			}
			
	
		
			System.out.print("6. 나이 : ");
			short age = Short.parseShort(sc.nextLine());
							//"20", "30", "50"  ==> OK
							//"행복하세요","567890" ==> NumberFormatException
							// "10" , "70"  ==> short로 가능하지만 나이제한(20~50)에 걸림.
			if (lssSj.checkAge(age)) {
				lssSj.age = age; //age => 20 ~ 50	
			}
			else {  // age=> 약 -3만 ~ 19 또는 51 ~ 3만
				sc.close();
				return;
			}
			
			
			lssSj.showInfo();
			
		}catch(NumberFormatException e) {
			
			
			System.out.println(">> 점수 입력은 0 이상 100 까지만 가능합니다. << \n");
			
			
			
			System.out.println(">> 나이 입력은 20 이상 50 까지만 가능합니다. << \n");
			
			e.printStackTrace();
			
		}
		sc.close();
		
	}//end of main(String[] args)--------------

}
