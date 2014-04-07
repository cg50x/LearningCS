package com.cg50x.learncs.datastructures;

import java.util.Iterator;

/**
 * 
 * @author Chris Guevara
 *
 */
public class LinkedList<E> implements List<E> {
	
	private SinglyNode<E> head;
	private SinglyNode<E> tail;
	private int size;
	public LinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	@Override
	public boolean add(E e) {
		if (head == null) {
			head = new SinglyNode<E>(e);
			tail = head;
		} else {
			tail.next = new SinglyNode<E>(e);
			tail = tail.next;
		}
		
		size++;
		return false;
	}

	@Override
	public void add(int index, E element) {
		// Do nothing if the index is invalid
		if (index < 0 || index > size) {
			return;
		}
		if (index == size) {
			add(element);
			return;
		}
		if (index == 0) {
			head = new SinglyNode<E>(element, head);
		} else {
			// Travel to the node behind the target index
			SinglyNode<E> curr = head;
			for (int ind = 0; ind < index-1; ind++) {
				curr = curr.next;
			}
			
			// Insert a new node at the target index
			curr.next = new SinglyNode<E>(element, curr.next);
		}
		size++;
	}

	@Override
	public void clear() {
		head = null;
		tail = null;
		size = 0;		
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int index) {
		if (index < 0 || index > size-1 || head == null) {
			return null;
		}
		
		SinglyNode<E> curr = head;
		for (int i = 0; i < index; i++) {
			curr = curr.next;
			if (curr == null) {
				return null;
			}
		}
		
		return curr.value;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		int index = 0;
		SinglyNode<E> curr = head;
		while (curr != tail) {
			if (curr.value.equals(o)) {
				break;
			} else {
				curr = curr.next;
				index++;
			}
		}
		if (curr == tail) {
			return -1;
		}
		return index;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return head == null;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// Search entire list
		// indexFound contains last index at which o was found
		// index is current index count
		int indexFound = -1;
		int index = 0;
		
		SinglyNode<E> curr = head;
		while (curr != tail) {
			if (curr.value.equals(o)) {
				indexFound = index;
			} 
			curr = curr.next;
			index++;
		}
		return indexFound;
	}

	@Override
	public E remove(int index) {
		if (!isValidIndex(index)) {
			return null;
		}
		
		if (index == 0 && head != null) {
			head = head.next;
		}
		
		// Go to the node right behind  the target
		SinglyNode<E> prevNode = getNodeAtIndex(index-1);
		E prevValue = prevNode.next.value;
		prevNode.next = prevNode.next.next;
		
		size--;
		return prevValue;
	}

	@Override
	public boolean remove(Object o) {
		return remove(indexOf(o)) != null;
	}

	@Override
	public E set(int index, E element) {
		SinglyNode<E> targetNode = getNodeAtIndex(index);
		E prevValue = targetNode.value;
		targetNode.value = element;
		
		return prevValue;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private SinglyNode<E> getNodeAtIndex(int index) {
		if (index < 0 || index > size-1 || head == null) {
			return null;
		}
		if (index == 0) {
			return head;
		}
		
		int currIndex = 0;
		SinglyNode<E> currNode = head;
		while (currNode != null && currIndex < index) {
			currNode = currNode.next;
			currIndex++;
		}
		
		return currNode;
	}
	
	private boolean isValidIndex(int index) {
		return index >= 0 || index <= size-1;
	}
	
	/**
	 * 
	 * @author Chris Guevara
	 *
	 */
	private class SinglyNode<E> {
		public E value;
		public SinglyNode<E> next;
		
		public SinglyNode(E value) {
			this.value = value;
			this.next = null;
		}
		
		public SinglyNode(E value, SinglyNode<E> next) {
			this.value = value;
			this.next = next;
		}
	}

}
