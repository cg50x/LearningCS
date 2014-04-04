package com.cg50x.learncs.datastructures;

import java.util.Iterator;

/**
 * List interface
 * <p>
 * This is the List interface for the learncs datastructures
 * package. This interface contains a subset of the methods from 
 * the Java List interface.
 * 
 * @author Chris Guevara
 */

public interface List<E> {
	
	/**
	 * Appends the specified element to the end of this list (optional 
	 * operation).
	 * @param e
	 * @return Whether the operation succeeded
	 */
	boolean	add(E e);
	
	/**
	 * Inserts the specified element at the specified position in this list 
	 * (optional operation).
	 * @param index
	 * @param element
	 */
	void add(int index, E element);
	
	/**
	 * Removes all of the elements from this list (optional operation).
	 */
	void clear();	
	
	/**
	 * Returns true if this list contains the specified element.
	 * @param o
	 * @return
	 */
	boolean	contains(Object o);
	
	/**
	 * Compares the specified object with this list for equality.
	 * @param o
	 * @return
	 */
	boolean	equals(Object o);
	
	/**
	 * Returns the element at the specified position in this list.
	 * @param index
	 * @return The element contained at position index.
	 */
	E get(int index);
	
	/**
	 * Returns the hash code value for this list.
	 * @return the hashcode
	 */
	int	hashCode();	
	
	/**
	 * Returns the index of the first occurrence of the specified element in 
	 * this list, or -1 if this list does not contain the element.
	 * @param o
	 * @return
	 */
	int	indexOf(Object o);
	
	/**
	 * Returns true if this list contains no elements.
	 * @return
	 */
	boolean	isEmpty();	
	
	/**
	 * Returns an iterator over the elements in this list in proper sequence.
	 * @return
	 */
	Iterator<E>	iterator();
	
	/**
	 * Returns the index of the last occurrence of the specified element in 
	 * this list, or -1 if this list does not contain the element.
	 * @param o
	 * @return
	 */
	int	lastIndexOf(Object o);
	
	/**
	 * Removes the element at the specified position in this list (optional 
	 * operation).
	 * @param index
	 * @return The element that was just removed
	 */
	E remove(int index);
	
	/**
	 * Removes the first occurrence of the specified element from this list, 
	 * if it is present (optional operation).
	 * @param o
	 * @return
	 */
	boolean	remove(Object o);
	
	/**
	 * Replaces the element at the specified position in this list with the 
	 * specified element (optional operation).
	 * @param index
	 * @param element
	 * @return
	 */
	E set(int index, E element);
	
	/**
	 * Returns the number of elements in this list.
	 * @return
	 */
	int	size();
	
	/**
	 * Returns a view of the portion of this list between the specified 
	 * fromIndex, inclusive, and toIndex, exclusive.
	 * @param fromIndex
	 * @param toIndex
	 * @return
	 */
	List<E>	subList(int fromIndex, int toIndex);
	
	/**
	 * Returns an array containing all of the elements in this list in proper 
	 * sequence (from first to last element).
	 * @return
	 */
	Object[] toArray();
	
	/**
	 * Returns an array containing all of the elements in this list in proper 
	 * sequence (from first to last element); the runtime type of the returned 
	 * array is that of the specified array.
	 * @param a
	 * @return
	 */
	<T> T[] toArray(T[] a);
	
}
