package ch13.exam;

	public class Util {

		public static <K, V> V getValue(Pair<K, V> p, K k) {
		if(p.getKey().equals(k)) {
			return p.getValue();
		} else {
			return null;
		}
	}

}