package org.welleby.commons.time;

import java.time.DayOfWeek;
import java.util.Calendar;

public class DayOfWeekHelper {
	public enum DayOfWeekConvertion{
		SUNDAY(1,7),
		MONDAY(2,1),
		TUESDAY(3,2),
		WEDNESDAY(4,3),
		THURSDAY(5,4),
		FRIDAY(6,5),
		SATURDAY(7,6);
		
		int calendar;
		int time;
		private DayOfWeekConvertion(int cal, int time) {
			this.calendar = cal;
			this.time = time;
		}
		public static DayOfWeek convert(Calendar cal) {
			for (DayOfWeekConvertion dayOfWeek : DayOfWeekConvertion.values()) {
				if(dayOfWeek.calendar == cal.get(Calendar.DAY_OF_WEEK))
					return DayOfWeek.of(dayOfWeek.time);
			}
			return null;
		}
		public static int convert(DayOfWeek day) {
			DayOfWeekConvertion dayConvertion = DayOfWeekConvertion.valueOf(day.name());
			return dayConvertion==null? null : dayConvertion.calendar;
		}
	}
	
	public static DayOfWeek getDay(String day) {
		if(day.trim().equalsIgnoreCase("Måndag"))
			return DayOfWeek.MONDAY;
		else if(day.trim().equalsIgnoreCase("Tisdag"))
			return DayOfWeek.TUESDAY;
		else if(day.trim().equalsIgnoreCase("Onsdag"))
			return DayOfWeek.WEDNESDAY;
		else if(day.trim().equalsIgnoreCase("Torsdag"))
			return DayOfWeek.THURSDAY;
		else if(day.trim().equalsIgnoreCase("Fredag"))
			return DayOfWeek.FRIDAY;
		else if(day.trim().equalsIgnoreCase("Lördag"))
			return DayOfWeek.SATURDAY;
		else if(day.trim().equalsIgnoreCase("Söndag"))
			return DayOfWeek.SUNDAY;
		return null;
	}
	
	public static DayOfWeek getDay(Calendar cal) {
		return DayOfWeekConvertion.convert(cal);
	}
}
