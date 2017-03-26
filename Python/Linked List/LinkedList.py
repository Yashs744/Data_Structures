class Node:
	def __init__(self, data):
		self.data = data
		self.next = None

		
class LinkedList:
	def __init__(self):
		self.head = None
		
	def push(self, value_toInsert):
		new_Node = Node(value_toInsert)
		
		if self.head == None:
			self.head = new_Node
			
		else:
			new_Node.next = self.head
			
			self.head = new_Node
			
	def append(self, value_toAppend):
		new_Node = Node(value_toAppend)
		
		if self.head is None:
			self.head = new_Node
			return
			
		temp = self.head
		
		while (temp.next):
			temp = temp.next
			
		temp.next = new_Node

	def remove(self):
		currentNode = previousNode = self.head
		
		while currentNode.next:
			previousNode = currentNode
			currentNode = currentNode.next
		
		if currentNode is None:
			print ("Empty List");
			return;
			
		print ("Item Deleted: {}".format(currentNode.data))	
			
		if currentNode == self.head:
			self.head = currentNode.next
			del(currentNode)
			return;
			
		previousNode.next = None;
		del(currentNode)
		
	def removeValue(self, value_toRemove):
		currentNode = previousNode = self.head
		
		while currentNode.data != value_toRemove:
			previousNode = currentNode
			currentNode = currentNode.next
		
		if currentNode is None:
			print ("Empty List");
			return;
			
		print ("Item Deleted: {}".format(currentNode.data))	
			
		if currentNode == self.head:
			self.head = currentNode.next
			del(currentNode)
			return;
			
		previousNode.next = currentNode.next;
		del(currentNode)
		
	def Display(self):
		temp = self.head

		print ("\nList: ", end="")
		
		while (temp):
			print(temp.data, " ", end="")
			temp = temp.next
			
		print()