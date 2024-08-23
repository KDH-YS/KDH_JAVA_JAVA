package ch13.exam;

class Container<T>{
	private T t;

	public T getContent() {
		return t;
	}

	public void setContent(T t) {
		this.t = t;
	}
	
	
}

public class ContainerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container<String> container1 = new Container<String>();
		container1.setContent("홍길동");
		String str = container1.getContent();
		
		Container<Integer> container2 = new Container<>();
		container2.setContent(6);
		int value = container2.getContent();
		
		System.out.println(value);
		System.out.println(str);

	}

}


