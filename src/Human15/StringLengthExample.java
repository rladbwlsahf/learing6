package Human15;

public class StringLengthExample {

	public static void main(String[] args) {
		String ssn = "9708141000000";
		
		int len = ssn.length();
		System.out.println(len);

		if (len == 13 ) {
			System.out.println("주민번호 자리수가 맞습니다.");
		}
		else {
			System.out.println("주민번호 자리수가 맞지않으므로 다시 확인해주세요.");
		}
	}

}
