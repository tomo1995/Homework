package task01;

import java.util.NoSuchElementException;

public class LinkedListBoolean {
	private Node head;
	/**
	 * Adding new value to list.
	 * @param value
	 */
	public void add(boolean value) {
		if (head == null) {
			head = new Node(value);
			return;
		}
		Node tmp = head;
		while (tmp.getNext() != null) {
			tmp = tmp.getNext();
		}
		tmp.setNext(new Node(value));
	}
	/**
	 * This method removes given value from the list.
	 * @param value
	 * @throws NoSuchElementException
	 */
	public void remove(boolean value) throws NoSuchElementException {
		if (head == null)
			throw new NoSuchElementException();
		if (head.getValue() == value) {
			head = head.getNext();
			return;
		}
		Node previous = head;
		Node tmp = head.getNext();
		while (tmp != null) {
			if (tmp.getValue() == value) {
				previous.setNext(tmp.getNext());
				return;
			}
			previous = tmp;
			tmp = tmp.getNext();
		}
		throw new NoSuchElementException();
	}
	/**
	 * This method removes value at the given index.
	 * @param value
	 * @param index
	 * @throws NoSuchElementException
	 * @throws ArrayIndexOutOfBoundsException
	 */
	public void remove(boolean value, int index) throws NoSuchElementException,
			ArrayIndexOutOfBoundsException {
		if (head == null || index < 0 || index >= size())
			throw new ArrayIndexOutOfBoundsException();
		Node previous = head;
		for (int i = 0; i < index; i++) {
			previous = previous.getNext();
		}
		Node tmp = previous.getNext();
		for (int i = index; i < size(); i++) {
			if (tmp.getValue() == value) {
				previous.setNext(tmp.getNext());
				return;
			}
		}
		throw new NoSuchElementException();
	}
	/**
	 * Loking if given element is in the list.
	 * @param value
	 * @return
	 */
	public boolean contains(boolean value) {
		Node tmp = head;
		for (int i = 0; i < size(); i++) {
			if (tmp.getValue() == value)
				return true;
		}
		return false;
	}
	/**
	 * This method returns true if elements are alternating, Or false if they are not!.
	 * @return
	 */
	public boolean isAlternating() {
		if (head == null)
			return true;
		Node tmp = head;
		boolean tmpValue = head.getValue();
		for (int i = 0; i < size(); i++) {
			if (tmp.getValue() == tmpValue) {
				tmpValue = !tmpValue;
			} else {
				return false;
			}
			tmp = tmp.getNext();
		}
		return true;
	}
	/**
	 * Size of list
	 * @return
	 */
	public int size() {
		Node tmp = head;
		int size = 0;
		while (tmp != null) {
			size++;
			tmp = tmp.getNext();
		}
		return size;
	}

	@Override
	public String toString() {
		if (head == null) {
			return "List is empty.";
		}
		return head.toString();
	}

	private class Node {

		private boolean value;
		private Node next;
		/**
		 * Constructor...
		 * @param value
		 */
		public Node(boolean value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public boolean getValue() {
			return value;
		}

		@Override
		public String toString() {
			if (next == null)
				return String.valueOf(value);
			return value + ", " + next.toString();
		}
	}
}
