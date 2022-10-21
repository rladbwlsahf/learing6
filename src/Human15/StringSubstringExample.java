package Human15;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "761230-1234567";
		String first = ssn.substring(0, 6); //0~6번쨰까지
		String second = ssn.substring(7);	//7에서 끝까지
		
		System.out.println(first);
		System.out.println(second);

	}

}
