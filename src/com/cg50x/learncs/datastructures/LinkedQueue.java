package com.cg50x.learncs.datastructures;

/**
 * 
 * @author Chris Guevara
 *
 * @param <E>
 */
public class LinkedQueue<E> implements Queue<E> {
	
	private SinglyNode<E> head;
	private SinglyNode<E> tail;
	
	public LinkedQueue() {
		head = null;
		tail = null;
	}

	@Override
	public boolean offer(E e) {
		if (head == null) {
			head = new SinglyNode<E>(e);
			tail = head;
		} else {
			tail.next = new SinglyNode<E>(e);
			tail = tail.next;
		}
		return true;
	}

	@Override
	public E peek() {
		if (head == null) {
			return null;
		}
		
		return head.value;
	}

	@Override
	public E poll() {
		if (head == null) {
			return null;
		}
		
		E toReturn = head.value;
		head = head.next;
		
		if (head == null) {
			tail = null;
		}
		
		return toReturn;
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
