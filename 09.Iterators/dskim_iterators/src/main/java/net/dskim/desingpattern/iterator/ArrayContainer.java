package net.dskim.desingpattern.iterator;

import java.util.Iterator;

/***
 * 배열을 위한 컨테이너
 */
public class ArrayContainer implements Iterable<Object>{
	Iterator<Object> arrayIterator;

	public ArrayContainer(Object[] array) {
		arrayIterator = new ArrayIterator(array);
	}

	@Override
	public Iterator<Object> iterator() {
		return arrayIterator;
	}

}