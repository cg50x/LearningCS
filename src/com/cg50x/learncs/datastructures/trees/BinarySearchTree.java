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
		boolean nodeAdded = false;
		
		while (!nodeAdded) {
			// If new value is less than root
			//  if left is null, add the new element
			//  else, currnode = left
			if (value.compareTo(currNode.value) < 0){
				if (currNode.left == null) {
					currNode.left = new BinaryTreeNode<E>(value);
					nodeAdded = true;
				} else {
					currNode = currNode.left;
				}
			// if new value is greater than root
			//  if right is null, add the new element
			//  else, currnode = right
			} else if (value.compareTo(currNode.value) > 0) {
				if (currNode.right == null) {
					currNode.right = new BinaryTreeNode<E>(value);
					nodeAdded = true;
				} else {
					currNode = currNode.right;
				}
			} else {
				// Don't add duplicates to tree.
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean remove(E value) {
		// Find the value!
		
		// Iterate through the tree until curr pointer
		// points to parent of node to be removed.
		
		// if nodeToRemove has no children
		// remove it
		
		// if nodeToRemove doesn't have a left
		// replace nodeToRemove with it's right subtree's root
		
		// if nodeToRemove doesn't have a right
		// replace nodeToRemove with its left subtree root
		
		/*
		 * if nodeToRemove has both
		 * let there be a b pointers
		 * a points to nodeToRemove.left
		 * b points to nodeToRemove.left
		 * while b.right isn't null
		 *   a = b
		 *   b = b.right
		 * b will hit a node that has no right child
		 * a will be the parent of b unless b had no 
		 * 
		 */
		// if nodeToRemove has both
		// ltb a b pointers
		// a points to nodeToRemove.left
		//
		return false;
	}

	@Override
	public int size() {
		return sizeHelper(root);
	}
	
	private int sizeHelper(BinaryTreeNode<E> node) {
		if (node == null) {
			return 0;
		}		
		return 1 + sizeHelper(node.left)+ sizeHelper(node.right);
	}

	@Override
	public int height() {
		return heightHelper(root);
	}
	
	private int heightHelper(BinaryTreeNode<E> node) {
		if (node == null) {
			return 0;
		}
		return 1 + Math.max(heightHelper(node.left), heightHelper(node.right));
	}

	@Override
	public boolean contains(E value) {
		return contains(root, value);
	}
	
	private boolean contains(BinaryTreeNode<E> node, E value) {
		if (node == null) {
			return false;
		} else if (value.compareTo(node.value) == 0) {
			return true;
		}
		return contains(node.left, value) || contains(node.right, value);
	}
	
	@Override
	public Tree<E> deepCopy() {
		// obtain breadth first search order
		// insert nodes into new tree in bfs order
		
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
