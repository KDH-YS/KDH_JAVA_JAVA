package ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        for (int i = 9; i < 81; i++) { // i는 2부터 81까지 증가합니다.
            int a = i  / 9 + 1;   // m은 현재 단을 계산합니다.
            int b = i  % 9 +1;   // n은 현재 단에서 곱해지는 수를 계산합니다.

            System.out.println(a + " X " + b + " = " + (a * b)); // 구구단 출력
        }
    }
}