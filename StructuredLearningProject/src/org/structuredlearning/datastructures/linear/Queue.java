package org.structuredlearning.datastructures.linear;

import java.util.Iterator;

public interface Queue<E> {
	/**
	 * Returns the number of elements in the queue
	 * @return
	 */
	public int size();
	
	/**
	 * Returns true if the queue has no elements, false otherwise.
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * Returns true if the object o is contained in the queue, false otherwise.
	 * @param o
	 * @return
	 */
	public boolean contains(Object o);
	
	/**
	 * Returns an iterator for the queue.
	 * @return
	 */
	public Iterator<E> iterator();
	
	/**
	 * Removes all elements from the queue
	 */
	public void clear();
	
	/**
	 * Enqueues the element into the queue, returns true if it is successful, false otherwise.
	 * @param element
	 * @return
	 */
	public boolean enqueue(E element);
	
	/**
	 * Dequeues the next element from the queue, throws an NoSuchElementException if the queue is empty
	 * @param element
	 * @return
	 */
	public E dequeue();
	
	/**
	 * Returns, but does not remove, the head of the queue.
	 * @return
	 */
	public E peek();
}
