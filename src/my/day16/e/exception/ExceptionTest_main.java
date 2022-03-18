package my.day16.e.exception;

public class ExceptionTest_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n 1.~~~~~~~~~~~~~~~~~~~~\n");
		
		// 1. ArrayIndexOutOfBoundException
	    // ==> 배열의 크기가 오버가 되어지면 발생하는 익셉션
		
		String[] subjectArr = {"자바","오라클", "JSP"};
		try {
			for(int i=0;i<=subjectArr.length;i++) {
				System.out.println(subjectArr[i]);
			}
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(">> 배열의 인덱스 범위가 초과되었습니다. \n");
//			e.printStackTrace(); //어디가 오류인지 추적해서 알려준다. 
			System.out.println("이유 : " + e.getMessage());
			// e.getMessage() 은 오류메시지를 알려주는 것이다. 
		}
		
		System.out.println("\n 2.~~~~~~~~~~~~~~~~~~~~\n");
		
		// 2. ArithmeticException 
	    // ==> 분모에 0 이 들어가는 경우에 발생하는 익셉션
		try {
			int num = 10;
			for(int i=2;i>=0;i--) {
				System.out.println(num/i);
			}
		}catch(ArithmeticException e) {
			System.out.println(">> 분모에는 0이 올 수 없습니다. <<\n");
//			e.printStackTrace();
			System.out.println("이유 : "+e.getMessage());
		}
		
		System.out.println("\n 3.~~~~~~~~~~~~~~~~~~~~\n");

		int[] numArr= {10,20,30};
		
		try {
			for(int i=3;i>=0;i--) {
				int val = numArr[i]/i;
				System.out.println(val);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(">> 배열의 인덱스 범위가 초과되었습니다. \n");
		}catch(ArithmeticException e) {
			System.out.println(">> 분모에는 0이 올 수 없습니다. <<\n");
		}
		//exception이 유발되는 순간 해당것만 나오고 끝내버린다.
		
		
		System.out.println("\n 4.~~~~~~~~~~~~~~~~~~~~\n");
		
		for(int i=3;i>=0;i--) {
			try {
				int val = numArr[i]/i;
				System.out.println(val);
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(">> 배열의 인덱스 범위가 초과되었습니다. \n");
			}catch(ArithmeticException e) {
				System.out.println(">> 분모에는 0이 올 수 없습니다. <<\n");
			}
		}//end of for---
		
		
		System.out.println("\n 5.~~~~~~~~~~~~~~~~~~~~\n");
		
		
		for(int i=3;i>=0;i--) {
			try {
				int val = numArr[i]/i;
				System.out.println(val);
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(">> 에러메시지 : "+e.getMessage()+ "\n");
			}catch(ArithmeticException e) {
				System.out.println(">> 에러메시지 : "+e.getMessage()+ "\n");
			}
		}//end of for---
		
		
		System.out.println("\n 6.~~~~~~~~~~~~~~~~~~~~\n");
		

		for(int i=3;i>=0;i--) {
			try {
				int val = numArr[i]/i;
				System.out.println(val);
				
			}catch(ArrayIndexOutOfBoundsException |ArithmeticException e) {
				System.out.println(">> 에러메시지 : "+e.getMessage()+ "\n");
			}
			
		}//end of for---
		
		System.out.println("\n 7.~~~~~~~~~~~~~~~~~~~~\n");
		
		

		for(int i=3;i>=0;i--) {
			try {
				int val = numArr[i]/i;
				System.out.println(val);
				
			}catch(Exception e) {
				System.out.println(">> 에러메시지 : "+e.getMessage()+ "\n");
			}
			
		}//end of for---
		
		
		// exception 들 부모가 java.lang.Exception
		
		System.out.println("\n 8.~~~~~~~~~~~~~~~~~~~~\n");
		
		String[] strArr = {"10","스물","30"};
		
		for(int i=3;i>=0;i--){
			
			try {
				int val = Integer.parseInt(strArr[i])/i;  // strArr[3]   ,30/2 , "스물" , 10/0 
				System.out.println(val);
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스 번호 "+ e.getMessage()+"이 존재하지 않습니다.");
			}catch(ArithmeticException e) {
				System.out.println("분모에 0을 넣을 수없습니다.");
			}catch(Exception e){
				System.out.println("오류 메시지 : "+ e.getMessage());
			}
		}//end of for-----
		
		System.out.println("\n 9.~~~~~~~~~~~~~~~~~~~~~\n");
		
/*		
		for(int i=3;i>=0;i--){
			
			try {
				int val = Integer.parseInt(strArr[i])/i;  // strArr[3]   ,30/2 , "스물" , 10/0 
				System.out.println(val);
			
			}catch(Exception e){     //Unreachable 오류 모든 익셉션을 이 줄에서 다 받기 때문에 밑에 도달할 수 가 없다.
				System.out.println("오류 메시지 : "+ e.getMessage());
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스 번호 "+ e.getMessage()+"이 존재하지 않습니다.");
			}catch(ArithmeticException e) {
				System.out.println("분모에 0을 넣을 수없습니다.");
			}
		}//end of for----------------
		
		=== [!!! 중요 !!!] ===
		  익셉션 처리시 부모클래스의 익셉션이 맨 아래에 나와야 한다.
	      왜냐하면 익셉션 처리는 위에서 처리되면서 위의것이 처리가 안되면
	      아래로 내려가라는 말인데 부모 클래스의 익셉션이 먼저 나오고 
	      자식 클래스의 익셉션이 아래에 나오면 부모클래스 익셉션이 처리를 못한것을
	      자식클래스 익셉션이 처리를 해라는 것은 모순이기 때문이다.
*/

		System.out.println("\n 10.~~~~~~~~~~~~~~~~~~~~~\n");
		
		String[] strArr2 = {"10","20","30","40"};
		
		
		int cnt = 0;
		for(int i=3;i>=0;i--) {
			
			try {
				int val = Integer.parseInt(strArr2[i])/i;
				System.out.println(val);
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(">> 배열의 인덱스 범위가 초과되었습니다. \n");
			}catch(ArithmeticException e) {
				System.out.println(">> 분모에는 0이 올 수 없습니다. <<\n");
			
			} finally {
				// finally 은 오류가 발생하든지 또는 오류가 발생하지 않든지 관계없이 무조건 실행해야 하는 것들은 
				// finally 부분에 기술해주면 된다.
				System.out.println(++cnt +" 번째 반복 했습니다.\n");
			}
		}//end of for---
		
		

		System.out.println("\n 11.~~~~~~~~~~~~~~~~~~~~~\n");
		
		String[] strArr3 = {"10","스물","30"};
		
		
		cnt = 0;
		for(int i=3;i>=0;i--) {
			
			try {
				int val = Integer.parseInt(strArr3[i])/i;
				System.out.println(val);
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(">> 배열의 인덱스 범위가 초과되었습니다. \n");
			}catch(ArithmeticException e) {
				System.out.println(">> 분모에는 0이 올 수 없습니다. <<\n");
			}catch(Exception e) {
					System.out.println(">> 오류메시지 : "+ e.getMessage()+"<<\n");
			} finally {
				// finally 은 오류가 발생하든지 또는 오류가 발생하지 않든지 관계없이 무조건 실행해야 하는 것들은 
				// finally 부분에 기술해주면 된다.
				System.out.println(++cnt +" 번째 반복 했습니다.\n");
			}
		}//end of for---
		
		
	}// end of main(String[] args)----------------------

}
