package org.welleby.commons.time;

import java.time.DayOfWeek;

public class DayOfWeekHelper {
	public static DayOfWeek getDay(String day) {
		if(day.trim().equalsIgnoreCase("M�ndag"))
			return DayOfWeek.MONDAY;
		else if(day.trim().equalsIgnoreCase("Tidsag"))
			return DayOfWeek.TUESDAY;
		else if(day.trim().equalsIgnoreCase("Onsdag"))
			return DayOfWeek.WEDNESDAY;
		else if(day.trim().equalsIgnoreCase("Torsdag"))
			return DayOfWeek.THURSDAY;
		else if(day.trim().equalsIgnoreCase("Fredag"))
			return DayOfWeek.FRIDAY;
		else if(day.trim().equalsIgnoreCase("L�rdag"))
			return DayOfWeek.SATURDAY;
		else if(day.trim().equalsIgnoreCase("S�ndag"))
			return DayOfWeek.SUNDAY;
		return null;
	}
}
