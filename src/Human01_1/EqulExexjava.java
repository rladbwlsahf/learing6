package Human01_1;

public class EqulExexjava extends Object{
	// 모든 클래스는  Object라는 클래스를 상속받음.(생략가능)
	
	public static void main(String[]args) {
		int a = 10;
		int b = 10;
		System.out.println(a==b);
		System.out.println("--------------------");
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println("obj1 : " + obj1);
		System.out.println("obj2 : " + obj2);
		System.out.println(obj1==obj2);
		System.out.println("--------------------");
		
		String str1 = new String("김우진");
		String str2 = new String("김우진");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		//	String클래스 안에는 equals란 메서드가 있는데.
		//	이 메서드는 각 개체가 가지고 있는 멤버변수간의 비교를 수행하는 가능하도록 한다.
		
		
		System.out.println("--------------------");
	}   
}

