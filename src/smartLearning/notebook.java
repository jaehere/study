package smartLearning;

public class notebook {

	public static void main(String[] args) {
		//Wrapper 클래스 객체생성(오토박싱
		Boolean bn = true;
		Byte be = 100;
		Character cr = 'a';
		Short st = 200;
		
		
		//Wrpper 클래스 객체 출력(오토 언박싱)
		System.out.println(bn);
		System.out.println(be);
		System.out.println(cr);
		System.out.println(st);

		
		int num = Integer.parseInt("300");
		Integer in = num;
		
		float fin = in.floatValue();
		System.out.println(fin);
		System.out.println(Integer.toBinaryString(in)); //이진수
		System.out.println(Integer.toOctalString(in)); //팔진수
		System.out.println(Integer.toHexString(in)); //십육진수
		
		
		char[] data = {'a','A','3',' '};
		for(int i=0;i<data.length;i++) {
			if(Character.isDefined(data[i]))//유니코드값이냐
				System.out.println(data[i]+"=Unicode");
			if(Character.isDigit(data[i]))//숫자냐
				System.out.println(data[i]+"=Digit");
			if(Character.isLetter(data[i]))//문자냐
				System.out.println(data[i]+"=Letter");
			if(Character.isLetterOrDigit(data[i]))//문자 혹은 숫자냐
				System.out.println(data[i]+"=Letter Or Digit");
			if(Character.isLowerCase(data[i]))//소문자냐
				System.out.println(data[i]+"=LowerCase");
			if(Character.isUpperCase(data[i]))//대문자냐
				System.out.println(data[i]+"=UpperCase");
		}
		
		Double value = 11.0;
		double result = value.doubleValue() / 3.0; //기본자료형 더블로 변경하는 메소드 
		//0으로 나누면 무한대
		System.out.println(result);
		System.out.println(Double.isInfinite(result));
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		
	
		
		
		
	}//end of main----------

}
