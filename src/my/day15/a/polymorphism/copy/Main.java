package my.day15.a.polymorphism.copy;

public class Main {

	public static void main(String[] args) {
		// >>> 다형성(Polymorphism) <<< 
		// ==> 상속을 이용하여 여러 클래스 타입을 하나의 클래스 타입으로 다루는 기술.
		// 필수암기 !@@ 자식클래스로 생성되어진 객체를 부모 클래스 타입으로 받을 수 있다는 것이 다형성(Polymorphism)이다.
		
		
		Animal[] aniArr = new Animal[5];
		
		Dog dog = new Dog();
//		Animal ani1 = new Dog(); //가능 다형성
//		aniArr[0] = new Dog(); //가능
		dog.setName("뽀삐");
		dog.setBirthYear(2010);
		dog.setWeight(5);
		aniArr[0] = dog;
		
		Cat cat = new Cat();
//		Animal ani2 = new Cat(); //가능 다형성
//		aniArr[1] = new Cat(); //가능
		cat.setName("톰");
		cat.setBirthYear(2017);
		cat.setColor("검정");
		aniArr[1] = cat;
		
		Duck duck = new Duck();
//		Animal ani3 = new Duck(); //가능 다형성
//		aniArr[2] = new Duck(); //가능
		duck.setName("도널드");
		duck.setBirthYear(2018);
		duck.setPrice(5000);
		aniArr[2] = duck;
		
		Animal ani = new Animal();
		aniArr[3] = ani;
		
		
		
		for(int i=0; i<aniArr.length;i++) {
			if(aniArr[i]!=null)
				aniArr[i].showInfo();
			
		}//end of for---
		
		System.out.println("\n~~~~~~~~~~~~~~~~\n");
		
		for(int i=0; i<aniArr.length;i++) {
			if(aniArr[i]!=null)
				aniArr[i].cry();
			
		}//end of for---
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~\n");
		
		
		for(int i=0; i<aniArr.length;i++) {
			if(aniArr[i]!=null)
				if(aniArr[i] instanceof Dog ) {  //instanceof 기억하기
					//aniArr[i] 저장소에 들어있는 instance(객체)가 Dog라는 클래스로 만든 instance(객체)입니까?
					((Dog)aniArr[i]).run();  //casting해준다 강제형변환  괄호 꼭 필수
				}
				else if(aniArr[i] instanceof Cat ) {
					//aniArr[i] 저장소에 들어있는 instance(객체)가 Cat이라는 클래스로 만든 instance(객체)입니까?
					((Cat)aniArr[i]).jump();  //casting해준다 강제형변환  괄호 꼭 필수
				}
				else if(aniArr[i] instanceof Duck ) {
					//aniArr[i] 저장소에 들어있는 instance(객체)가 Duck라는 클래스로 만든 instance(객체)입니까?
					((Duck)aniArr[i]).swim();  //casting해준다 강제형변환  괄호 꼭 필수
				}
			
		}//end of for---
		
		
		
	}//end of public static void main(String[] args)

}
