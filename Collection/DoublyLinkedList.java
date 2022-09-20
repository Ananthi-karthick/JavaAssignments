package LinkedList;

public class DoublyLinkedList {
	public ListNode head;//first node of LL
	public ListNode tail;//Last node of LL
	public int length;//no.of nodes in LL

	public  class ListNode
	{
		public int data;//actual data of a node
		public ListNode previous;//stores address of  the previous node
		public ListNode next;//stores address of  the next node
	
	public  void ListNode(int data)
	{
		this.data=data;
	}	
	}
	public   DoublyLinkedList()
	{
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	public boolean isEmpty()
	{
		return length==0;//true if list is empty(head==null)
	}
	public int length()
	{
		return length;
	}
	
	public   void addNodeFirst(int value)
	{
		ListNode newNode=new ListNode();
		newNode.data=value;
		if(isEmpty())
			tail=newNode;
		else {
			head.previous=newNode;
		}
		newNode.next=head;
		head=newNode;
		length++;
		display();
		System.out.println();
		}
	public   void addNodeLast(int value)
	{
		ListNode newNode=new ListNode();
		newNode.data=value;
		if(isEmpty())
			head=newNode;
		else {
			tail.next=newNode;
			newNode.previous=tail;
		}
		
		tail=newNode;
		length++;
		
		display();
		}
	
	public  void display() {  
        //Node current will point to head  
        ListNode current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
       
        System.out.println();
        while(current != null) {  
            //Prints each node by incrementing the pointer.  
        	
            System.out.print(current.data + "--> ");  
            current = current.next;  
            } 
        System.out.print("null");  
	}
	public static void main(String[] args) {
		DoublyLinkedList dll=new DoublyLinkedList();
		 System.out.println("Nodes of doubly linked list:");
		 for(int i=1;i<=10;i++)
		 {
dll.addNodeLast(i);
	}
		
		System.out.println(System.currentTimeMillis());      
	}
	
	
	

}
