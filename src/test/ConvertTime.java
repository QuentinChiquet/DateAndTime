package test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ConvertTime {

	public static void main(String[] args) {
		System.out.println("Departure: " + departure);
		System.out.println("Arrival: " + arrival);

	}

	static LocalDateTime leaving = LocalDateTime.of(2014, Month.JULY, 11, 19, 30);
	static ZoneId leavingZone = ZoneId.of("America/Los_Angeles");
	static ZonedDateTime departure = ZonedDateTime.of(leaving, leavingZone);

	static ZoneId arrivingZone = ZoneId.of("Asia/Tokyo");
	static ZonedDateTime arrival = departure.withZoneSameInstant(arrivingZone)
			.plusHours(10).plusMinutes(50);

}
