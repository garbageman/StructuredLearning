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
	
	public boolean addVertex(E element) {
		return false;
	}
	
	public boolean addEdge(E firstElement, E secondElement) {
		return false;
	}
	
	public Set<E> getNeighbors(E element) {
		return null;
	}
	
	public Set<E> vertices() {
		return null;
	}
	
	public boolean contains(E element) {
		return false;
	}
	
	public int size() {
		return 0;
	}

}
