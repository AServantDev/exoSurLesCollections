package exerciceCollection.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class exoHashSet {

	public void exo1() {

		Set<String> hs = new HashSet();

		hs.add("Dio");
		hs.add("Josuke");
		hs.add("Jolyne");
		hs.add("Joseph");
		System.out.println(hs);
	}

	public void exo2() {

		Set<String> hs = new HashSet();

		hs.add("Dio");
		hs.add("Josuke");
		hs.add("Jolyne");
		hs.add("Joseph");

		System.out.println("=== Iterate over a HashSet using iterator() ===");
		Iterator<String> hsIterator = hs.iterator();
		while (hsIterator.hasNext()) {
			String programmingLanguage = hsIterator.next();
			System.out.println(programmingLanguage);
		}

	}

	public void exo3() {

		Set<String> hs = new HashSet();

		hs.add("Dio");
		hs.add("Josuke");
		hs.add("Jolyne");
		hs.add("Joseph");
		System.out.println(hs.size());
	}
	
	public void exo4() {

		Set<String> hs = new HashSet();

		hs.add("Dio");
		hs.add("Josuke");
		hs.add("Jolyne");
		hs.add("Joseph");
		hs.clear();
		System.out.println(hs.size());
	}
	
	public void exo5() {

		Set<String> hs = new HashSet();

		hs.add("Dio");
		hs.add("Josuke");
		hs.add("Jolyne");
		hs.add("Joseph");
		System.out.println(hs.isEmpty());
	}
	
	public void exo6() {

		Set<String> hs = new HashSet();

		hs.add("Dio");
		hs.add("Josuke");
		hs.add("Jolyne");
		hs.add("Joseph");
		
		Set<String> hs2 = new HashSet(hs);
		
		System.out.println(hs2);
	}
	
	public void exo8() {

		Set<String> hs = new HashSet();

		hs.add("Dio");
		hs.add("Josuke");
		hs.add("Jolyne");
		hs.add("Joseph");
		ArrayList<String> ahs = new ArrayList<String>(hs);
		System.out.println(ahs);
	}

}
