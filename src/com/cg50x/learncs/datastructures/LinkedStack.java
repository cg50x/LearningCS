package com.cg50x.learncs.datastructures;

/**
 * 
 * @author Chris Guevara
 *
 * @param <E>
 */
public class LinkedStack<E> implements Stack<E> {
	
	private SinglyNode<E> head;
	
	public LinkedStack() {
		head = null;
	}
	
	@Override
	public boolean empty() {
		return head == null;
	}

	@Override
	public E peek() {
		if (head == null) {
			return null;
		}
		return head.value;
	}

	@Override
	@SuppressWarnings("unchecked")
	public E pop() {
		if (head == null) {
			return null;
		}
		Object prevValue = head.value;
		head = head.next;
		return (E)prevValue;
	}

	@Override
	public E push(E item) {
		head = new SinglyNode<E>(item, head);
		return item;
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
