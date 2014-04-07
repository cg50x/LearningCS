package com.cg50x.learncs.datastructures;

/**
 * 
 * @author Chris Guevara
 *
 * @param <E>
 */
public interface Queue<E> {
	
	/**
	 * Inserts the specified element into this queue if it is possible to do so
	 * immediately without violating capacity restrictions.
	 * @param e
	 * @return True if the element was added to the queue, else false
	 */
	public boolean offer(E e);
	
	/**
	 * Retrieves, but does not remove, the head of this queue, or returns null
	 * if this queue is empty.
	 * @return the head of this queue, or null if this queue is empty
	 */
	public E peek();
	
	/**
	 * Retrieves and removes the head of this queue, or returns null if this
	 * queue is empty.
	 * @return the head of this queue, or null if this queue is empty
	 */
	public E poll();

}
