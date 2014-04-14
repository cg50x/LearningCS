package com.cg50x.learncs.datastructures.trees;

import java.util.ArrayList;

class TrieNode {
	
	String value;
	ArrayList<TrieNode> children;
	boolean isWord;
	
	TrieNode(String value) {
		this.value = value;
		children = new ArrayList<TrieNode>();
		this.isWord = false;
	}

}
