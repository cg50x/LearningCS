package com.cg50x.learncs.datastructures;

/**
 * 
 * @author Chris Guevara
 *
 * @param <E>
 */
public class ArrayStack<E> implements Stack<E> {
	
	private static final int INITIAL_SIZE = 10;
	private Object[] arrayStorage;
	private int topIndex;
	
	public ArrayStack() {
		// Set topIndex to 0 to denote stack is empty
		arrayStorage = new Object[INITIAL_SIZE];
		topIndex = 0;
	}

	@Override
	public boolean empty() {
		return topIndex == 0;
	}

	@Override
	@SuppressWarnings("unchecked")
	public E peek() {
		return (E)arrayStorage[topIndex];
	}

	@Override
	@SuppressWarnings("unchecked")
	public E pop() {
		Object prevElem = arrayStorage[topIndex];
		arrayStorage[topIndex] = null;
		topIndex = Math.max(0, topIndex--);
		return (E)prevElem;
	}

	@Override
	public E push(E item) {
		if (topIndex == arrayStorage.length - 1){
			expandStorage();
		}
		topIndex++;
		arrayStorage[topIndex] = item;
		return item;
	}
	
	private void expandStorage() {
		Object[] newStorage = new Object[2 * arrayStorage.length];
		
		for(int index = 0; index < topIndex; index++) {
			newStorage[index] = arrayStorage[index];
		}
		arrayStorage = newStorage;
	}
}
