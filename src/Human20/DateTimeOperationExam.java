package Human20;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTimeOperationExam {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재시간 : " + now.toString());
		
		// 날짜, 시간의 연산
		LocalDateTime targeDateTime1 = now.plusYears(1)
				.minusMonths(2)
				.plusDays(3)
				.plusHours(4)
				.minusMinutes(5)
				.plusSeconds(6);
		System.out.println("타겟 시간1 : " + targeDateTime1.toString());
		
		// 날짜, 시간의 직접 변경
		LocalDateTime targeDateTime2 = now.withYear(2024)
				.withMonth(8)
				.withDayOfMonth(20)
				.withHour(11);
		System.out.println("타겟 시간2 : " + targeDateTime2.toString());
		// 각 날짜의 특징에 따른 날짜 시간 구해오기
		
		System.out.println("-----------------------------");
		
		LocalDateTime targeDateTime3 = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("올해의 첫날은 ? " + targeDateTime3);
		LocalDateTime targeDateTime4 = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("올해의 마지막날 ? " + targeDateTime4);
		LocalDateTime targeDateTime5 = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("내년의 첫날은 ? " + targeDateTime5);
		
		System.out.println("-----------------------------");
		
		LocalDateTime targeDateTime6 = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이번달의 첫날은 ? " + targeDateTime6);
		LocalDateTime targeDateTime7 = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이번달의 마지막날 ? " + targeDateTime7);
		LocalDateTime targeDateTime8 = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("다음달의 첫날은 ? " + targeDateTime8);
		
		System.out.println("-----------------------------");
		
		LocalDateTime targeDateTime9 = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이번달의 첫 월요일은 ? " + targeDateTime9);
		LocalDateTime targeDateTime10 = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("현재시간 대비 다음주 월요일의 날짜는 ? " + targeDateTime10);
		LocalDateTime targeDateTime11 = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("현재시간 대비 지난주 월요일의 날짜는  ? " + targeDateTime11);
	}

}
