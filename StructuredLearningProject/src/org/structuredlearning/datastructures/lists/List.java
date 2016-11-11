package org.structuredlearning.datastructures.lists;

import java.util.Iterator;

/**
* This is the interface for a list.
* @author Damien Nagle
*/
public interface List<E> {
		/**
	    * Adds an element to the end of the list.
	    */
	    public boolean add(E e);

	    /**
	    * Returns true if the object is contained in the list.
	    */
	    public boolean contains(Object o);

	    /**
	    * Returns the element at that position in the list
	    * throws an IndexOutofBoundsException if (index < 0 || index >= size())
	    */
	    public E get(int index);

	    /**
	    * Removes the element at the specified index from the list
	    * returns true if it is removed successfully, false otherwise.
	    * throws IndexOutofBoundsException if (index < 0 || index >= size())
	    */
	    public boolean remove(int index);

	    /**
	    * Returns an iterator for this list
	    */
	    public Iterator<E> iterator();

	    /**
	    * Returns the size of the list
	    */
	    public int size();
}
