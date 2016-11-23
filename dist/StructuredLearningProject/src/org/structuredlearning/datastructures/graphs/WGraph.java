package org.structuredlearning.datastructures.graphs;

import java.util.Set;

/**
 * This class represents a weighted graph.
 * @author damiennagle
 *
 * @param <E>
 */
public class WGraph<E> {
	
	public WGraph() {
		
	}
	
	/**
	 * Adds an element to the graph
	 * @param element
	 * @return
	 */
	public boolean addVertex(E element) {
		return false;
	}
	
	public boolean addEdge(E firstElement, E secondElement, int edgeWeight) {
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
