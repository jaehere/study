package my.day10.a.array;

import java.util.Random;

public class notebook {

	public static void main(String[] args) {
	
		int[] ballArr = new int[45];
		int[] tempArr = new int[5];
		
		for(int i=0;i<ballArr.length;i++) {
			ballArr[i]=i+1;
			
		}
		for(int i=0;i<tempArr.length;i++) {
			tempArr[i]=-1;
			
		}
		
		Random rnd = new Random();
		String result = "";
		outer:
		for(int i=0;i<6;i++) {
			int idx = rnd.nextInt(44-0+1)+0;
			
			for(int j=0;j<tempArr.length;j++) {
				if(idx == tempArr[j]) {
					i--;
					continue outer;
					
				}
				
			}
			
			if(i<5) {
				tempArr[i]=idx;
			}
			String str_add = (i<6-1)?",":"";
			result += ballArr[idx]+str_add;
			
		}
		
		System.out.println(result);
		
	}//end of main--------------

}
