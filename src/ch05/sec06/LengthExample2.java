package ch05.sec06;

public class LengthExample2 {
    public static void main(String[] args) {
        String date1 = "2024년08월 12일 18:45:00";
        String date2 = "2024-08-12 pm 11:25:03";
        String date3 = "24/8/12 am 06:25:13";

        // 원하는 목표 시간
        int targetHour = 20;
        int targetMinute = 59;
        int targetSecond = 60;

        // 예제 날짜를 선택합니다.
        String strDate = date1;  // 다른 날짜 문자열을 선택할 수 있습니다.

        // 시간, 분, 초를 초기화합니다.
        int hour = 0;
        int minute = 0;
        int second = 0;

        if (strDate.contains("pm")) {
            hour += 12;
        }

        // 시간, 분, 초를 추출합니다.
        int hourIndex = strDate.indexOf(":") - 2;  // 시간 시작 인덱스
        String strHour = strDate.substring(hourIndex, hourIndex + 2).trim();
        hour += Integer.parseInt(strHour);

        int minuteIndex = strDate.indexOf(":") + 1;
        String strMinute = strDate.substring(minuteIndex, minuteIndex + 2).trim();
        minute += Integer.parseInt(strMinute);

        int secondIndex = strDate.lastIndexOf(":") + 1;
        String strSec = strDate.substring(secondIndex, secondIndex + 2).trim();
        second += Integer.parseInt(strSec);

        // 남은 시간 계산
        int totalSeconds = (targetHour * 3600 + targetMinute * 60 + targetSecond);
        int currentSeconds = (hour * 3600 + minute * 60 + second);
        int remainingSeconds = totalSeconds - currentSeconds;

        int remainingHours = remainingSeconds / 3600;
        int remainingMinutes = (remainingSeconds % 3600) / 60;
        int remainingSecondsLeft = remainingSeconds % 60;

        System.out.printf("8/12 오후 9시정각까지 %02d시 %02d분 %02d초가 남았습니다.%n",
                          remainingHours, remainingMinutes, remainingSecondsLeft);
    }
}
