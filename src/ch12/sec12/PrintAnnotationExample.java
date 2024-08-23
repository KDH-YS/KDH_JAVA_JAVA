package ch12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Service service = new Service();
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
			pintLine(printAnnotation);
			method.invoke(service);
		}

		
		
		
	}

	private static void pintLine(PrintAnnotation printAnnotation) {
		// TODO Auto-generated method stub
		if(printAnnotation != null) {
			int number = printAnnotation.number();
			for(int i=0; i<number; i++) {
				String value = printAnnotation.value();
				System.out.print(value);
			}
			System.out.println();
		}
	}
}
