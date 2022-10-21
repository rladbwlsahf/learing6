package Human15;

import java.util.Iterator;

public class StringSplitExample {

	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김우진'김자바-최명호";
		String [] names = text.split("&|,|-");
		
//		for (String n : names) {
//			System.out.println(n);
//			}
		//	아래와 같다.
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
	}

}
