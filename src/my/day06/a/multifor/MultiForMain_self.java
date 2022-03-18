package my.day06.a.multifor;

public class MultiForMain_self {

	public static void main(String[] args) {
		// 다중 for문에 대해서
		
		char ch = 'a';
		for(int i=0; i<3; i++) { // 3행
			
			for(int j=0;j<7;j++) { // 내부 7열 
				System.out.print(ch++);
			}//end of for
			System.out.println();
		}//end of for

		
		System.out.println("\n~~~~~~~~~~~~~~\n");
	
		
		ch = 'a';
		
		for(int i=0; i<'u'-'a'+1; i++) {
			System.out.print(ch++);
			if((i+1)%7 ==0) {
				System.out.print("\n");
				
			}
		}
		System.out.println("\n~~~~~~~~~~~~~\n");
	
	
		ch ='a';
		for(int i=0; i<'u'-'a'+1;i++) {
			System.out.print(ch++);
			if((i+1%7 == 0)) {
				System.out.print("\n");
			}
		}
		System.out.println("\n~~~~~~~~~~~~~\n");
		
		
		for(int i=0;i<4;i++) {
			if(i==2)
				continue;
			for(int j=0;j<3;j++) {
				System.out.print("["+i+","+j+"]");
			}
			System.out.println();
		}
		System.out.println("\n~~~~~~~~~~~~~\n");

		
		for(int i=0;i<4;i++) {
			if(i==2)
				continue;
			
			for(int j=0;j<3;j++) {
				if(j==2)
					continue;
				System.out.print("["+i+","+j+"]");
				
			}
			System.out.println();
		}//end of for-------
		
		System.out.println("\n~~~~~~~~~~~~~\n");
		
		
		System.out.println("\n안녕하세요 \"좋은아침\"입\t니다\n");
		
		for(int i=5;i>0;i--) {
			if(i==4) 
				continue;
			for(int j=1;j<6;j++) {
				if(j==4)
					continue;
				System.out.print(i+"0"+j+"호\t");
				
			}//end of for--------
		System.out.println();
		}//end of for-------
	
	}//end of main

}
