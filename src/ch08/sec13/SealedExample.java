package ch08.sec13;

public class SealedExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplClass impl = new ImplClass();

		System.out.println("----InterfaceA----");
		InterfaceA ia = impl;
		ia.methodA();
		 

		System.out.println("----InterfaceB----");
		InterfaceB ib = impl;
		ib.methodA();
		ib.methodB();
		
		System.out.println("----InterfaceC----");
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();		
	}
}
