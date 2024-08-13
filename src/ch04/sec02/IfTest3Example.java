package ch04.sec02;

import java.util.Scanner;

public class IfTest3Example {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("점수: ");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);

        switch (num / 10) {
            case 10, 9 -> { 
                System.out.println("A학점 입니다.");
            }
            case 8 -> {
                System.out.println("B학점 입니다.");
            }
            case 7 -> {
                System.out.println("C학점 입니다.");
            }
            case 6 -> {
                System.out.println("D학점 입니다.");
            }
            default -> {
                System.out.println("F학점 입니다.");
            }	
        }

    }
}