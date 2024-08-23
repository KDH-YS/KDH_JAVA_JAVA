package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> score = new TreeSet<>();
		
		score.add(87);
		score.add(98);
		score.add(78);
		score.add(95);
		score.add(80);
		
		for(Integer s: score) {
			System.out.print(s+" ");
		}
		System.out.println("\n");
		
		System.out.printf("가장 낮은 점수:%d\n"
						+ "가장 높은 점수:%d\n"
						+ "95점 아래 점수:%d\n"
						+ "95점 위의 점수:%d\n"
						+ "95점이거나 바로아래 점수:%d\n"
						+ "85점이거나 바로 위의 점수:%d\n"
						,score.first(),score.last()
						,score.lower(95),score.higher(95)
						,score.floor(95),score.ceiling(85));
		
		NavigableSet<Integer> descendingScore= score.descendingSet();
		for(Integer s : descendingScore) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		NavigableSet<Integer> rangeSet = score.tailSet(80, true);
		for(Integer s : rangeSet) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		rangeSet= score.subSet(80, true, 90, false);
		for(Integer s:rangeSet) {
			System.out.print(s+" ");
		}
	}
}
