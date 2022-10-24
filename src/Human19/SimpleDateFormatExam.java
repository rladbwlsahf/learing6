package Human19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExam {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// yyyy : 년도
//		MM : 월
//		dd : 일
//		hh : 시간
//		mm : 분
//		ss : 초
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sdf.format(now));
		
		//시간에 대해서 오전,오후/ 요일.~번쨰 날
		//a 는 오전/오후를 의미함.
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초 E요일");
		System.out.println(sdf.format(now));
		//E 는 요일 
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초 E요일. 올해 D번째날 ");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초 E요일 올해 d번째날");
		System.out.println(sdf.format(now));
		//D ==>올해의 몇번째 날. d ==>이달의 몇번째 날
	
		
	}

}
