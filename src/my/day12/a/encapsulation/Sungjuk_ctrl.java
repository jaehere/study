package my.day12.a.encapsulation;

public class Sungjuk_ctrl {

	public void saveSungjuk(Sungjuk_capsule[] sungjukArr ,Sungjuk_capsule sj ) { 
		//제어하는 ctrl을 이것처럼 따로 만들어준다. 파라미터에 저장소를 받아와야 함. 또, 실제 저장해야할 성적 받아와야햄
		
		//return 타입이 boolean 이여서 
		if( sj.isPass()){
			sungjukArr[Sungjuk_capsule.count++] = sj;  //통과해야만 넣어주겠다
			System.out.println(">> 저장 성공!! << \n");
		}
		else {
			System.out.println(">> 저장 실패!! << \n");
		}
			
		
		  // check라는 검사자를 만들어야함
		
		sungjukArr[0] = sj;  //오늘은 0 쓰지만 내일 다시 바꿀거야
		
		
		
	}
	
	
}
