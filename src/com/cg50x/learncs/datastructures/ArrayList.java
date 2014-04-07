package com.cg50x.learncs.datastructures;

import java.lang.reflect.Array;
import java.util.Iterator;

/**
 * ArrayList
 * 
 * Array implementation of the List ADT.
 * 
 * @author Chris Guevara
 *
 * @param <E>
 */
public class ArrayList<E> implements List<E>{
	
	private final int INITIAL_SIZE = 10;
	private Object[] arrayStorage;
	private int size;	
	
	public ArrayList() {
		arrayStorage = new Object[INITIAL_SIZE];
		size = 0;
	}
	
	@Override
	public boolean add(E e) {
		
		// If the array is full, expand the storage
		if (size == arrayStorage.length) {
			expandStorage();
		}
		
		// Add the element and increment the size
		arrayStorage[size] = e;
		size++;

		return true;
	}
	
	private void expandStorage() {
		Object[] newStorage = new Object[arrayStorage.length * 2];
		
		for (int index = 0; index < size; index++) {
			newStorage[index] = arrayStorage[index];
		}
		
		arrayStorage = newStorage;		
	}

	@Override
	public void add(int index, E element) {
		
		// If adding to one over the last index, execute regular add
		if (index == size) {
			add(element);
		}
		
		// If the array is full, expand the storage
		if (size == arrayStorage.length) {
			expandStorage();
		}
		
		// Shift numbers up starting from index
		Object temp = element;
		Object temp2;
		for (int ind = index; ind < size+1; ind++) {
			temp2 = arrayStorage[ind];
			arrayStorage[ind] = temp;
			temp = temp2;			
		}
		
		size++;
	}

	@Override
	public void clear() {
		// Free up resources
		for (int index = 0; index < size; index++) {
			arrayStorage[index] = null;
		}
		
		size = 0;
	}

	@Override
	public boolean contains(Object o) {
		
		// Iterate over all elements O(n)
		for (int index = 0; index < size; index++) {
			if (arrayStorage[index].equals(o)) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	@SuppressWarnings("unchecked")
	public E get(int index) {
		
		if (index > size-1) {
			return null;
		}
		
		return (E)arrayStorage[index];
	}

	@Override
	public int indexOf(Object o) {
		// Iterate over all elements O(n)
		for (int index = 0; index < size; index++) {
			if (arrayStorage[index].equals(o)) {
				return index;
			}
		}
		return -1;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// Iterate from the end O(n)
		for (int index = size; index >= 0; index--) {
			if (arrayStorage[index].equals(o)) {
				return index;
			}
		}
		return -1;
	}

	@Override
	public E remove(int index) {
		
		// Check if valid index value
		if (index < 0 || index > size - 1) {
			return null;
		}
		
		// Shift values down starting at index
		Object toRemove = null;
		for (int ind = index; ind < size - 1; ind++) {
			arrayStorage[ind] = arrayStorage[ind+1];
		}
		
		size -= 1;
		return (E)toRemove;
	}

	@Override
	public boolean remove(Object o) {
		// Find the index of the object
		int targetIndex = indexOf(o);
		
		// If object not found, return false
		if (targetIndex == -1) {
			return false;
		}
		
		// Remove the object at the index
		return remove(targetIndex) != null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E set(int index, E element) {
		
		// Return null if not a valid index
		if (index < 0 || index >= size) {
			return null;
		}
		
		Object previousElement = arrayStorage[index];
		arrayStorage[index] = element;
		
		return (E)previousElement;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		
		// Check if valid indices
		if (fromIndex < 0 || toIndex > size || fromIndex > toIndex) {
			return null;
		}
		
		ArrayList<E> result = new ArrayList<E>();
		
		for (int index=fromIndex; index < toIndex; index++) {
			result.add(get(index));
		}
		
		return result;
	}

	@Override
	public Object[] toArray() {
		Object[] result = new Object[size];
		for (int index = 0; index < size; index++) {
			result[index] = arrayStorage[index];
		}
		return result;
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> T[] toArray(T[] a) {
		T[] result = (T[])Array.newInstance(a.getClass(), size);
		
		for (int index = 0; index < size; index++) {
			result[index] = (T)arrayStorage[index];
		}
		return null;
	}

}
