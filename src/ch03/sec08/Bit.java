package ch03.sec08;

public class Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte leds = (byte) 0b11111111;
		
		int index = 1;
		byte chk_led = (byte)(1<<index);
		if((leds &chk_led)==chk_led) {
			System.out.printf("%d램프가 켜져있습니다.", index);
		}else {
			System.out.printf("%d램프가 꺼져있습니다.", index);
		}
	}

}
