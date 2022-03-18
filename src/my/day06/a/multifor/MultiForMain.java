package my.day06.a.multifor;

public class MultiForMain {

	public static void main(String[] args) {
		// 다중 for문 에 대해서 알아봅니다.
		// 다중 for문이라 함은 for문 속에 또 다른 for문이 있는 것을 말한다.
		/*
		 	
		 == 출력결과 ==
		 	
		 	abcdefg   3행(가로)  7열(세로)
		 	hijklmn
		 	opqrstu
		 */
		char ch = 'a';
		for(int i=0; i<3; i++) {// 바깥 for문 ==> 행
		
			for(int j=0; j<7; j++) {// 내부 for문 ==> 열
				System.out.print(ch++);
			}//end of for ------
			System.out.println("");
		}//end of for------
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		/*
		  abcdefg
		 */
		
		//이중for문
		ch = 'a';
						// 'u' - 'a' +1
		for(int i=0; i<'u'-'a'+1; i++) {
			System.out.print(ch++);
			if((i+1)%7 == 0) {  //7의 배수 : 어떤 수를 7로 나누었을때 나머지가 0
				System.out.print("\n");
			}
		}//end of for--------
		System.out.println("\n~~~~~~~~~~~~~~~~\n");
		
		/*
		 	이중 for문을 사용하여 아래처럼 나오도록 하세요
		 	== 출력결과 ==
        [0,0][0,1][0,2]   4행3열
        [1,0][1,1][1,2]
        [2,0][2,1][2,2]
        [3,0][3,1][3,2]

     */
		
		for(int i = 0; i<4 ;i++){
			for(int j=0;j<3;j++) {
				System.out.print("["+i+","+j+"]");
				
			}
			System.out.println("");
		}//end of for---
		
		System.out.println("\n~~~~~~~~~~~~~~~~\n");
		
		/*
		 	이중 for문을 사용하여 아래처럼 나오도록 하세요
		 	== 출력결과 ==
        [0,0][0,1][0,2]   4행3열
        [1,0][1,1][1,2]
        [3,0][3,1][3,2]
		
		※continue; ==> continue;를 만나면 가장 가까운 반복문의 증감식으로 이동한다.
     */
		for(int i = 0; i<4 ;i++){  //4행
			if(i==2) 
				continue; //continue;가 되어지면 밑으로 내려가지 않고, 가장 가까운 반복문의 증감식으로 이동한다.
			
			for(int j=0;j<3;j++) {
				System.out.print("["+i+","+j+"]");
				
			}
			System.out.println("");
		}//end of for---
		
		System.out.println("\n~~~~~~~~~~~~~~~~\n");
		
		
		/*
	 	이중 for문을 사용하여 아래처럼 나오도록 하세요
	 	== 출력결과 ==
	    [0,0][0,2]   4행3열
	    [1,0][1,2]
	    [3,0][3,2]
		
		※continue; ==> continue;를 만나면 가장 가까운 반복문의 증감식으로 이동한다.
	 */
		
		for(int i = 0; i<4 ;i++){  
			if(i==2) 
				continue; //continue;가 되어지면 밑으로 내려가지 않고, 가장 가까운 반복문의 증감식으로 이동한다.
			
			for(int j=0;j<3;j++) {
				if(j==1)
					continue;
				System.out.print("["+i+","+j+"]");
				
			}
			System.out.println("");
		}//end of for---
		
		System.out.println("\n~~~~~~~~~~~~~~~~\n");
		
		
		System.out.println("\n안녕하세요 \"좋은아침\t입니다\n");
		//  \n 줄바꿈  \"쌍따옴표   \t 탭
		
		System.out.println(">>[퀴즈] 아래처럼 나오도록 하세요");
		/*
		     501호 	502호	503호	505호
		     301호	302호	303호	305호
		     201호	202호	203호	205호
		     101호	102호	103호	105호
		 */
		
		for(int i=5;i>0;i--) {
			if(i == 4)
				continue;
			for(int j=1;j<6;j++) {
				if(j==4) {
					continue;
				}
				System.out.print(i+"0"+j+"호\t");	
			}
		System.out.println();
		}
		
		
		
		
	}//end of main(String[] args)-------

}
