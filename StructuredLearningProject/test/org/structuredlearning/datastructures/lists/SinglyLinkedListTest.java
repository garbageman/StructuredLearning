package org.structuredlearning.datastructures.lists;

import static org.junit.Assert.*;

import org.junit.Test;

import org.structuredlearning.datastructures.lists.SinglyLinkedList;
import org.structuredlearning.datastructures.lists.List;

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

}
