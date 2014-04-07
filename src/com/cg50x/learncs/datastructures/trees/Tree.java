package com.cg50x.learncs.datastructures.trees;

/**
 * Tree ADT Interface
 * 
 * @author Chris Guevara
 *
 * @param <E>
 */
public interface Tree<E extends Comparable<E>> {
	
	/**
	 * Inserts a value into the tree
	 * @param value
	 * @return
	 */
	public boolean insert(E value);
	
	/**
	 * Removes the given value from the tree
	 * @param value
	 * @return
	 */
	public boolean remove(E value);

	/**
	 * Returns the number of values in the tree.
	 * @return
	 */
	public int size();
	
	/**
	 * Returns the height of the tree.
	 * @return
	 */
	public int height();
	
	/**
	 * Returns whether or not the tree contains the given value.
	 * @param value
	 * @return
	 */
	public boolean contains(E value);
	
	/**
	 * Returns a deep copy of this tree (a new tree that contains the same 
	 * values and structure)
	 * 
	 * @return
	 */
	public Tree<E> deepCopy();
	
	/**
	 * Returns a string of all elements in preorder. Elements will be printed
	 * using toString.
	 * 
	 * @return String
	 */
	public String getPreorder();
	
	/**
	 * Returns a string of all elements in postorder. Elements will be printed
	 * using toString.
	 * 
	 * @return String
	 */
	public String getPostorder();
	
	/**
	 * Returns a string of all elements in inorder. Elements will be printed
	 * using toString.
	 * 
	 * @return String
	 */
	public String getInorder();
}
