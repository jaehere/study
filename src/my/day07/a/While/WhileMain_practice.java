package my.day07.a.While;

public class WhileMain_practice {

	public static void main(String[] args) {
		int cnt = 5 , loop = 0;
			
		while(loop<cnt) {
			System.out.println((loop+1)+".Hi");
			loop++;
		}//end of while
		System.out.println("\n-----------------\n");
		
		
		cnt=5; loop=0;
		
		while(loop++ < cnt) {
			System.out.println(loop+".Hello");
		}
		System.out.println("\n-----------------\n");
		
		
		cnt=5; loop=0;
		while(loop<cnt) {
			System.out.println(++loop+".hola");
		}
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~\n");
		
		loop=0;
		while(true) {
			System.out.println(++loop+".Hola");
			if(loop ==5 )
				break;
		}
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~\n");
		
		loop=0;
		while(!(++loop>5)) {
			System.out.println(loop+".abcd");
			
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~\n");
		loop=0;
		while(true) {
			if(++loop>10) {
				break;
			}
			if(loop%2==0) {
				continue;
			}
			System.out.println(loop+".glass");
		}
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~\n");
		
		System.out.println("===5단===\n");
		
		loop=0;
		while(++loop<10) {
			System.out.println("5*"+loop+"="+(5*loop));
		}
		
		
	}//end of main--

}
