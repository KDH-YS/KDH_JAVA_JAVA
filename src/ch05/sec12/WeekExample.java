package ch05.sec12;


import java.util.Calendar;
public class WeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Day today = null;
		
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
	
		
		switch(week) {
		case 1: today = Day.SUNDAY; break;
		case 2: today = Day.MONDAY; break;
		case 3: today = Day.TUESDAY; break;
		case 4: today = Day.WEDNESDAY; break;
		case 5: today = Day.THURSDAY; break;
		case 6: today = Day.FRIDAY; break;
		case 7: today = Day.SATURDAY; break;
		}
		
		if(today == Day.TUESDAY) {
			System.out.println("화요일");
		} else {

			System.out.println("화요일아님");
		}
		
		
	}

}
