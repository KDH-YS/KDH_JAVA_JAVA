package ch06.sec07;

public class Test {
	String model;
	int speed;
	
	void car(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void frun() {
		System.out.println(this.model+"가 달립니다.(시속:"+this.speed + "km/h)");
	}
}
