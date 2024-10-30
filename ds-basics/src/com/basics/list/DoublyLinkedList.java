package com.basics.list;

import java.util.Iterator;

// TODO fry run the code
public class DoublyLinkedList<T> implements Iterable<T>{
	Node<T> head;
	Node<T> tail;
	int size = 0;
	
	public void insert(T n)
	{
		Node<T> node = new Node<>(n);
		if(head == null) {
			head = node;
		}
		else {
			tail.setNext(node);
			node.setPrev(tail);
		}
		tail = node;
		size++;
	}
	
	public void insertAtIndex(T n, int index)
	{
		Node<T> node = new Node<>(n);
		if(index == 0)
		{
			if(head != null) {
				Node<T> next = head;
				node.setNext(head);
				next.setPrev(node);
			}
			head = node;
		}
		else {
			if(index > size) return;
			Node<T> tmp = head;
			int count = 0;
			
			while(count < index) tmp = tmp.getNext();
			node.setNext(tmp.getNext());
			tmp.setNext(node);
		}
		size++;
	}
	
	public void removeAtIndex(int index)
	{
		if(index > size) return;
		int count  = 0;
		Node<T> curr = head;
		while(count < index) curr = curr.getNext();
		Node<T> tmp = curr.getNext();
		curr.setNext(curr.getNext().getNext());
		curr.getNext().setPrev(curr);
		tmp.setNext(null);
		tmp.setPrev(null);
		size--;
	}
	
	public boolean remove(T elm)
	{
		Node<T> curr = head;
		if(head == null) return false;
		while(curr != null)
		{
			if(curr.getData() == elm)
			{
				Node<T> p = curr.getPrev();
				Node<T> n = curr.getNext();
				n.setPrev(p);
				p.setNext(n);
				curr.setPrev(null);
				curr.setNext(null);
				size--;
				return true;
			}
		}
		return false;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	public void clear() {
		Node<T> curr = head;
		while(curr != null)
		{
			Node<T> next = curr.getNext();
			curr.setPrev(null);
			curr.setNext(null);
			curr = next;
		}
		head = tail = curr = null;
		size = 0;
	}
	
	public boolean removeAtLast()
	{
		if(tail == null) return false;
		Node<T> tmp = tail;
		tail = tail.getPrev();
		tail.setNext(null);
		tmp.setPrev(null);
		size--;
		return true;
	}
	
	public int indexOf(T data)
	{
		Node<T> curr = head;
		int index = 0;
		while(curr != null) {
			if((data==null && curr.getData() == null) || curr.getData().equals(data)) return index;
			curr = curr.getNext();
			index++;
		}
		return -1;
	}
	
	public int getSize() {
		return this.size;
	}
	
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			Node<T> curr = head;
			@Override
			public boolean hasNext() {
				return (curr != null);
			}

			@Override
			public T next() {
				Node<T> tmp = curr;
				curr = curr.getNext();
				return tmp.getData();
			}
		};
	}
}
