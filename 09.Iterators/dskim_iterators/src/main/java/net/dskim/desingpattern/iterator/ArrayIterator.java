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
		boolean hasNext = index <= array.length - 1;
		//log.info("index={} hasNext={}", index, hasNext);
		return hasNext;
	}

	@Override
	public Object next() {
		if(!hasNext()) throw new NoSuchElementException();
		//log.info("index={} returning={}", index, array[index]);
		return array[index++];
	}
}