package com.code.container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void display(Collection<?> c) {
		Iterator<?> itr = c.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>(Arrays.asList("one",
				"two", "three", "four", "five", "six", "seven", "eight",
				"nine", "ten"));
		System.out.println(arrayList.toString());

		List<String> linkedList = new LinkedList<String>(Arrays.asList("one",
				"two", "three", "four", "five", "six", "seven", "eight",
				"nine", "ten"));
		System.out.println(linkedList);

	}

}
