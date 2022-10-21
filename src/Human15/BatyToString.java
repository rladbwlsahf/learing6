package Human15;

public class BatyToString {

	public static void main(String[] args) {
		byte[] b = { 72, 101, 108, 111, 32, 74, 97, 118, 97 };
		String str1 = new String(b);
		//아스키 코드 수치를 문자로 변환하여 문자열 생성
		System.out.println(str1);
		
		String str2 = new String(b,6,4);
		// 6번째에서 4개를 선택해 문자열 생성
		System.out.println(str2);
		
	}

}
