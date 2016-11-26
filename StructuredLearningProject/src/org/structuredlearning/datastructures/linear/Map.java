package org.structuredlearning.datastructures.linear;

import java.util.Collection;

/**
 * This is the interface for a map
 * @author dnagle
 *
 * @param <K>
 * @param <V>
 */
public interface Map<K,V> {
	
	/**
	 * Returns the number of key-value mappings in this map.
	 * @return number of key=value mappings
	 */
	public int size();

	/**
	 * Returns true if this map contains no key-value mappings.
	 * @return true if this map contains no key-value mappings
	 */
	public boolean isEmpty();

	/**
	 * Returns true if this map contains a mapping for the specified key.
	 * @param key
	 * @return true if this map contains a mapping for the specified key
	 */
	public boolean containsKey(Object key);

	/**
	 * Returns true if this map contains a mapping for the specified value.
	 * @param key
	 * @return true if this map contains a mapping for the specified value
	 */
	public boolean containsValue(Object value);

	/**
	 * Returns the value associated with the key
	 * @param key
	 * @return  The value associated with the key
	 */
	public V get(Object key);

	/**
	 * Adds the key-value mapping to the map. Overwrites the value if there already is a key-value mapping.
	 * @param key
	 * @param value
	 * @return previous value associated with the key, or null if there was no previous value
	 */
	public V put(K key, V value);

	/**
	 * Removes the key-value mapping and returns the value associated with the key-value mapping
	 * @param key
	 * @return value associated with the key
	 */
	public V remove(Object key);
	
	/**
	 * Removes all the key-value mappings in the map
	 */
	public void clear();
	
	/**
	 * Returns the set of all the keys in the map
	 * @return set of all the keys in the map
	 */
	public Set<K> keySet();

	/**
	 * Returns a collection of all the values in the map
	 * @return
	 */
	public Collection<V> values();

}
