package ch15.sec05.exam04;

import java.util.TreeSet;

public class ComparatorExample {
	
	public static void main(String [] args) {
		TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());

		treeSet.add(new Fruit("포도",1000));
		treeSet.add(new Fruit("사과",500));
		treeSet.add(new Fruit("복숭아",2000));
		
		for(Fruit fruit:treeSet) {
			System.out.println(fruit.price+ " "+fruit.name);
		}
	}

}
