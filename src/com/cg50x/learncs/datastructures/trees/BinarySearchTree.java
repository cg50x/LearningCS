package com.cg50x.learncs.datastructures.trees;

import com.cg50x.learncs.datastructures.trees.BinaryTreeNode;

public class BinarySearchTree<E extends Comparable<E>> implements Tree<E> {
	
	private BinaryTreeNode<E> root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public BinarySearchTree(E firstElem) {
		root = new BinaryTreeNode<E>(firstElem);
	} 

	@Override
	public boolean insert(E value) {
		if (root == null) {
			root = new BinaryTreeNode<E>(value);
			return true;
		}
		
		BinaryTreeNode<E> currNode = root;
		
		// Compare with current node's value
		if (value < currNode.value){
			
		}
		// If new value is less than root
		//  if left is null, add the new element
		//  else, currnode = left
		// if new value is greater than root
		//  if right is null, add the new element
		//  else, currnode = right
		
		return true;
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
