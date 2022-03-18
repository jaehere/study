package my.day04.a.scanner;

import java.util.Scanner;

public class Scanner1Main {

	public static void main(String[] args) {
		
//			★sc.nextLine(); 중간중간 버퍼 비워주는게 중요하다 !!☆
		
		
		Scanner sc = new Scanner(System.in);
		// System.in 은 입력장치(키보드)를 말한다.  
		//Scanner 빨간밑줄에서 import 클릭
		//System.out은 출력장치(모니터)를 말한다.
		
		//Scanner는 키보드에서 입력된 문자열을 읽어들이는 객체이다.
		
		System.out.print("첫번째 문장을 입력하세요=> ");
		String inputStr = sc.nextLine();  //엔터
		
		/*
		 		sc.nextLine(); 은 키보드로 부터 입력받은 문장을 읽어들이는 것인데 
		 		엔터(종결신호)까지 모두 읽어들인 후 스캐너 버퍼에 아무것도 남기지 않는다.
		 */
		System.out.println("첫번째 입력한 문장 => " + inputStr + "\n");
		//println과 \n을 같이 사용하면 2줄 띄우기 가능
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.print("정수를 입력하세요 => ");
		int inputNum = sc.nextInt();  //2021 엔터
		/*
        sc.nextInt(); 는 정수를 읽어들이는 것인데 
           종결자가 공백 또는 엔터 이다. 
           종결자(공백 또는 엔터) 앞까지의 입력해준 정수를 읽어온다.
        sc.nextInt(); 를 사용하면 스캐너(sc)버퍼 에는 종결자(공백 또는 엔터)가 삭제되는 것이 아니라 그대로 남아 있게 된다.       
      */
		sc.nextLine(); // 스캐너 버퍼에 남아있던 찌꺼기를 싹 비우는 것이 목적이다. 
			//종결자 엔터까지 읽어들인 후 스캐너 버퍼에 아무것도 남기지 않는다.
		System.out.println("입력한 정수 : " + inputNum);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.print("두번째 문장을 입력하세요=> ");  //엔터가 남아있는 상태
		inputStr = sc.nextLine();  //엔터
		
		System.out.println("두번째 입력한 문장 => " + inputStr + "\n");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.print("실수를 입력하세요 => ");
		
		double inputDbl = sc.nextDouble();
		/*
        sc.nextDouble(); 는 실수를 읽어들이는 것인데 
           종결자가 공백 또는 엔터 이다. 
           종결자(공백 또는 엔터) 앞까지의 입력해준 실수를 읽어온다.
        sc.nextInt(); 를 사용하면 스캐너(sc)버퍼 에는 종결자(공백 또는 엔터)가 삭제되는 것이 아니라 그대로 남아 있게 된다.       
     */
		
		//그럼 sc.nextInt();만 메모리에서 삭제되는거네
		
		sc.nextLine();
		System.out.println("입력한 실수 : " + inputDbl);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.print("단어를 입력하세요 => ");
		String inputWord = sc.next(); //안녕 하세요 호호호
		/*
        sc.next(); 는 단어를 읽어들이는 것인데 
           종결자가 공백 또는 엔터 이다. 
           종결자(공백 또는 엔터) 앞까지의 입력해준 문자열을 읽어온다.
        sc.next(); 를 사용하면 스캐너(sc)버퍼 에는 종결자(공백 또는 엔터)가 삭제되는 것이 아니라 그대로 남아 있게 된다.       
     */
		
		sc.nextLine(); 
		System.out.println("입력한 단어 : " + inputWord);
	
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.print("3번째 문장을 입력하세요=> ");  //엔터가 남아있는 상태
		inputStr = sc.nextLine();  //엔터
		
		System.out.println("3번째 입력한 문장 => " + inputStr + "\n");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		
		sc.close();
		
		
//		sc = null;
//		System.gc();   얘네들의 기능을 JVM에 해줌
		
		
	}

}
