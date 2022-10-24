package Human18;

import java.text.DecimalFormat;

public class DecimalFormatExam {

	public static void main(String[] args) {
		double num = 1123456.789;
		
		DecimalFormat df = new DecimalFormat("0");		// 소수점 반올림.
		System.out.println(df.format(num));				
		
		df = new DecimalFormat("0.0");		// 소수점 둘째자리에서 반올림하여 첫째자리까지만 표시.
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0000");		
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");		// 십진수 표시.		
		System.out.println(df.format(num));

		df = new DecimalFormat("#.#");		// 십진수 표시. 소수점 까지 출력		
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.0");		// 위와 동일		
		System.out.println(df.format(num));

		df = new DecimalFormat("+#.0");			
		System.out.println(df.format(num));
		
		df = new DecimalFormat("-#.0");		// 표시만 음수일뿐 num이란 수치가 음수로 변환 된 것은 아님.
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###");	// 1000단위 , (콤마) 표시
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.00E0");	//	1.12E6 ==> 1.12 * 10의 6 제곱. = 1.1*100000	
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#,### ; -#,###");	// 양수이면 +, 음수이면 -를 붙임.		
		System.out.println(df.format(num));			//<<==많이 쓰임
		
		df = new DecimalFormat("#.#%");		//% 표시
		System.out.println(df.format(num));
		
		df = new DecimalFormat("\u00A4#.###");	// 원표시. \u00A4 ==> 화폐단위 중 원.
		System.out.println(df.format(num));
		
		//#쓰는 이유. 앞에 부호를 넣을수 있음




	}

}
