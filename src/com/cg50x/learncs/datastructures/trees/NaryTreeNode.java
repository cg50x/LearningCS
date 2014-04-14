package com.cg50x.learncs.datastructures.trees;

public class NaryTreeNode<E> {
	
	public E value;
	public NaryTreeNode<E>[] children;
	
	public NaryTreeNode(int maxChildren) {
		children = new NaryTreeNode[maxChildren];
	}
	
	public NaryTreeNode(int maxChildren, E val) {
		this(maxChildren);
		this.value = val;
	}
}
