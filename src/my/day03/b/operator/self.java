package my.day03.b.operator;

public class self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n~~~~~~~~~퀴즈1~~~~~~~~\n");
		int i=3;
		int j=i++;//j=i; i++;
					//j = 3; i=>4
		
		if((i <= ++j) & (i++ == j)) {  //j =>3
		//   4 <= 4       
		//  true     &  i == j  i++;
		//  true    &  4 == 4  i++;
		//  true     &  true    i++; 
		//         true         i=>5
			
			i=i+j;
			
			//i= 5+4 = 9
		
		}
		System.out.println("i="+i);  // i=?   i=5
		
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
	      
	      if( (m1++ != 0) || (n1++ == 2) ) {
	        //  m1 != 0 m1++;
	        // 0 != 0
	        // false   m1=>1 || 1 == 2 n1++;
	    	// false      ||  false  n1=>2
	    	//        
	    	// 
	    	  m1=42;
	      }
	      
	      System.out.println("m1=>"+m1 + ", n1=>"+n1); // m1=>? , n1=>?  m1 = 42, n1 = 1
	//m1=1, n1=2
	      
	      
	}

}
