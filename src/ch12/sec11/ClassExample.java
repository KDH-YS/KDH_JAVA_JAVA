package ch12.sec11;

import java.lang.reflect.*;


public class ClassExample {

	public static void main(String[] args) throws Exception {
		
		Car car = new Car("테슬라","일론머스크");

		Class clas = Car.class;
		
		System.out.println("패키지: "+ clas.getSimpleName());
		System.out.println("패키지: "+ clas.getPackage().getName());
		System.out.println("패키지: "+ clas.getName());
		
		
		System.out.println("------생성자정보------");
		Constructor[] constructors = clas.getDeclaredConstructors();
		for(Constructor constructor: constructors) {
			System.out.println(constructor.getName()+"(");
			StringBuilder sbr = new StringBuilder();
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		
		System.out.println("------필드정보-------");
		Field[] fields = clas.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getName()+" "+field.getName());
			
		}
		System.out.println();
		
		System.out.println("------메소드 정보-------");
		Method[] methods = clas.getDeclaredMethods();
		for(Method method : methods) {
			System.out.print(method.getName()+"(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}

	private static void printParameters(Class[] parameters) {
		// TODO Auto-generated method stub
		for(int i = 0; i<parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if(i<(parameters.length-1)) {
				System.out.print(",");
			}
		}
		
	}

}
