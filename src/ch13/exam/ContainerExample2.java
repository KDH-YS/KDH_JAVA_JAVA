package ch13.exam;


public class ContainerExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container2<String, String> container1 = new Container2<>();
		container1.set("홍길동","도적");
		String name1 = container1.getKey();
		String job= container1.getValue();
		

		Container2<String, Integer> container2 = new Container2<>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		
		System.out.printf("이름:%s 직업:%s 나이:%d",name1,job,age);
		
		
	}

}
