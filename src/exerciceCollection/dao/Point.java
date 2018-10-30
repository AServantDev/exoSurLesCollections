package exerciceCollection.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Point implements Comparable<Point> {

	int x;
	int y;

	public Point(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public Point getInvertedPoint() {

		return new Point(y, x); // inversion
	}

	@Override
	public String toString() {
		return String.format("%d,%d", x, y);
	}

	@Override
	public int compareTo(Point other) {

		if (other == null)
			return 1;
		if (this.x < other.x)
			return -1;
		if (this.x > other.x)
			return 1;

		if (this.y < other.y)
			return -1;
		if (this.y > other.y)
			return 1;
		return 0;
	}

	// @run: Point

	public static void main(String[] args)

	{

		List<Point> l = new ArrayList<>();

		l.add(new Point(1, 2));

		l.add(new Point(0, 1));

		l.add(new Point(7, 0));

		Collections.sort(l);

		System.out.println(l);

	}

}
