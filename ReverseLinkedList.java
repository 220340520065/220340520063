


class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data=d;
		next=null;
	}
}
class LinkedList
{
	Node head;
	
	LinkedList()
	{
		head=null;
	}
	
	void insert(int d)
	{
		Node n=new Node(d);
		if(head==null)
		{
			head=n;
			return;
		}
		Node n1=head;
		while(n1.next!=null)
		{
			n1=n1.next;
		}
		n1.next=n;
	}
	void disp()
	{
		Node n=head;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	void reverse()
	{
		Node prev=head;
		Node current=head.next;
		while(current!=null)
		{
			Node next=current.next;
			current.next=prev;
			
			prev=current;
			current=next;
		}
		head.next=null;
		head=prev;
	}
}

public class ReverseLinkedList
{

   public static void main(String args[])
   {
	   LinkedList l=new LinkedList();
	   l.insert(1);
	    l.insert(2);
		 l.insert(3);
		  l.insert(4);
		   l.insert(5);
		   l.disp();
		   l.reverse();
		   System.out.println("after reversing");
		   System.out.println();
		   l.disp();
   
   }
}