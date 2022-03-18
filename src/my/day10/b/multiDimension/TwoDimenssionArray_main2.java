package my.day10.b.multiDimension;

public class TwoDimenssionArray_main2 {

	public static void main(String[] args) {
		
		int[][] numArr = new int[4][];  //4행 null열
/*	
 * 	 	// 열의 크기를 설정하지 않았으므로 NullPointerException 발생함.	
		numArr[0][0] = 10;
		numArr[0][1] = 20;
		numArr[0][2] = 30;
		
		numArr[1][0] = 40;
		numArr[1][1] = 50;
		numArr[1][2] = 60;
*/		
		numArr[0] = new int[3];  //0행은 3열로 설정함.
		numArr[1] = new int[2];  //1행은 2열로 설정함.
		numArr[2] = new int[4];  //2행은 4열로 설정함.
		numArr[3] = new int[3];  //3행은 3열로 설정함.
		//열이 몇개인지 꼭 넣어줘야함
		
		numArr[0][0] = 10;
		numArr[0][1] = 20;
		numArr[0][2] = 30;
		
		numArr[1][0] = 40;
		numArr[1][1] = 50;
//		numArr[1][2] = 60;  //java.lang.ArrayIndexOutOfBoundsException 발생함.
		
		numArr[2][0] = 70;
		numArr[2][2] = 90;
		
		for(int i=0; i<numArr.length;i++) {
			for(int j=0; j<numArr[i].length;j++) {
				String str = ( j<numArr[i].length-1)?",":"\n";
				System.out.printf("%2d%s",numArr[i][j],str);
			}//end of for---------
		}//end of for-------
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		int[][] numArr2 = {{10,20,30},
							{40,50},
							{70,0,90,100},
							{0,0,0}
							};
		for(int i=0; i<numArr2.length;i++) {   //4행

			for(int j=0; j<numArr2[i].length;j++) {  //3열  2열  4열  3열
				String str = ( j<numArr2[i].length-1)?",":"\n";
				System.out.printf("%2d%s",numArr2[i][j],str);
			}//end of for---------
		}//end of for-------
		
		
	}//end of main ------------

}
