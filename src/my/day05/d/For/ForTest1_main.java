package my.day05.d.For;

/*
 **** 반복문(loop) ==> for 문 ****
  
    ※ for 문의 형식
   
    for(초기화; 조건식; 증감식) {
          반복해서 실행할 문장;
    }  
    
    ▣ 순서
    1) 초기화;
    2) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
              조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
               } 을 빠져나간다.)
    3) 증감식
    4) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
              조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
               } 을 빠져나간다.) 
    5) 증감식
    6) 조건식; (조건식이 참(true)이라면 반복해서 실행할 문장;을 실행하고서 } 을 못빠져나간다.         
              조건식이 거짓(false)이라면 반복해서 실행할 문장;을 실행하지 않고
               } 을 빠져나간다.)                                                  
    
*/

public class ForTest1_main {

	public static void main(String[] args) {

		for(int i=0; i<10; i++) {
			System.out.println((i+1)+".안녕자바~~");
	    } 
	/*
	   1.안녕자바~~
	   2.안녕자바~~
	   3.안녕자바~~
	   4.안녕자바~~
	   5.안녕자바~~
	   6.안녕자바~~
	   7.안녕자바~~
	   8.안녕자바~~
	   9.안녕자바~~
	   10.안녕자바~~ 
	 */
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0; i<10; i+=1) {   //i+=1  ==> i+1
			System.out.println((i+1)+".안녕자바^^");
		}
		
	/*
	   1.안녕자바^^
	   2.안녕자바^^
	   3.안녕자바^^
	   4.안녕자바^^
	   5.안녕자바^^
	   6.안녕자바^^
	   7.안녕자바^^
	   8.안녕자바^^
	   9.안녕자바^^
	   10.안녕자바^^ 
	 */	
			
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0; i<10; i+=2) {   //i+=1  ==> i+1
			System.out.println((i+1)+".안녕 이클립스~~");
		}
	/*
	   1.안녕 이클립스~~
	   3.안녕 이클립스~~
	   5.안녕 이클립스~~
	   7.안녕 이클립스~~
	   9.안녕 이클립스~~
	 */		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0; i<10; i++) {  //<-전위든 후위든 상관없으나 
			System.out.println((++i)+".안녕 이클립스~~");  // i++ 후위로 줘버리면 일단 0찍고 나중에 1증가이기 때문에  0,2,4,6.. 순으로 나옴
		}
	/*
	   1.안녕 이클립스~~
	   3.안녕 이클립스~~
	   5.안녕 이클립스~~
	   7.안녕 이클립스~~
	   9.안녕 이클립스~~
	 */		

		System.out.println("~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0; i<20; i++) {
			System.out.println((++i)+".안녕 오라클~~");
		}
	
	/*
	   1.안녕 오라클~~
	   3.안녕 오라클~~
	   5.안녕 오라클~~
	   7.안녕 오라클~~
	   9.안녕 오라클~~
	   11.안녕 오라클~~
	   13.안녕 오라클~~
	   15.안녕 오라클~~
	   17.안녕 오라클~~
	   19.안녕 오라클~~
	 */	
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		//i, j 
		
		for(int i=0, j=0; i<10; i++,j+=2) {
			System.out.println((j+1)+".안녕 ORACLE~~");
		}  
				// 1. 1.안녕   i=1, j=2
				// 2. 3.안녕   i=2, j=4
				// 3. 5.안녕   i=3, j=6
		
	/*
	   1.안녕 ORACLE~~
	   3.안녕 ORACLE~~
	   5.안녕 ORACLE~~
	   7.안녕 ORACLE~~
	   9.안녕 ORACLE~~
	   13.안녕 ORACLE~~
	   15.안녕 ORACLE~~
	   17.안녕 ORACLE~~
	   19.안녕 ORACLE~~
	 */	
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		for(int i=10; i>0; i--) {
			System.out.println(i+".안녕 ORACLE^^");
	    } 
		
	/*
	   10.안녕 ORACLE^^
	   9.안녕 ORACLE^^
	   8.안녕 ORACLE^^
	   7.안녕 ORACLE^^
	   6.안녕 ORACLE^^
	   5.안녕 ORACLE^^
	   4.안녕 ORACLE^^
	   3.안녕 ORACLE^^
	   2.안녕 ORACLE^^
	   1.안녕 ORACLE^^
	 */	
				
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		for(int i=10; i>0; i-=1) {
			System.out.println(i+".안녕 스프링^^");
	    } 
		
	/*
	   10.안녕 스프링^^
	   9.안녕 스프링^^
	   8.안녕 스프링^^
	   7.안녕 스프링^^
	   6.안녕 스프링^^
	   5.안녕 스프링^^
	   4.안녕 스프링^^
	   3.안녕 스프링^^
	   2.안녕 스프링^^
	   1.안녕 스프링^^
	 */	
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		for(int i=10; i>0; i--) {
			if(i%2 != 0)  //i%2 은 i를 2로 나누었을 때의 나머지를 나타내는 것
				System.out.println(i+".안녕 Spring~~");
			
	    } 
		
	/*
	   9.안녕 Spring~~
	   7.안녕 Spring~~
	   5.안녕 Spring~~
	   3.안녕 Spring~~
	   1.안녕 Spring~~
	 */	
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		for(int i=10; i>0; i-=2) {
				System.out.println((i-1)+".안녕하세요~~");
			
	    } 
		
	/*
	   9.안녕하세요~~
	   7.안녕하세요~~
	   5.안녕하세요~~
	   3.안녕하세요~~
	   1.안녕하세요~~
	 */	
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		for(int i=10; i>0; i--) {
				System.out.println( --i +".Hello~");
			
	    } 
		
	/*
	   9.Hello~
	   7.Hello~
	   5.Hello~
	   3.Hello~
	   1.Hello~
	 */	
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		for(int i=0, j=9; i<5; i++,j-=2) {
				System.out.println( j +".헬로~");
			
	    } 
		
	/*
	   9.헬로~
	   7.헬로~
	   5.헬로~
	   3.헬로~
	   1.헬로~
	 */	
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		for(int i=0, j=10; i<5; i++, j-=2) {
			System.out.println(j + ".여보세요~");
		}
	
	/*
	   10.여보세요~
	   8.여보세요~
	   6.여보세요~
	   4.여보세요~
	   2.여보세요~
	  
	 */	
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		for(int i=10; i>0;i-=2) {
			System.out.println(i + ".여보세요~");
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		for(int i=10; i>0;i--) {
			System.out.println(i-- + ".여보세요~");
		}
		
		System.out.println("=======================");
		
		int n=0; //초기화 작업 for문 밖에서  //반복문을 빠져나온담에 변수n 쓰고싶으니깐 초기화를 포문 밖으로 빼둠
		
		for(; n<5;n++) {
			System.out.println((n+1)+".반복문");
		} // end of for-------------------
		System.out.println(">> 반복횟수 : " + n + " <<");
		
		
	/*
	 	1.반복문
	 	2.반복문
	 	3.반복문
	 	4.반복문
	 	5.반복문
	 	
	 	>> 반복회수 : 5 <<
	 */
		
		
	}

}
