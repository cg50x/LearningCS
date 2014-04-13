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
		
		// If root is to be deleted,
		if (root.value.compareTo(value) == 0) {
			root = removeHelper(root);
		}
		
		// Remove the node
		removeHelp
		
		return false;
	}
	
	private BinaryTreeNode<E> getNodeWithValue(BinaryTreeNode<E> currNode, E value) {
		if (currNode == null) {
			return null;
		} else if (value.compareTo(currNode.value) > 0) {
			return getNodeWithValue(currNode.right, value);
		} else if (value.compareTo(currNode.value) < 0) {
			return getNodeWithValue(currNode.left, value);
		} else {
			return currNode;
		}
	}
	
	/**
	 * Removes given node from the tree
	 * @param node
	 * @return A pointer to the subtree with the element deleted
	 */
	private BinaryTreeNode<E> removeHelper(BinaryTreeNode<E> currNode, E value) {
		
		if (currNode == null) {
			return null;
		}
		
		if (currNode.value.compareTo(value) < 0) {
			currNode.left = removeHelper()
		}
		
		// TODO: what if either currNode.value is null??
		
		// If node doesn't have children, return null
		// so that the parent detaches this node
		if (currNode.left == null && currNode.right == null) {
			return null;
		} else if (currNode.left == null) {
			// If node only has a right child, return it
			return currNode.right;
		} else if (currNode.right == null) {
			// If node only has a left child, return it
			return currNode.left;
		} else {
			
			// Get the predecessor node
			// Assume current node's left child will be the 
			// predecessor node (in case left child has no right child)
			BinaryTreeNode<E> predNode = currNode.left;
			BinaryTreeNode<E> parentToPred = currNode;
			
			// Find left child's right most child
			while (predNode.right != null && predNode.right.right != null) {
				predNode = predNode.right;
			}
			
			// If pred node's right child is null, then pred node hasn't 
			// moved from current node's left child. Otherwise, pred node is pointing
			// to parent of actual pred node
			if (predNode.right != null) {
				parentToPred = predNode;
				predNode = predNode.right;
			}
			
			// Set current node's value to predecessor's value
			currNode.value = predNode.value;
			
			// delete predecessor node
			parentToPred.right = removeHelper(predNode);
		}
		
		return currNode;
	}
	
	private BinaryTreeNode<E> getParentToPredNode(BinaryTreeNode<E> node) {
		if (node == null || node.left == null) {
			return null;
		}
		
		BinaryTreeNode<E> result = node.left;
		
		// Get the right most child
		while (result.right != null) {
			result = result.right;
		}
		
		return result;
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
		return getPreorderHelper(root);
	}
	
	private String getPreorderHelper(BinaryTreeNode<E> node) {
		if (node == null) {
			return "";
		}
		
		return node.toString() 
			+  getPreorderHelper(node.left) 
			+  getPreorderHelper(node.right);
	}

	@Override
	public String getPostorder() {
		return getPostorderHelper(root);
	}
	
	private String getPostorderHelper(BinaryTreeNode<E> node) {
		if (node == null) {
			return "";
		}
		
		return getPostorderHelper(node.left) 
			+  getPostorderHelper(node.right)
			+  node.toString();
	}

	@Override
	public String getInorder() {
		return getInorderHelper(root);
	}

	private String getInorderHelper(BinaryTreeNode<E> node) {
		if (node == null) {
			return "";
		}
		
		return getInorderHelper(node.left)
			+  node.toString()
			+  getInorderHelper(node.right);
	}
}
