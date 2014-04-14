package com.cg50x.learncs.datastructures.trees;

/**
 * 
 * N-ary Tree
 * 
 * TODO: Not sure how to implement this. A node for this is easy
 *       to implement, but a vanilla N-ary Tree? I need 
 *       to know how insert, remove would work. Those operations
 *       depend on how the tree is going to be organized. Since 
 *       this isn't a "search" tree, what rules should I follow?
 *       
 * @author Chris Guevara
 *
 * @param <E>
 */
public class NaryTree<E extends Comparable<E>> implements Tree<E> {

	private NaryTreeNode<E> root;
	private int maxChildren;
	
	public NaryTree(int maxChildren) {
		this.maxChildren = maxChildren;
	}
	
	@Override
	public boolean insert(E value) {
		// if root is null
		// set root
		
		// else insert value into tree
		// recursively
		return false;
	}
	
	private NaryTreeNode<E> insertHelper(NaryTreeNode<E> currentNode, 
										 E value) {
		/*
		 * currnode == null?
		 *  return new node with value
		 * currnode hasn't reached child limit?
		 *  make new child with value
		 * find first child node with capacity
		 *  insertHelper that child node
		 * if all childnodes are full
		 *  insertHelper the first childnode
		 * return currnode 
		 * 
		 */
		return null;
	}

	@Override
	public boolean remove(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int height() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Tree<E> deepCopy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPreorder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPostorder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getInorder() {
		// TODO Auto-generated method stub
		return null;
	}

}
