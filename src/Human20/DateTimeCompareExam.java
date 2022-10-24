package Human20;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExam {

	public static void main(String[] args) {
		LocalDateTime startTime = LocalDateTime.of(2023,1,1,9,0,0);
		LocalDateTime endTime = LocalDateTime.of(2024, 12, 31, 23,59,59);
		
		System.out.println("시작시간 : "+startTime);
		System.out.println("종료시간 : "+endTime);
		
		if (startTime.isBefore(endTime)) {
			System.out.println("startTime이 endTime보다 빠릅니다.");
			
		}
		else if (startTime.isEqual(endTime)) {
			System.out.println("startTime과 endTime은 같습니다.");
		}
			
		else if (startTime.isAfter(endTime)) {
			System.out.println("startTime이 endTime보다 늦습니다.");
		}
		System.out.println("종료까지 남은 시간");
		
		long remainYear = startTime.until(endTime, ChronoUnit.YEARS);
		System.out.println("종류까지 남은 시간(연도) : " + remainYear);
		
		long remainMonth = startTime.until(endTime, ChronoUnit.MONTHS);
		System.out.println("종류까지 남은 시간(월) : " + remainMonth);
		
		long remainDay = startTime.until(endTime, ChronoUnit.DAYS);
		System.out.println("종류까지 남은 시간(일) : " + remainDay);
		
		long remainMinute = startTime.until(endTime, ChronoUnit.MINUTES);
		System.out.println("종류까지 남은 시간(분) : " + remainMinute);
		
		long remainSeconds = startTime.until(endTime, ChronoUnit.SECONDS);
		System.out.println("종류까지 남은 시간(초) : " + remainSeconds);
		
		System.out.println("-------------------------------------");
		System.out.println("종료까지 남은 시간(연도) : " +  ChronoUnit.YEARS.between(startTime, endTime));
		System.out.println("종료까지 남은 시간(월) : " +  ChronoUnit.MONTHS.between(startTime, endTime));
		System.out.println("종료까지 남은 시간(일) : " +  ChronoUnit.DAYS.between(startTime, endTime));
		System.out.println("종료까지 남은 시간(시간) : " +  ChronoUnit.MONTHS.between(startTime, endTime));
		System.out.println("종료까지 남은 시간(분) : " +  ChronoUnit.MINUTES.between(startTime, endTime));
		System.out.println("종료까지 남은 시간(초) : " +  ChronoUnit.SECONDS.between(startTime, endTime));
		
		System.out.println("-------------------------------------");
		Period p = Period.between(startTime.toLocalDate(), endTime.toLocalDate());
		System.out.print("종료까지 남은 시간(연도) : " + p.getYears() + "년");
		System.out.print(p.getMonths() + "월");
		System.out.print(p.getDays() + "일");
		
		System.out.println("\n-------------------------------------");
		Duration d = Duration.between(startTime, endTime);
//		startTime.toLocalDate(), endTime.toLocalTime() 얜모지
		System.out.println("남은시간(초) : "+ d.getSeconds());
		
//		Duration 에서는 날짜는 상관없이 시간만 계산하였음. 09:00:00~23:59:00 ==>53999초
		
		
		
	}
}

