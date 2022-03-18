package my.day10.a.array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MoneyComma_main2 {
/*
 	▷ 금액을 입력하세요(정수로만) => 1234567890
 	1,234,567,890 원
 	
 	▷ 금액을 입력하세요(정수로만) => 100
 	100 원
 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("▷ 금액을 입력하세요(정수로만) => "); //"      1234567890   "
/*
		String str = sc.nextLine();
		System.out.println("입력시작:"+str+"입력끝");
		System.out.println("입력시작:"+str.trim()+"입력끝");
*/
		//"    문자열   ".trim()을 하면 좌우쪽의 공백이 있으면 공백을 제거한 "문자열"이 된다.
		
		long money = Long.parseLong(sc.nextLine().trim());
		
		DecimalFormat df = new DecimalFormat("#,###");
		String smoney = df.format(money);
		
		System.out.println(smoney);
		
		
		System.out.println("\n-----------------------\n");
		
		System.out.print("▷ 금액을 입력하세요(정수로만) => ");
		String inputStr = sc.nextLine().trim();  //   "123456789"     "23456789"
												 //   100
		
		int len = inputStr.length();            //len => 9         len=>8
												//
		
		int commaCount = len/3; 				// commaCount =>3   commaCount=>2
		
		if(len % 3 == 0) {   					//commaCOunt =>2    commaCOunt=>2
			commaCount -= 1;
		}
		// ",123,456,789"   "23,456,789"
		// "100
		
		char[] inputChArr = inputStr.toCharArray();
		/*
		           ------------------           ----------------
		  데이터값=> |1|2|3|4|5|6|7|8|9|          |2|3|4|5|6|7|8|9|
		  		   ------------------           ----------------
		  index=>  0 1 2 3 4 5 6 7 8 			0 1 2 3 4 5 6 7
		  
		 */
		
		char[] outputChArr = new char[len+commaCount];   //new char[9+2]    new char[8+2]
		/*
		 		   ----------------------------------------------      -----------------------------------------
		  데이터값=>  |' '||' '|' '|' '|' '|' '|' '|' '|' '|' '|' '|      |' '|' '|' '|' '|' '|' '|' '|' '|' '|' '|
		 		   ----------------------------------------------      -----------------------------------------
		  index=>    0    1   2   3   4   5   6   7   8   9   10		 0   1   2   3   4   5   6   7   8   9
		 		   default가 공백
		 		   처음에는 공백인데 입력받은 값으로다가 채운다
		 
		 
        		   ----------------------       --------------------
		  데이터값=> |1|2|3|,|4|5|6|,|7|8|9|      |2|3|,|4|5|6|,|7|8|9|
		   		   ----------------------       --------------------
		  index=>  0 1 2 3 4 5 6 7 8 9 10	    0 1 2 3 4 5 6 7 8 9
		  
	  콤마가 들어올=> 7번 3번							6번 2번
		  index

*/
		int cnt = 0; //반복하는 회수
		for(int i=(outputChArr.length-1), j=inputChArr.length-1; i>=0;i--,j--) {
			cnt++;
			if(cnt%4 !=0) {
				// 값을 넣어주는 것이다.
				outputChArr[i] = inputChArr[j];
			}
			else {
				//콤마(,)를 넣어주는 것이다.
				outputChArr[i]= ',';
				j++;
			}
			
			
		}//end of for----------
		String result = "";
		for(int i=0;i<outputChArr.length;i++) {
			result += outputChArr[i];
		}
		System.out.println(result);	
		
		sc.close();

	}//end of main------------

}
