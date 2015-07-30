package task02;

import java.util.EmptyStackException;

public class UniqueStackInt {

	public static void main(String[] args) {

		UniqueStackInt stack = new UniqueStackInt();

		System.out.println(stack.push(30));
		System.out.println(stack.push(12));
		System.out.println(stack.push(25));

		System.out.println(stack.isIncreasing());

		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println(stack);

	}

	private Node start;

	/**
	 * Constructor.
	 */
	public UniqueStackInt() {
		this.start = null;
	}

	/**
	 * Gives info.
	 */
	public String toString() {
		if (start == null) {
			return "Stack is empty.";
		}
		return start.toString();
	}

	/**
	 * Pushes an item onto the top of this stack.
	 * 
	 * @return
	 */
	public Integer push(Integer value) {
		Node temp = new Node(value);
		if (start == null) {
			start = new Node(value);
		} else {
			if (!contains(value)) {
				temp.setNext(start);
				start = temp;
			}
		}
		return value;
	}

	/**
	 * Checks if the inputed element is on the list.
	 * 
	 * @return True if there is element in the list, and false if not.
	 */
	public Boolean contains(Integer value) {
		Node temp = start;
		if (temp.getValue().equals(value)) {
			return true;
		}
		while (temp.getNext() != null) {
			temp = temp.getNext();
			if (temp.getValue().equals(value)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Removes the object at the top of this stack.
	 * 
	 * 
	 * @return The object at the top of this stack.
	 * @throws EmptyStackException
	 * 
	 */
	public Integer pop() throws EmptyStackException {
		Integer temp = start.getValue();
		if (start == null) {
			throw new EmptyStackException();
		} else {
			start = start.getNext();
		}
		return temp;
	}

	/**
	 * Checks if the elements of the stack are increasing
	 * 
	 * @return True if they are and false if they are not..
	 */
	public Boolean isIncreasing() {
		Node temp = start;
		while (temp.getNext() != null) {
			if (temp.getValue() > temp.getNext().getValue()) {
				return false;
			}
			temp = temp.getNext();
		}
		return true;
	}

	/**
	 * Inner class.
	 */
	private class Node {
		private Integer value;
		private Node next;

		/**
		 * Constructor.
		 * 
		 * @param value
		 */
		public Node(Integer value) {
			super();
			this.value = value;
		}

		/**
		 * Method gives info.
		 */
		public String toString() {
			if (next == null) {
				return value + "";
			}
			return value + ", " + next.toString();
		}

		public Integer getValue() {
			return value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}
}
