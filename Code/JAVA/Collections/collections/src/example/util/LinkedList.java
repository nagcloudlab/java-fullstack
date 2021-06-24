package example.util;

import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {

	private Node head;

	public void add(E e) {
		Node newNode = new Node(e);
		if (head == null) {
			head = newNode;
		} else {
			Node lastNode = head;
			while (lastNode.getNext() != null) {
				lastNode = lastNode.getNext();
			}
			lastNode.setNext(newNode);
		}
	}

	@Override
	public Iterator<E> iterator() {

		// Local-Inner-class
		class Impln implements Iterator<E> {
			Node currentNode = head;

			@Override
			public boolean hasNext() {
				boolean b = false;
				if (currentNode != null) {
					b = true;
				}
				return b;
			}

			@Override
			public E next() {
				E e = currentNode.getData();
				currentNode = currentNode.getNext();
				return e;
			}

		}

		return new Impln();
	}

	// Inner-class
	private class Node {
		private E data;
		private Node next;

		public Node(E data) {
			super();
			this.data = data;
		}

		public Node(E data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}

		public E getData() {
			return data;
		}

		public void setData(E data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}
