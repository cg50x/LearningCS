package com.cg50x.learncs.datastructures.trees;

/**
 * 
 * @author Chris Guevara
 *
 * @param <E>
 */
class BinaryTreeNode<E> {
	
	public E value;
	public BinaryTreeNode<E> left, right;
	
	/**
	 * BinaryTreeNode constructor
	 * @param val
	 */
	public BinaryTreeNode(E val) {
		this(val, null, null);
	}
	
	/**
	 * BinaryTreeNode constructor 
	 * @param value
	 * @param left
	 * @param right
	 */
	public BinaryTreeNode(E value,
					  BinaryTreeNode<E> left,
					  BinaryTreeNode<E> right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
}
