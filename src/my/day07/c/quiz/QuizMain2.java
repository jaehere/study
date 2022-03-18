package my.day07.c.quiz;

public class QuizMain2 {
/*
	 == 입사문제 == 
	*********1
	********2
	*******3
	******4
	*****5
	****6
	***7
	**8
	*9

	위와 같이 나오도록 하세요
	1. for문을 사용해서 출력
	2. while문을 사용해서 출력
	3. do~while문을 사용해서 출력
 */
	/*
	 int sum = 0;
	 for(int i=1;i<=10;i++) {
			sum += i; 
	 */
	public static void main(String[] args) {
		System.out.println(" <1. for문을 사용해서 출력> \n"); 
		
		for(int i=1;i<10;i++) {
			
			
			for(int j=9;j>i;j--) {
				System.out.print("*");
			
			}
			System.out.print("*"+i);
			System.out.println();
		}//end of for-----
		
		System.out.println("\n---------------\n");
		
		System.out.println(" \n<2. while문을 사용해서 출력> \n"); 
	
		int i=1;
		
		while (i<10) {
			int j = 9;
			while(j>=i) {
				System.out.print("*");
				j--;
			}//end of while----------
			
			System.out.print(i);
			i++;
			System.out.println();
			
		}//end of while-------------
		
		System.out.println("\n---------------\n");
		
		System.out.println(" \n<3. do~while문을 사용해서 출력> \n");

		i=1;
		do {
			int j=9;
			
			do {
				System.out.print("*");
				j--;
			} while (j>=i);
			
			System.out.print(i);
			i++;
			
			System.out.println();
		
		} while (i<10);
		
			
		
		
		
	}//end of main--

}//end of class--
