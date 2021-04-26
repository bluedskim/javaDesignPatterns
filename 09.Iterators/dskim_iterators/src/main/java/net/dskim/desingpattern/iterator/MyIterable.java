package net.dskim.desingpattern.iterator;

import java.util.Iterator;

public interface MyIterable extends Iterable<Object> {
    public Iterator<Object> reverseIterator();
}
