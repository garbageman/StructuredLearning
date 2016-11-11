package org.structuredlearning.datastructures.lists;

import static org.junit.Assert.*;

import org.junit.Test;
import org.structuredlearning.datastructures.linear.List;
import org.structuredlearning.datastructures.linear.SinglyLinkedList;

public class SinglyLinkedListTest {
	
	@Test
	public void testGet() {
		List<Integer> testList = new SinglyLinkedList<Integer>();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		
		int i = testList.get(0);
		assertEquals(i,1);
		i = testList.get(1);
		assertEquals(i,2);
		i = testList.get(2);
		assertEquals(i,3);
	}
	
	@Test
	public void testContains() {
		List<Integer> testList = new SinglyLinkedList<Integer>();
		
		// Test adding a single element
		testList.add(1);
		assertTrue(testList.contains(1));
		assertFalse(testList.contains(2));
	}
	
	@Test
	public void testRemove() {
		List<Integer> testList = new SinglyLinkedList<Integer>();
		
		// Test adding and removing a single element
		testList.add(1);
		assertTrue(testList.contains(1));
		testList.remove(new Integer(1));
		assertFalse(testList.contains(1));
	}

}
