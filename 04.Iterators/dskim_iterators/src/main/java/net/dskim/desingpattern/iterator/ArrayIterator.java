package net.dskim.desingpattern.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

import lombok.extern.slf4j.Slf4j;

/***
 * 배열을 위한 iterator
 */
@Slf4j
public class ArrayIterator implements Iterator<Object>{
	Object[] array;
	int index = 0;

	public ArrayIterator(Object[] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		return index <= array.length - 1;
	}

	@Override
	public Object next() {
		if(!hasNext()) throw new NoSuchElementException();
		return array[index++];
	}
}