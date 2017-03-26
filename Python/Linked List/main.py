from LinkedList import *

if __name__ == "__main__":
	
	lList = LinkedList()
	
	lList.push(3)
	lList.push(2)
	lList.push(1)
	
	lList.Display()
	
	lList.append(4)
	lList.append(5)
	lList.append(6)
	
	lList.Display()
	
	lList.remove()
	
	lList.Display()
	
	lList.removeValue(3)
	
	lList.Display()
	
	lList.removeValue(1)
	
	lList.Display()