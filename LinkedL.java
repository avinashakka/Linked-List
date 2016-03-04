
public class LinkedL 
{
	public Node head;
	
		
	Node getHead()
	{
		return this.head;
	}
	
	void add(int x)
	{
		
		if(head == null)
		{
			head = new Node();
			head.data = x;
			head.next = null;
		}
		else
		{
			Node temp = new Node();
			temp.next = head;
			temp.data = x;
			head = temp;
		}
	}
	
	public void sort()
	{		
		if(head == null || head.next == null)
		{
			
		}
		else
		{
			Isort(head);
			
		}
		
	}
	
	public void Isort(Node head)
	{
		int size = this.size(head);
		Node current = head.next;
		Node insertionPointer = head;
		//takes O(n^2)
		while(current != null)
		{
			insertionPointer = head;
			while(insertionPointer != current)
			{
				if(insertionPointer.data > current.data)
				{
					int temp = current.data;
					current.data = insertionPointer.data;
					insertionPointer.data = temp;					
				}
				else
				{
					insertionPointer = insertionPointer.next;
				}
			}
			
			current = current.next;
			
		}
	}
	
	
	
	public int size()
	{
		return size(this.head);
	}
	
	public int size(Node head)
	{
		if(head == null)
		{
			return 0;
		}
		else if(head.next == null)
		{
			return 1;
		}
		else
		{
			Node next = head;
			int size = 1;
			while(next.next != null)
			{
				next = next.next;
				size++;				
			}
			return size;
		}
	}
	
	boolean search(int x)
	{
		
		if(head.data == x)
			return true;
		else
		{
			Node curr = this.head;
			while(curr.next != null)
			{
				if(curr.data==x)
					return true;
				curr = curr.next;
			}
			if(curr.data == x)
				return true;
		}
		return false;
	}
	
	void deleteFirstOccurance(int x)
	{
		
		if(head.data == x)
		{
			head = head.next;
		}
		else
		{
			Node curr = this.head;
			Node prev = this.head;			
			while(curr.next != null)
			{
				if(curr.data == x)
				{
					prev.next = curr.next;					
				}
				prev = curr;
				curr = curr.next;
			}
			if(curr.data == x)
				prev.next = null;
		}
	}
	
	void displayList()
	{
		Node curr = this.getHead();
		System.out.println("Contents of the Linked List are: ");
		while(curr.next != null)
		{			
			System.out.print(curr.data + " : ");	
			curr = curr.next;
		}
		System.out.print(curr.data);
		System.out.println();
	}

}
