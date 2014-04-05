/**
 * 
 */
package com.cg50x.learncs.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author cguevara
 *
 */
public class ArrayListTest {

	/**
	 * Test method for {@link com.cg50x.learncs.datastructures.ArrayList#add(java.lang.Object)}.
	 */
	@Test
	public void testAddE() {
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		
		// Check size before adding
		assertEquals("New ArrayList size should be 0", aList.size(), 0);
		
		aList.add(new Integer(5));
		
		// Check size after adding
		assertEquals("Size should be 1 after adding", aList.size(), 1);
	}

	/**
	 * Test method for {@link com.cg50x.learncs.datastructures.ArrayList#add(int, java.lang.Object)}.
	 */
	@Test
	public void testAddIntE() {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		
		// Check size before adding
		assertEquals("New ArrayList size should be 0", aList.size(), 0);
		
		// Add three numbers
		aList.add(1);
		aList.add(3);
		
		// Check size after adding
		assertEquals("Adding 1 and 3", aList.size(), 2);
		
		// Add 2 in between
		aList.add(1, 2);
		
		// Check size after adding
		assertEquals("Added 2 in between", aList.size(), 3);
	}

	/**
	 * Test method for {@link com.cg50x.learncs.datastructures.ArrayList#clear()}.
	 */
	@Test
	public void testClear() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.cg50x.learncs.datastructures.ArrayList#contains(java.lang.Object)}.
	 */
	@Test
	public void testContains() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.cg50x.learncs.datastructures.ArrayList#get(int)}.
	 */
	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.cg50x.learncs.datastructures.ArrayList#indexOf(java.lang.Object)}.
	 */
	@Test
	public void testIndexOf() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.cg50x.learncs.datastructures.ArrayList#isEmpty()}.
	 */
	@Test
	public void testIsEmpty() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.cg50x.learncs.datastructures.ArrayList#iterator()}.
	 */
	@Test
	public void testIterator() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.cg50x.learncs.datastructures.ArrayList#lastIndexOf(java.lang.Object)}.
	 */
	@Test
	public void testLastIndexOf() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.cg50x.learncs.datastructures.ArrayList#remove(int)}.
	 */
	@Test
	public void testRemoveInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.cg50x.learncs.datastructures.ArrayList#remove(java.lang.Object)}.
	 */
	@Test
	public void testRemoveObject() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.cg50x.learncs.datastructures.ArrayList#set(int, java.lang.Object)}.
	 */
	@Test
	public void testSet() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.cg50x.learncs.datastructures.ArrayList#size()}.
	 */
	@Test
	public void testSize() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.cg50x.learncs.datastructures.ArrayList#subList(int, int)}.
	 */
	@Test
	public void testSubList() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.cg50x.learncs.datastructures.ArrayList#toArray()}.
	 */
	@Test
	public void testToArray() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.cg50x.learncs.datastructures.ArrayList#toArray(T[])}.
	 */
	@Test
	public void testToArrayTArray() {
		fail("Not yet implemented");
	}

}
