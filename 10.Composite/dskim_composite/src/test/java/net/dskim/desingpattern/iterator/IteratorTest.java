package net.dskim.desingpattern.iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class IteratorTest {

	/**
	 * java.util.List의 iterator테스트
	 */
	@Test
	void listIteratorTest() {
		List<String> names = new ArrayList<String>();
		names.add("Ajay");
		names.add("Vijay");
		names.add("Martin");
		names.add("Racheal");
		names.add("Kim");

		Iterator<String> namesIterator = names.iterator();
		int i = 0;
		while (namesIterator.hasNext()) {
			assertEquals(names.get(i++), namesIterator.next());
		}
	}

	@Test
	void arrayIteratorTest() {
		String[] names = {
			"Ajay"
			,"Vijay"
			,"Martin"
			,"Racheal"
			,"Kim"
		};

		Iterable<Object> arrayContainer = new ArrayContainer(names);
		Iterator<Object> arrayIterator = arrayContainer.iterator();
		int i = 0;
		while (arrayIterator.hasNext()) {
			assertEquals(names[i++], arrayIterator.next());
		}
	}	
}
