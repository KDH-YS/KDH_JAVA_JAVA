package ch13.exam;

public class Container2<T,V>{
	
	private T key;
	private V value;
    
	public void set(T key, V value) {
        this.key = key;
        this.value = value;
    }
	public T getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	
}