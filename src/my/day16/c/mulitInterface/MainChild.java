package my.day16.c.mulitInterface;

public class MainChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child cd1 = new Child();
		cd1.work();
		cd1.cook();
		cd1.play();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		InterChild inchild = new Child();  //<=  이 방법으로 많이 씀
		inchild.work();
		inchild.cook();
		inchild.play();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		InterFather interfather = new Child();
		interfather.work();
		
		InterMother intermother = new Child();
		intermother.cook();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~\n");

		
		
	}

}
