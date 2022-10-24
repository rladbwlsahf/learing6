package Human18;

import java.util.TimeZone;

public class TimeZoneExam {

	public static void main(String[] args) {
		String[] avilableIDs = TimeZone.getAvailableIDs();
		
		for (String a : avilableIDs) {
			System.out.println(a);
		}

	}

}
