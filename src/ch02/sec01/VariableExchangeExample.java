package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        
        // 변수 값을 교환하는 코드 추가
        int temp = x;
        x = y;
        y = temp;
        
        System.out.println("x: " + x); // x의 새로운 값 출력
        System.out.println("y: " + y); // y의 새로운 값 출력
    }
}