package org.structuredlearning.datastructures.linear;

/**
 * This is the interface for a standard map
 * @author damiennagle
 *
 * @param <K>
 * @param <E>
 */
public interface Map<K,V> {
	
	/**
	 * Returns the value stored at that key value
	 * @param key
	 * @return
	 */
	public V get(K key);
	
	/**
	 * Adds the key value mapping to the map, returns the previous value if the value is updated
	 * @param key
	 * @param value
	 * @return
	 */
	public V put(K key, V value);
	
	/**
	 * Returns the size of the map, the number of key, value mappings in the hash
	 * @return
	 */
	public int size();
	
	/**
	 * Removes the key, value mapping from the map and returns the value that was previously stored
	 * @param k
	 * @return
	 */
	public V remove(Object k);
	
	/**
	 * Returns true if the key is contained within the map
	 * @param k
	 * @return
	 */
	public boolean containsKey(Object k);
	
	/**
	 * Returns true if the value is contained in the map
	 * @param v
	 * @return
	 */
	public boolean containsValue(Object v);
}
