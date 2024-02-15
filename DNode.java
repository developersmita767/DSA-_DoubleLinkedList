class Node
{
	Node prev;
	int data;
	Node next;
}

class Test
{
	public static void main(String[] args)
	{
	 Node f=new Node();
	 Node s=new Node();
	 Node t=new Node();
	 f.prev=null;
	 f.data=10;
	 f.next=s;
	 s.prev=f;
	 s.data=20;
	 s.next=t;
	 t.prev=s;
	 t.data=30;
	 t.next=null;
	 Node ptr=f;
	 Node temp=null;
	 System.out.println("element in forward direction");
	 while(ptr!=null)
	 {
	 	temp=ptr;
	   System.out.println(ptr.data);//10
	   ptr=ptr.next;
	 }
	 System.out.println("element in backward direction");
	 while(temp!=null)
	 {
	 	
	   System.out.println(temp.data);//10
	   temp=temp.prev;
	 }

	}
  }


