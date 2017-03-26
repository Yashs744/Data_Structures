public class LinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int x) {
		
		data = x;
		next = null;
		}

	}

	void push(int value_toPush) {

		Node newNode = new Node(value_toPush);

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}

	void append(int value_toAppend) {

		Node newNode = new Node(value_toAppend);

		if (head == null) {
			head = newNode;
			return;
		}

		Node last = head;

		while (last.next != null)
			last = last.next;

		last.next = newNode;
	}

	void remove() {

		Node currentNode, previousNode;

		currentNode = previousNode = head;

		while (currentNode.next != null) {
			previousNode = currentNode;
			currentNode = currentNode.next;
		}

		System.out.println("Item Deleted: " + currentNode.data);
		
		if (currentNode == head) {
			head = currentNode.next;
			currentNode = null;
			return;
		}

		currentNode = null;
		previousNode.next = null;
	}

	void remove(int value_toRemove) {

		Node currentNode, previousNode;

		currentNode = previousNode = head;

		while (currentNode.data != value_toRemove) {
			previousNode = currentNode;
			currentNode = currentNode.next;
		}

		if (currentNode == null) {
			System.out.println("Item Not Found!!!");
			return;
		}
		
		System.out.println("Item Delete: " + currentNode.data);

		if (currentNode == head) {
			head = currentNode.next;
			currentNode = null;
			return;
		}

		previousNode.next = currentNode.next;
		currentNode = null;
	}

	void printList() {

		Node temp = head;

		while (temp != null) {
		
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String []args) {

		LinkedList lList = new LinkedList();

		lList.push(3);
		lList.push(2);
		lList.push(1);

		lList.printList();

		lList.append(4);
		lList.append(5);
		lList.append(6);

		lList.printList();

		lList.remove();

		lList.printList();

		lList.remove();

		lList.printList();

		lList.remove(3);
		
		lList.printList();

		lList.remove(1);

		lList.printList();
		
	}
}
