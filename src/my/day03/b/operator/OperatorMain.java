package my.day03.b.operator;

public class OperatorMain {

	public static void main(String[] args) {

		//~~~~~~~~~~~연산자~~~~~~~~~~~//
		
		// #### 1. 산술연산자 ####
		//		 + - * / %(나머지)  <<  >>  >>>
		
		System.out.println("=== 1. 산술연산자  + - * / %(나머지)  <<  >>  >>> ");
		
		int n = 10;
		System.out.println("n+3 = " + (n+3)); //n+3 = 13
		System.out.println("n-3 = " + (n-3)); //n-3 = 7
		System.out.println("n*3 = " + (n*3)); //n*3 = 30
		System.out.println("n/3 = " + (n/3)); //n/3 = 3 (몫) 정수/정수 = 정수(몫)
		System.out.println("(double)n/3 = " + ((double)n/3)); // n/3 = 3.3333333333333335
		System.out.println("n%3 = " + (n%3)); //n%3 = 1 (나머지)

		System.out.println("n<<3 = " + (n<<3)); //shift연산자
		/*
		 	<< 는 왼쪽 쉬프트 연산자
		 	
		 	int는 4byte이므로 32bit로 구성된다.
		 	10<<3 은 
		 	정수 10을 이진수 00000000 00000000 00000000 00001010  8bit씩 총 32bit 원래는 다 붙여서임
		 	왼쪽방향으로 3개를 밀어버린다. 000/00000 00000000 00000000 00001010
		 	                               <-----------3개 밀어버려         _ _ _ 새로운 세자리가 생김
		 	00000 00000000 00000000 00001010___ 이 되는데
            그런 다음에 _ 자리에 0으로 채운다.
          	즉, 00000 00000000 00000000 00001010000 이 된다.
            이진수 00000000 00000000 00000000 01010000
			이것을 십진수로 나타내면 80
			1*(2의6승) +1*(2의4승)
			64 + 16 = 80
		 	이것은 10 *(2의 3승) ==> 10*(2의 3승) 와 같은 것이 된다. 그러므로 80이다.
		 */

		System.out.println("n>>2 = " + (n>>2));
		
		/*
		    >> 는 오른쪽 쉬프트 연산자   오른쪽이면 곱하기가 아니라 나누기해줘야함
		    
		    int는 4byte이므로 32bit로 구성된다.
		 	10>>2 은 
		 	정수 10을 이진수 00000000 00000000 00000000 00001010  8bit씩 총 32bit 원래는 다 붙여서임
		 	오른쪽 방향으로 2개를 밀어버린다. 00000000 00000000 00000000 000010/10
		 	                             ----------->2개 밀어버려  
		 	__00000000 00000000 00000000 000010 이 되는데
            그런 다음에 _ 자리에 정수 n(10)의 부호비트 (가장 왼쪽 비트 1개,0이면 양수이고, 1이면 음수를 말하는 것이다.)와 같은 값으로 채운다.
          	즉, 0000000000 00000000 00000000 000010 이 된다.
            이진수 00000000 00000000 00000000 00000010
			이것을 십진수로 나타내면 2
			1*(2의1승) = 2이 된다.
			이것은 10 / (2의 2승) ==> 10/(2의 2승) 와 같은 것이 된다. 그러므로 2(몫)이다.
		 */
		
		
		System.out.println("n>>>3 = " + (n>>>3));
		
		/*
		    >>> 는 오른쪽 쉬프트 연산자  3개는 오른쪽방향밖에 없음, <<<존재하지않음 
		    
		    int는 4byte이므로 32bit로 구성된다.
		 	10>>>3 은 
		 	정수 10을 이진수 00000000 00000000 00000000 00001010  8bit씩 총 32bit 원래는 다 붙여서임
		 	오른쪽 방향으로 3개를 밀어버린다. 00000000 00000000 00000000 00001/010
		 	                             ----------->3개 밀어버려  
		 	그러면 ___00000000 00000000 00000000 00001 이 되는데
            그런 다음에 _ 자리에는 무조건 0 값으로 채운다.
          	즉, 00000000000 00000000 00000000 00001 이 된다.
            이진수 00000000 00000000 00000000 00000001
			이것을 십진수로 나타내면 1
			1*(2의0승) = 1*1 = 1 이 된다.
			그러므로 1이다.
			
		 */
		
			n = -10;
			System.out.println("~~~ n이 -10인 경우 ~~~");
			
			/*
			     >>>   -10을 bit로 나타내어 주는 방법  <<<
				
				int 는 4byte 이므로 32bit 로 구성된다.
          		컴퓨터의 음수표현 방법은 2의 보수 표현 방법을 사용한다.
          		2의 보수란 1의 보수(0은 1로, 1은 0로 바꿔주는 것)로 변환 후 +1 해주는 것이다.
			 
			 	-10 을 이진수로 표현하면 다음과 같다.
			 	우선, 10을 이진수로 나타내면, 00000000 00000000 00000000 00001010 인데
			 	이것을 1의 보수로 만든다. 즉, 11111111 11111111 11111111 11110101 
			 	여기에 +1을 하면 											+1
			 						   11111111 11111111 11111111 11110110 이 된다.
			 	11111111 11111111 11111111 11110110 을 십진수로 나타내어 보겠습니다.
			 	
			 	첫번째 bit는 부호비트로 사용되어지는데,
			 	0은 +(양수)을 의미하고,
			 	1은 -(음수)을 의미한다.
			 	
			 	첫번째 bit가 1인 경우, 즉 음수를 뜻할 경우에는 아래와 같이 구한다.
			 	똑같은 1이 나오는 것 중에서 마지막 1만 취하고, 여기에다가 그 나머지를 끝까지 취한다.
			 	11111111 11111111 11111111 11110110
			 	
			 	 10110
			 	첫번째 값만 -를 붙이고, 나머지 값은 +로 연산을 하면 된다.
			 	-1*(2^4) + 0*(2^3) + 1*(2^2) + 1*(2^1) =  -16 +4 +2 = -10
			 						   
			 */
			
			System.out.println("n<<3 = " + (n<<3));
			/*
		 	<< 는 왼쪽 쉬프트 연산자
		 	
		 	int는 4byte이므로 32bit로 구성된다.
		 	-10<<3 은 
		 	정수 -10을 이진수 11111111 11111111 11111111 11110110  8bit씩 총 32bit 원래는 다 붙여서임
		 	왼쪽방향으로 3개를 밀어버린다. 111/11111 11111111 11111111 11110110
		 	                               <-----------3개 밀어버려         _ _ _ 새로운 세자리가 생김
		 	11111 11111111 11111111 11110110___ 이 되는데
            그런 다음에 _ 자리에 0으로 채운다.
          	즉, 11111 11111111 11111111 11110110000 이 된다.
            이진수 11111111 11111111 11111111 10110000
			음수 이므로
			11111111 11111111 11111111 /10110000
			
			10110000
			-1*(2^7) + 1*(2^5) +1*(2^4) 
			-128 + 32 + 16 = -80
			
			
		 */
			
			System.out.println("n>>2 = " + (n>>2));
			/*
		 	>> 는 오른쪽 쉬프트 연산자
		 	
		 	int는 4byte이므로 32bit로 구성된다.
		 	-10>>2 은 
		 	정수 -10을 이진수 11111111 11111111 11111111 11110110  8bit씩 총 32bit 원래는 다 붙여서임
		 	오른쪽방향으로 2개를 밀어버린다. 11111111 11111111 11111111 111101/10
		 	                               ----------->2개 밀어버려      
		 	__11111111 11111111 11111111 111101 이 되는데
            그런 다음에 _ 자리에 정수 -10의 부호비트와 같은 값으로 채운다.
          	즉, 1로 채운다.
          	그럼ㄴ 1111111111 11111111 11111111 111101 이 된다.
            이진수 11111111 11111111 11111111 11111101
			음수 이므로
			11111111 11111111 11111111 11111/101
			
			101
			
			-1*(2^2) + 1*(2^0)
			-4+1
			-3
			
			
		 */
			
			
			System.out.println("n>>>3 = " + (n>>>3));
			/*
		 	>>> 는 오른쪽 쉬프트 연산자
		 	
		 	int는 4byte이므로 32bit로 구성된다.
		 	-10>>3 은 
		 	정수 -10을 이진수 11111111 11111111 11111111 11110110  8bit씩 총 32bit 원래는 다 붙여서임
		 	오른쪽방향으로 3개를 밀어버린다. 11111111 11111111 11111111 11110/110
		 	                               ----------->3개 밀어버려      
		 	___11111111 11111111 11111111 11110 이 되는데
            그런 다음에 _ 자리에 무조건 0으로 채운다.
          	
          	그러면 00011111111 11111111 11111111 11110 이 된다.
            이진수 00011111 11111111 11111111 11111110
			양수 이므로
			즉, 536870910
			
		 */
			
			
			
	 // #### 2. 증감연산자 ####
	 //         ++ -- 
		System.out.println("\n=== 2. 증감연산자 ++ -- ====");	
		
//		int a = 7;
//		int b = 3;
//		또는
		int a = 7, b=3;
		System.out.println("a=> "+a); //a=>7
		
//		a = a+1;
//		또는
		a++;
		System.out.println("a=> "+a); //a=>8
		
		++a;  
		System.out.println("a=> "+a); //a=>8
		
		System.out.println("b=> "+b); //b=>3
		
//		b = b-1;  //or
		b--;
		System.out.println("b=> "+b); //b=>2
		
		--b;
		System.out.println("b=> "+b); //b=>2
		
		// !!! 꼭 암기하세요 !!!//
		//후위증감연산자 ( a++; b--;) 는 다른 연산을 다 마친 이후에 1씩 증감한다.
		//전위증감연산자 ( ++a; --b;) 는 맨먼저 1씩 증감을 마친 이후에 다른 연산을 한다. 
		
		int x=10, y=10;
		int z = ++x;  // ++x; x=x+1
		System.out.println("z => " + z); //11
		System.out.println("x => " + x); //11
		
		z = y++;
		System.out.println("z => " + z); //10
		System.out.println("y => " + y); //11
		
		
		
		// #### 3. bit별 not 연산자 ####
		//      ~
		System.out.println("\n====3. bit별 not 연산자 ~ ===="); // ~ :틸드
		/*
        주어진 정수값을 32bit 형태의 2진수로 바꾸어서 나타내는데 
        0 bit 는 1 bit로 바꾸고, 1 bit 는 0 bit 로 바꾸어주는 것이다. 
		*/
		int m = 42;
		System.out.println("~m : "+ ~m); //~m : 
		/*
		  00000000 00000000 00000000 00101010   <= 42
		  11111111 11111111 11111111 11010101   <= ~42
		  
		  첫번째 bit는 부호비트로 사용되어지는데 
		  0은 +임(양수)을 의미,
		  1은 -임(음수)을 의미
		  
		  마지막 1부터 쭈욱 끌어오기
		  1010101
		  
		  첫번째 값만 -를 붙이고, 나머지 값은 +로 연산한다
		  
		  -1*(2^6) + 1*(2^4) + 1*(2^2) + 1*(2^0)
		  -64 + 16  +2 + 1 = -43
		  
		 */
		
		 // #### 4. 논리 부정 연산자 ####
		 //       !
		System.out.println("\n==== 4. 논리 부정 연산자 !  ===="); 
		boolean bool = false;
		System.out.println("bool : " + bool); // bool : false
		System.out.println("!bool : " + !bool); //!bool : true
		
		 // #### 5. bit 연산자 ####
		 //      &(앰퍼샌드)  |(버티컬라인)  ^
		System.out.println("\n==== 5. bit 연산자 & | ^   ====");
		/*
        & (and 연산자) => 2개 bit 모두 1 일때만 1, 나머지는 0 
        | (or 연산자)  => 2개 bit 중에서 적어도 1개가 1이면 1, 모두 0이어야만 0 
        ^ (xor 연산자) => 2개 bit 중에서 서로 달라야만 1, 같으면 0 
        
        & | ^ 연산자는 연산되어지는 대상이 정수일때만 사용가능함.   
   */
		int x1=3, y1=5;
		
		System.out.println("x1 & y1 => " + (x1 & y1));  //x1 & y1 => 1
		/*
		    00000011 <==3
		  & 00000101 <==5
		  ------------
		    00000001    /2개 모두 1일때만 1
		  
		 */
		
		System.out.println("x1 | y1 => " + (x1 | y1));  //x1 | y1 => 7
		/*
		    00000011 <==3
		  & 00000101 <==5
		  ------------
		    00000111    <==7
		  
		 */
		
		System.out.println("x1 ^ y1 => " + (x1 ^ y1));  //x1 ^ y1 => 6
		/*
		    00000011 <==3
		  & 00000101 <==5
		  ------------
		    00000110   <==6 / 다르면 1 같으면 0
		  
		 */
		
		// #### 6. 논리연산자(아주중요) ####
		//      &  |  && ||  
		System.out.println("\\n==== 6. 논리연산자 & | && ||   ====");
		/*
		  ㄷ+한자 : 수학기호
		  수학에서는 T ∧ T ∧ F ==> F          // ∧ : and
		  		 T ∧ T ∧ T ==> T
		  		 
		  		 T ∨ T ∨ F ==> T         // ∨ : or
		  		 T ∨ T ∨ T ==> T
		  		 F ∨ F ∨ F ==> F
		 */
		int c=50, d=60, e=70;
		
		bool = (c > d) && (d < e) && (c == 3);
				// false && 스킵  (뒤에 true 건 false건 스킵해버림)
		System.out.println("bool => " + bool); // bool => false
		
		bool = (c > d) || (d < e) || (c == 3);
				// false || true || 스킵
		System.out.println("bool => " + bool); // bool => true
		
		System.out.println("~~~~~~~~~~~~~~~~~");
		
		bool = (c > d) & (d < e) & (c == 3);
				// false & true & false  (&,|처럼 한개만 쓰면 스킵하지 않고 끝까지 연산처리함. 느리다. 주로 두개짜리 && || 사용)
		System.out.println("bool => " + bool); // bool => false
		
		bool = (c > d) | (d < e) | (c == 3);
				// false | true | false
		System.out.println("bool => " + bool); // bool => true
		
		System.out.println("\n~~~~~~~~~퀴즈1~~~~~~~~\n");
		int i=1;
		int j=i++;//j=i; i++;
					//j = 1; i=>2
		
		if((i > ++j) & (i++ == j)) {  //j =>2
		//   2 > 2      
		//  false    &  i == j  i++;
		//  false    &  2 == 2  i++;
		//  false    &  true    i++; 
		//         false        i=>3
			
			i=i+j;
		}
		System.out.println("i="+i);  // i=?   i=3
		
		i=1;
	      j=i++;  //j=i; i++;
	      		  //j=1; i=>2
	      
	      if( (i > ++j) && (i++ == j) ) {
	        // 2 > 2   &&                 j=>2
	    	// false   &&  스킵
	    	//       false
	    	  i=i+j;
	      }
	      
	      System.out.println("i="+i);  // i=?  i=2
		
		System.out.println("\n~~~~~~ 퀴즈2 ~~~~~~~\n");
	      
	      int m1=0, n1=1;
	      
	      if( (m1++ == 0) | (n1++ == 2) ) {
	    	  //  m1 ==0 m1++;
	    	  // 0 == 0
	    	  // true   m1=>1
	    	  // true     | n1 ==2 n1++;
	    	  // true     | 1==2
	    	  // true     | false
	    	  //        true       n1=>2
	    	  
	         m1=42;
	      }
	      
	      System.out.println("m1=>"+m1 + ", n1=>"+n1); // m1=>? , n1=>?
	      												// m1 = 42, n1 = 2
	      
	      m1=0;
	      n1=1;
	      
	      if( (m1++ == 0) || (n1++ == 2) ) {
	        //  m1 ==0 m1++;
	        // 0 == 0
	        // true   m1=>1 
	    	// true       || 스킵
	    	// 
	    	  m1=42;
	      }
	      
	      System.out.println("m1=>"+m1 + ", n1=>"+n1); // m1=>? , n1=>?  m1 = 42, n1 = 1
	
	      
	      
	      // #### 7. 비교연산자 ####
	      //     == 같다,    != 같지않다    >    <    >=   <=
	      
	      // #### 8. 할당연산자(연산후 대입 연산자) ####
	      //        +=  -+  *=  /=  %=
	      System.out.println("\\n==== 8. 할당연산자(연산후 대입 연산자) +=  -+  *=  /=  %=   ====");
	      
	      int no = 1;
	      no += 3; // no = no + 3;와 같은 것이다.
	      System.out.println("no=" + no); //no=4
	      
	      no -= 2; // no = no - 3;와 같은 것이다.
	      System.out.println("no=" + no); //no=2
	      
	      no *= 5; // no = no * 5;와 같은 것이다.
	      System.out.println("no=" + no); //no=10
	      
	      no /= 4; // no = no / 4;와 같은 것이다.
	      System.out.println("no=" + no); //no=2 (몫)
	      
	      no %= 3; // no = no % 3;와 같은 것이다.
	      System.out.println("no=" + no); //no=2 (나머지)
	      
	      
	      // #### 9. 삼항연산자 ####
	     /*
          변수선언 = (조건식)?값1:값2;
          
           변수를 선언하고 나서 값을 부여하고자 할때 사용되어지는데 
           조건식이 참 이라면 변수에 값1 을 대입해주고, 
           만약에 조건식이 거짓 이라면 변수에 값2 를 대입해준다.   
      */
	      System.out.println("\n==== 9. 삼항연산자 ====");
	      int num1 = 50 , num2 = 60;
	      int num3=(num1 > num2)?num1:num2;
	      //             false
	      // num3 = num2;
	      
	      System.out.println("num3 ="+num3);
	      //num3 = 60
	      

	}

}