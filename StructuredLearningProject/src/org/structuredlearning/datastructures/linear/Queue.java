package org.structuredlearning.datastructures.linear;

import java.util.Iterator;

public interface Queue<E> {

	public int size();

	public boolean isEmpty();

	public boolean contains(Object o);

	public Iterator<E> iterator();

	public boolean remove(Object o);

	public void clear();

	public boolean add(E e);
	
	public E remove();

	public E peek();
}
