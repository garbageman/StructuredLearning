package org.structuredlearning.datastructures.graphs;

import java.util.Set;

/**
 * This class is a representation of an unweighted graph that contains some element E
 * @author damiennagle
 *
 * @param <E>
 */
public class UWGraph<E> {
	
	public UWGraph() {
		
	}
	
	/**
	 * Adds an element to the graph
	 * @param element
	 * @return
	 */
	public boolean addVertex(E element) {
		return false;
	}
	
	/**
	 * Adds an edge between two elements in the graph
	 * @param firstElement
	 * @param secondElement
	 * @return
	 */
	public boolean addEdge(E firstElement, E secondElement) {
		return false;
	}
	
	/**
	 * Returns the neighboring elements to the element
	 * @param element
	 * @return
	 */
	public Set<E> getNeighbors(E element) {
		return null;
	}
	
	/**
	 * returns the set of elements that are contained in the graph
	 * @return
	 */
	public Set<E> vertices() {
		return null;
	}
	
	/**
	 * Returns if the element is in the graph
	 * @param element
	 * @return
	 */
	public boolean contains(E element) {
		return false;
	}
	
	/**
	 * Returns number of vertices in the graph
	 * @return 
	 */
	public int size() {
		return 0;
	}
	
	/**
	 * Given an element e, return the set of elements that are accessible through traversing the graph from e
	 * @param e
	 * @return
	 */
	public Set<E> reachable(E e) {
		return null;
	}
	
	/**
	 * 
	 */

}
