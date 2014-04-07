package com.cg50x.learncs.datastructures;

/**
 * 
 * @author Chris Guevara
 *
 * @param <E>
 */
public class ArrayQueue<E> implements Queue<E> {
	
	private static final int INITIAL_SIZE = 10;
	private Object[] arrayStorage;
	private int tailIndex;
	
	public ArrayQueue() {
		arrayStorage = new Object[INITIAL_SIZE];
		tailIndex = 0;
	}

	@Override
	public boolean offer(E e) {
		if (tailIndex == arrayStorage.length) {
			expandStorage();
		}
		arrayStorage[tailIndex] = e;
		tailIndex++;
		return true;
	}

	@Override
	@SuppressWarnings("unchecked")
	public E peek() {
		return (E)arrayStorage[0];
	}

	@Override
	@SuppressWarnings("unchecked")
	public E poll() {
		E toReturn = (E)arrayStorage[0];
		// Shift elements down
		for (int index = 0; index < tailIndex-1; index++) {
			arrayStorage[index] = arrayStorage[index+1];
		}
		
		// Shift tailIndex down and clear any elements stored
		// in tailIndex's new index
		tailIndex--;
		arrayStorage[tailIndex] = null;
		
		return toReturn;
	}
	
	private void expandStorage() {
		Object[] newStorage = new Object[2 * arrayStorage.length];
		for (int index = 0; index < arrayStorage.length; index++) {
			newStorage[index] = arrayStorage[index];
		}
		arrayStorage = newStorage;
	}
}
