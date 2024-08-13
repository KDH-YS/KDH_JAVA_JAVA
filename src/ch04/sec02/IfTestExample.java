
package ch04.sec02;

import java.util.Scanner;

public class IfTestExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수: ");
		String input =scan.nextLine();
		int num = Integer.parseInt(input);
        if (num >= 90) {
            System.out.println("A 등급입니다.");
        } else if (num >= 80) {
            System.out.println("B 등급입니다.");
        } else if (num >= 70) {
            System.out.println("C 등급입니다.");
        } else if (num >= 60) {
            System.out.println("D 등급입니다.");
        } else {
            System.out.println("F 등급입니다.");
        }
	}
}
