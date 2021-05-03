package net.dskim.desingpattern.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

import lombok.extern.slf4j.Slf4j;

/***
 * 배열 index가 높은 항목에서 낮은 항목으로 탐색하는 iterator
 */
@Slf4j
public class ReverseArrayIterator implements Iterator<Object>{
	Object[] reverseArray;
	int nextIndex = 0;

	public ReverseArrayIterator(Object[] originalArray) {
		reverseArray = new Object[originalArray.length];
		for(int reverseArrayIndex = 0 ; reverseArrayIndex < reverseArray.length ; reverseArrayIndex++){
			reverseArray[reverseArrayIndex] = originalArray[originalArray.length - 1 - reverseArrayIndex];
		}
	}

	@Override
	public boolean hasNext() {
		return nextIndex <= reverseArray.length - 1;
	}

	@Override
	public Object next() {
		if(!hasNext()) throw new NoSuchElementException();
		return reverseArray[nextIndex++];
	}
}