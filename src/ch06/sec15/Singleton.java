package ch06.sec15;

public class Singleton {
	private static Singleton singleton = new Singleton();
	public String color = "blue";
	public int index;
	
	private Singleton() {
		super();
	}
	public static Singleton getInstance() {
		return singleton;
	}
}
