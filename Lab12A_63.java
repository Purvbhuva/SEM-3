class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
}

class LinkedList
{
	Node head;
	//for crearing linked list
	public void add(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head = newNode;
		}
		else
		{
			Node temp = head;
			while (temp.next!=null)
			{
				temp = temp.next;	
			}
			temp.next = newNode;
		}
	}

	public void printList()
	{
		Node temp = head;
		while (temp!=null)
		{
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public LinkedList cloneList()
	{
		if (head==null) 
		{
			return null;	
		}

		 // Create a new list to store the cloned nodes

		 LinkedList clonedList = new LinkedList();
		 Node current = head;
		 Node clonedCurrent = new Node(current.data); //Create the first node

		 //  clonedHead --> [1] --> null
		 clonedList.head = clonedCurrent;

		 current = current.next;

		 while (current!=null) {
			clonedCurrent.next = new Node(current.data);// Create the next node
			clonedCurrent = clonedCurrent.next;
			current = current.next;
		 }
		 return clonedList;
	}
}





class Lab12A_63
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();

		list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

		System.out.println("Original List:");
        list.printList();

		  // Cloning the linked list
		  LinkedList clonedList = list.cloneList();

		  System.out.println("Cloned List:");
		  clonedList.printList();
	}
}