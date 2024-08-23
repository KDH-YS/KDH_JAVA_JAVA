package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
	public static void main(String [] args) {
    TreeSet<Person> treeSet = new TreeSet<>();
    
    // Person 객체 추가
    treeSet.add(new Person("홍길동", 45));
    treeSet.add(new Person("엄복동", 25));
    treeSet.add(new Person("장발장", 31));
    
    for(Person person : treeSet) {
    	System.out.println(person.name+":"+person.age);
    }
    
    
}
}