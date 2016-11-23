package org.structuredlearning.datastructures.linear;

import java.util.Iterator;

/**
 * This is a simplified interface of a List for the purposes of this project
 * @author damiennagle
 *
 */
public interface List<E> {
	
	/**
	 * Adds the element to the front of the list. Returns true if it is successful, false otherwise.
	 * @param element
	 * @return boolean
	 */
	public boolean add(E element);
	
	/**
	 * Removes the element from the list. Returns true if successful, false otherwise.
	 * @param element
	 * @return
	 */
	public boolean remove(E element);
	
	/**
	 * Returns the size of the list
	 * @return int
	 */
	public int size();
	
	/**
	 * Returns true if the list is empty
	 * @return boolean
	 */
	public boolean isEmpty();
	
	/**
	 * Returns true if the element is contained in the list
	 * @param element
	 * @return boolean
	 */
	public boolean contains(E element);
	
	/**
	 * Returns the element stored at that particular location in the list
	 * @param index
	 * @return Element at the specified position
	 */
	public E get(int index);
	
	/**
	 * 
	 * @param index
	 * @return
	 */
	public E remove(int index);
	
	/**
	 * Returns an iterator for the list
	 * @return
	 */
	public Iterator<E> iterator();
	
	/**
	 * Returns the first element in the list
	 * @return
	 */
	public E getFirst();
	
	/**
	 * Returns the last element in the list
	 * @return
	 */
	public E getLast();
	
	/**
	 * Removes and returns the first element of the list
	 * @return
	 */
	public E removeFirst();
	
	/**
	 * Removes and returns the last element of the list
	 * @return
	 */
	public E removeLast();
}
