public class Stack 
{
	Node head = null;

	static class Node
	{
		int value;
		Node next;

		Node(int data)
		{
			value = data;
			next = null;
		}
	}

	void push(int value_toPush)
	{
		Node newNode = new Node(value_toPush);

		if (head == null)
		{
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}

	void pop()
	{
		if (head == null)
		{
			System.out.println("Stack Underflow");
			return;
		}

		System.out.println("Item Poped: " + head.value);

		head = head.next;
	}

	void printStack()
	{
		Node temp;

		if (head == null)
		{
			System.out.println("Stack Underflow");
			return;
		}
		
		temp = head;

		System.out.println("\nStack: ");

		while (temp != null)
		{
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println();
	}
}
