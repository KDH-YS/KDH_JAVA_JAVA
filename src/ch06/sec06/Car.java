package ch06.sec06;

public class Car {
	String company ="현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed ;
	boolean start;
	
	public Car (){
		System.out.println("생략");
		this.company="기아자동차";
	}
	public Car(String company) {
		System.out.println("오버로드");
	this.company = company;
	}
	public Car(int speed) {
		System.out.println("생성자3");
	this.speed=speed;
	
	}


}

