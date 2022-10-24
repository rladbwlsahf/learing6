package Human20;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCreateExam {

	public static void main(String[] args) throws InterruptedException {
		LocalDate currDate = LocalDate.now();
		System.out.println("현재 날짜 : " + currDate);
		LocalDate targetDate = LocalDate.of(2023, 1, 1);
		System.out.println("목표 날짜 : " + targetDate);
		
		System.out.println("---------------------");
		
		LocalTime currTime = LocalTime.now();
		System.out.println("현재 시간 : " + currTime);
		LocalTime targetTime = LocalTime.of(11, 58, 59);
		System.out.println("목표 시간 : " + targetTime);
		
		System.out.println("---------------------");
		
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("현재 시간 : " + currDateTime);
		LocalDateTime targetDateTime = LocalDateTime.of(2023, 1, 1, 13, 58, 59);
		System.out.println("목표 시간 : " + targetDateTime);
		
		System.out.println("---------------------");
		
		ZonedDateTime utcDateTime = ZonedDateTime.now();	// 한국 시간
		System.out.println("현재 날짜 시간 : " + utcDateTime);
		ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕 날짜 시간 : " + newyorkDateTime);
		
		System.out.println("---------------------");
		
		Instant i1 = Instant.now();
		Thread.sleep(1000);		// 1초를 기다렸다가 수행.
		Instant i2 = Instant.now();
		
		if(i1.isBefore(i2)){
			System.out.println("Instant1 이 Instant2보다 빠릅니다.");
		}
		else if (i1.isAfter(i2)) {
			System.out.println("Instant1 이 Instant2보다 늦습니다.");
			}
		else {
			System.out.println("Instant1 은 Instant2와 같습니다.");
		}
		System.out.println("차이 : "+ i1.until(i2, ChronoUnit.NANOS));
	}											//ChronoUnit 시간관련 .NANOS 얼마나 세밀하게

}
