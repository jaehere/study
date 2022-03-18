package my.day06.quiz.For;

public class Quiz2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';
		for(char i= 1;i<=26;i++) {
			if(i%2==0) {
				char ch2 = (char)(ch + 32); // auto UnBoxing(언박싱)
					
				if(i==26) 
					System.out.print(ch2);
				else
					System.out.print(ch2+",");
			}
			else {
			
				System.out.print(ch+",");
			}
			
			ch +=1;
			
		}//end of for------------
			
		
	}//end of main(String[] args)--------

}//end of class----------
