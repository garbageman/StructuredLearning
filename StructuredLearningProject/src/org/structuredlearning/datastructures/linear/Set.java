package org.structuredlearning.datastructures.linear;

import java.util.Iterator;

/**
 * This is the interface for a set.
 * @author dnagle
 *
 * @param <E>
 */
public interface Set<E> {
	
	/**
	 * Returns true if the element is contained in the set
	 * @param element
	 * @return
	 */
	public boolean contains(E element);
	
	/**
	 * Adds the element to the set if the element is not already in the set
	 * @param element
	 */
	public void put(E element);
	
	/**
	 * Returns the size of the set
	 * @return
	 */
	public int size();
	
	/**
	 * Returns an iterator over all the elements in the set in an arbitrary order
	 * @return
	 */
	public Iterator<E> iterator();
}
