package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer>map = new HashMap<>();
		
		map.put("엄복동",60);
		map.put("홍길동",75);
		map.put("장발장",99);
		map.put("엄복동",45);
		System.out.println("총 객채수:"+map.size());
		System.out.println("------------");
		
		String key = "홍길동";
		int value = map.get("장발장");
		System.out.printf("%s : %d\n", key, value);
		System.out.println("------------");
		
		Set<String> KeySet = map.keySet();
		Iterator<String> KeyIter = KeySet.iterator();
		
		while(KeyIter.hasNext()) {
			String strKey = KeyIter.next();
			int iValue = map.get(strKey);
			System.out.printf("%s : %d\n", strKey, iValue);
		}
		map.remove("엄복동");
		
		System.out.println("전체목록 (EntrySet)------");
		Set< Entry<String,Integer> > entrySet = map.entrySet();
		Iterator<Entry<String,Integer> > entryIter = entrySet.iterator();
		while(entryIter.hasNext()) {
			Entry<String, Integer> entry = entryIter.next();
			System.out.printf("%s : %d\n", entry.getKey(), entry.getValue());
		}
	}
}
