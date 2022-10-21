package Human15;

public class StringEqualsExam {

	public static void main(String[] args) {
		String strVal1 = new String("김우진");
		String strVal2 = new String("김우진");
		
		System.out.println (strVal1 == strVal2);		// false
		System.out.println (strVal1.equals(strVal2));	// true
		// String 클래스는 최상위 클래스인 Object 클래스를 상속 받았고.
		// equals 란 메서드는 Object가 가지고 있는 메서드 인데. 이는 주소값을 비교하는 메서드 이지만.
		// String 클래스에서 멤버변수 (위의 "김우진")의 값을 비교하도록 오버라이딩 하였기때문에
		// equals 메서드를 사용하면 true가 나온다.
	}

}
