package exerciceCollection.dao;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class exoLinkedList {

	public void exo1() {
		List lk = new LinkedList();

		lk.add("Joseph");
		System.out.println(lk);
	}

	public void exo2() {

		List lk = new LinkedList();

		lk.add("Joseph");
		lk.add("Jonathan");
		lk.add("Josuke");
		lk.add("Jolyne");

		for (Object jo : lk) {
			System.out.println(jo);
		}

	}

	public void exo3() {

		List lk = new LinkedList();

		lk.add("Joseph");
		lk.add("Jonathan");
		lk.add("Josuke");
		lk.add("Jolyne");

		ListIterator<String> it = lk.listIterator(lk.size());
		while (it.hasPrevious())
			System.out.println(it.previous());

	}

	public void exo5() {

		List lk = new LinkedList();

		lk.add("Joseph");
		lk.add("Jonathan");
		lk.add("Josuke");
		lk.add("Jolyne");

		lk.set(3, "Jotaro");
		System.out.println(lk);

	}

	public void exo6() {

		List lk = new LinkedList();

		lk.add("Joseph");
		lk.add("Jonathan");
		lk.add("Josuke");
		lk.add("Jolyne");

		((LinkedList) lk).addFirst("Josuke");
		System.out.println(lk);
		((LinkedList) lk).addLast("Dio");
		System.out.println(lk);

	}

	public void exo7() {

		List lk = new LinkedList();

		lk.add("Joseph");
		lk.add("Jonathan");
		lk.add("Josuke");
		lk.add("Jolyne");

		System.out.println(((LinkedList) lk).getLast());
		System.out.println(((LinkedList) lk).getFirst());

	}

	public void exo8() {

		List lk = new LinkedList();

		lk.add("Joseph");
		lk.add("Jonathan");
		lk.add("Josuke");
		lk.add("Jolyne");

		for (int i = 0; i < lk.size(); i++) {
			System.out.println("L'emplacement " + i + " est gardé par " + lk.get(i));
		}

	}

	public void exo9() {

		List lk = new LinkedList();

		lk.add("Joseph");
		lk.add("Jonathan");
		lk.add("Josuke");
		lk.add("Jolyne");

		lk.remove(2);

	}

	public void exo10() {

		List lk = new LinkedList();

		lk.add("Joseph");
		lk.add("Jonathan");
		lk.add("Josuke");
		lk.add("Jolyne");

		((LinkedList) lk).removeFirst();
		((LinkedList) lk).removeLast();
		System.out.println(lk);

	}

	public void exo11() {

		List lk = new LinkedList();

		lk.add("Joseph");
		lk.add("Jonathan");
		lk.add("Josuke");
		lk.add("Jolyne");

		lk.clear();
		System.out.println(lk);

	}

	public void exo12() {

		List lk = new LinkedList();

		lk.add("Joseph");
		lk.add("Jonathan");
		lk.add("Josuke");
		lk.add("Jolyne");

		Collections.swap(lk, 0, 3);
		System.out.println(lk);

	}

	public void exo13() {

		List lk = new LinkedList();

		lk.add("Joseph");
		lk.add("Jonathan");
		lk.add("Josuke");
		lk.add("Jolyne");

		Collections.shuffle(lk);
		System.out.println(lk);

	}
	
	public void exo14() {

		List lk = new LinkedList();

		lk.add("Joseph");
		lk.add("Jonathan");
		lk.add("Josuke");
		lk.add("Jolyne");

		String jojo = (String) ((LinkedList) lk).removeLast();
		System.out.println(jojo);

	}
	public void exo15() {

		List lk = new LinkedList();

		lk.add("Joseph");
		lk.add("Jonathan");
		lk.add("Josuke");
		lk.add("Jolyne");

		String jojo = (String) ((LinkedList) lk).removeLast();
		System.out.println(jojo);

	}

}
