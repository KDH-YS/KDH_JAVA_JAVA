package ch09.sec03;

public class A {
	
	static class B{
		int field1 = 1;
		
		static int field2= 2;
		B(){
			System.out.println("B-생성자 실행");
		}
		void method1() {
			System.out.println("B-method 실행");
		}
		
		static void method2() {
			System.out.println("B-method2 실행");
		}
		
		
	}
	
	B field = new B();

	
	A(){
		B b = new B();
	}
	
	
	void method1() {
		B b = new B();
		
	}
	
	static void method2() {
		B b = new B();
	}

	
	
	}
	


