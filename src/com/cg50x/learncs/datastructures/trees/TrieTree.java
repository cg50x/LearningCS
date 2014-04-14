package com.cg50x.learncs.datastructures.trees;

public class TrieTree implements Tree<String> {
	
	private TrieNode root;
	private static final String END_TOKEN = "$",
							    START_TOKEN = "";
	
	public TrieTree() {
		root = new TrieNode("");
	}

	@Override
	public boolean insert(String value) {
		// Recursively add string to Trie
		// TODO Auto-generated method stub
		return insertHelper(root, value);
	}
	
	private boolean insertHelper(TrieNode currNode, String value) {
		
		if (currNode == null) {
			return false;
		}
		
		if (value.length() == 0) {
			if (currNode.value.equals("")) {
				currNode.isWord = true;
				return true;
			}
			return false;
		}

		TrieNode matchingChild = getNextChild(currNode, value);
		
		// If no matching child, create one
		if (matchingChild == null) {
			TrieNode newChild = new TrieNode(value.substring(0,1));
			currNode.children.add(newChild);
			matchingChild = newChild;
		}
		
		// If this is the last letter
		// mark the full word
		if (value.length() == 1) {
			matchingChild.isWord = true;
			return true;
		}
		
		return insertHelper(matchingChild, value.substring(1));
	}
	
	private TrieNode getNextChild(TrieNode currNode, String value) {
		if (currNode == null) {
			return null;
		}
		
		for(TrieNode child : currNode.children) {
			if (child.value.equals(String.valueOf(value.charAt(0)))) {
				return child;
			}
		}
		
		return null;
	}
	
	private String[] breakUpString(String value) {
		char[] chrArray = value.toCharArray();
		
		String[] strArray = new String[chrArray.length + 2];
		
		strArray[0] = START_TOKEN;
		strArray[strArray.length - 1] = END_TOKEN;
		
		for(int i = 0; i < chrArray.length; i++) {
			strArray[i+1] = String.valueOf(chrArray[i]);
		}
		
		return strArray;
	}

	@Override
	public boolean remove(String value) {
		return removeHelper(root, value);
	}
	
	private boolean removeHelper(TrieNode currNode, String value) {
		if (currNode == null || value == null) return false;
		
		// If we're not at the root and the curr node's value
		// doesn't match the first char of value
		if (!currNode.value.equals(START_TOKEN) 
		  && currNode.value.charAt(0) != value.charAt(0)) {
			return false;
		}
		
		// Find the child matching the next character
		TrieNode matchingChild = getNextChild(currNode, value);
		
		if (matchingChild == null) {
			return false;
		}
		
		if (value.length() == 1) {
			if (matchingChild.isWord){
				// If we find the value then remove it!
				matchingChild.isWord = false;
				
				// If the node doesn't have any children, delete it
				if (matchingChild.children.size() == 0) {
					currNode.children.remove(matchingChild);
				}
				return true;
			} else {
				return false;
			}
		}
		return removeHelper(matchingChild, value.substring(1));
	}
	
	/*
	 * Returns the trie node associated with the value.
	 * If the value is not in this trie, returns null
	 */
	private TrieNode getTrieNode(TrieNode currNode, String value) {
		if (currNode == null || value == null) return null;
		
		// If we're not at the root and the curr node's value
		// doesn't match the first char of value
		if (!currNode.value.equals(START_TOKEN) 
		  && currNode.value.charAt(0) != value.charAt(0)) {
			return null;
		}
		
		// Find the child matching the next character
		TrieNode matchingChild = getNextChild(currNode, value);
		
		if (matchingChild == null) {
			return null;
		}
		
		if (value.length() == 1) {
			if (matchingChild.isWord){
				return matchingChild;
			} else {
				return null;
			}
		}
		return getTrieNode(matchingChild, value.substring(1));		
	}

	@Override
	public int size() {
		return sizeHelper(root);
	}
	
	private int sizeHelper(TrieNode currNode) {
		if (currNode == null) {
			return 0;
		}
		
		int result = 0;
		if (currNode.isWord) {
			result = 1;
		}
		
		for(TrieNode child : currNode.children) {
			result += sizeHelper(child);
		}
		return result;
	}

	@Override
	public int height() {
		return heightHelper(root);
	}
	
	private int heightHelper(TrieNode currNode) {
		if (currNode == null || currNode.children.size() == 0) {
			return 0;
		}
		
		int maxHeight = 0;
		for(TrieNode child : currNode.children) {
			maxHeight = Math.max(maxHeight,	heightHelper(child) + 1);
		}
		
		return maxHeight;
	}

	@Override
	public boolean contains(String value) {
		return getTrieNode(root, value) != null;
	}

	@Override
	public Tree<String> deepCopy() {
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
