package example.util;

public class LinkedList<E> {

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

	public E get(int index) {
		// index=0
		return head.getData();
	}

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
