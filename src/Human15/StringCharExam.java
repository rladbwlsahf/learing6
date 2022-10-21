package Human15;

public class StringCharExam {

	public static void main(String[] args) {
		String snn = "970814 - 10000000";
		char a = snn.charAt(0);
		// charAt이란 메서드는 String 클래스의 메서드로써. char 타입의 값으로 되돌려주는 메서드 이다.
		
		System.out.println(a);
		
		switch (a) {
		case '1':
		case '3':
			System.out.println("남성입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여성입니다.");
			break;
		}
	}

}
