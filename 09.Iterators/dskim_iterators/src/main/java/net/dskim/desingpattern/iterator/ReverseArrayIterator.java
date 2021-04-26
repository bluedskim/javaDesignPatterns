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
		//log.info("originalArray.length={}", originalArray.length);
		reverseArray = new Object[originalArray.length];
		//log.info("reverseArray.length={}", reverseArray.length);
		for(int reverseArrayIndex = 0 ; reverseArrayIndex < reverseArray.length ; reverseArrayIndex++){
			reverseArray[reverseArrayIndex] = originalArray[originalArray.length - 1 - reverseArrayIndex];
		}
	}

	@Override
	public boolean hasNext() {
		boolean hasNext = nextIndex <= reverseArray.length - 1;
		//log.info("nextIndex={} hasNext={}", nextIndex, hasNext);
		return hasNext;
	}

	@Override
	public Object next() {
		if(!hasNext()) throw new NoSuchElementException();
		//log.info("nextIndex={} returning={}", nextIndex, reverseArray[nextIndex]);
		return reverseArray[nextIndex++];
	}
}