package com.cg50x.learncs.datastructures;

/**
 * 
 * @author Chris Guevara
 *
 * @param <E>
 */
public interface Stack<E> {
	
	/**
	 * Tests if this stack is empty.
	 * @return
	 */
	public boolean empty();
	
	/**
	 * Looks at the object at the top of this stack without removing it from
	 * the stack.
	 * @return The object at the top of this stack.
	 */
	public E peek();
	
	/**
	 * Removes the object at the top of the stack and returns that object
	 * as the value of this function.
	 * @return The object popped from the stack
	 */
	public E pop();
	
	/**
	 * Pushes an item onto the top of this stack.
	 * @param item
	 * @return the item argument
	 */
	public E push(E item);

}
