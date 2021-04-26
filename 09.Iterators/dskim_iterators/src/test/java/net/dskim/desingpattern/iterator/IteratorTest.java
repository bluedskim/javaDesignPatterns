package net.dskim.desingpattern.iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
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
		
		MyIterable arrayContainer = new ArrayContainer(names);

		int i = 0;
		Iterator<Object> arrayIterator = arrayContainer.iterator();
		while (arrayIterator.hasNext()) {
			assertEquals(names[i++], arrayIterator.next());
		}

		i = 0;
		Iterator<Object> reverseArrayIterator = arrayContainer.reverseIterator();
		while (reverseArrayIterator.hasNext()) {
			assertEquals(names[names.length - (++i)], reverseArrayIterator.next());
		}
	}	
}
