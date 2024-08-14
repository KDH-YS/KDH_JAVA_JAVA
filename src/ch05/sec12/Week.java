package ch05.sec12;


enum Day{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
public class Week {
	public static void main(String[] args) {
		Day Today = Day.WEDNESDAY;
		System.out.println("오늘은" +Today+"입니다.");
		
		switch(Today) {
		case MONDAY:
			System.out.println("월요일은 원래 마시는날");
			break;
		case TUESDAY:
			System.out.println("화요일은 안마시는날");
			break;
		case WEDNESDAY:
			System.out.println("수요일은 로요일");
			break;
		case THURSDAY:
			System.out.println("목요일은 던요일");
			break;
		case FRIDAY:
			System.out.println("금요일은 불금");
			break;
		case SATURDAY:
			System.out.println("토요일은 레요일");
			break;
		case SUNDAY:
			System.out.println("일요일은 레요일");
			break;
		}
	}
}
