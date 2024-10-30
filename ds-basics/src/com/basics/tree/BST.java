package com.basics.tree;

public class BST<T extends Comparable<T>> {
	private int nodeCount;
	private Node root = null;
	
}

class Node<T> {
	T elm;
	Node left;
	Node right;
}
