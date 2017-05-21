package apad;

/**
 * @author Gil
 *
 */
public class List implements ListInterface {

	private int size = 0;
	LinkedNode head;
	LinkedNode tail;

	public class LinkedNode {
		Object item;
		LinkedNode next;
		LinkedNode prev;

		public LinkedNode(Object data) {
			// TODO Auto-generated constructor stub
			this.item = data;
		}
	}

	public List() {
		this.head = null;
		// set the last node to null
		this.tail = null;
	}

	@Override
	public void enqueue(Object newItem) throws ListException {
		// TODO Auto-generated method stub
		LinkedNode node = new LinkedNode(newItem); // creates new queue item
		if (isEmpty()) {
			head = node;
		} else {
			tail.next = node;
		}
		tail = node;
		size++;
	}

	@Override
	public void dequeue() throws ListException {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new ListException(" List is empty");
		}

		head = head.next;
		size--;
	}

	public void deueueAll() throws ListException {
		// TODO Auto-generated method stub
		if (head == null) {
			throw new ListException("List is empty");
		} else {
			head = null;
			tail = null;
		}
		size = 0;
	}

	@Override
	public Object peek() throws ListException {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new ListException(" Damn thing is empty");
		} else {
			return head.item.toString();
		}

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	public String toString() {
		String items = "";
		LinkedNode curr = head;
		if (!isEmpty()) {
			items += head.item;
		}
		while (curr.next != null) {
			curr = curr.next;
			items += curr.item;
		}
		return items;
	}
}
