	package ch09.sec02;
	
	public class A {
		
		class B{
			int field1 = 1;
			
//			static int field2 = 2;		
			B(){
				System.out.println("B클래스 생성자 실행");
			}
			void method1() {
				System.out.println("B메소드1 실행");
				
				
			}
//			static void method2() {
//				System.out.println("B 스태틱 메소드2 실행");
//			}
			
		}
		void useB() {
			B b = new B();
		    b.method1();
			System.out.println(b.field1);
		}	
		
		
		B field = new B();
		
		A(){
			B b= new B();
		}
		void method() {
			B b = new B();
		}
	
		
	
	}
	
