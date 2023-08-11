//Delete a Node

public class SLList {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	//Insert At Beginning
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next=head;
		head=newNode;
		
	}
	
	//Insert At End
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node tail = head;
		while(tail.next != null) {
			tail = tail.next;
		}
		
		tail.next = newNode;
	}
	
	//Insert At Any Position
	public void addAnywhere(int data) {
		Node newNode = new Node(data);
		Node tail = head;
		int count=1;
		int pos=2;
		while(count<pos) {
			count++;
			tail=tail.next;
		}
		newNode.next = tail.next;
		tail.next = newNode;
	}
	
	//Display
	public void display() {
		Node tail = head;
		while(tail != null) {
			System.out.print(tail.data+" -> ");
			tail = tail.next;
		}
	}
	
	//Delete a Node
	public void deleteNode(int pos) {
		if(pos == 0) {
			Node newNode = head.next;
			head=newNode;
			return;
		}
		
		Node temp = head;
		for(int i=0; i<pos-1; i++)
			temp = temp.next;
		
		Node deleteNode = temp.next;
		temp.next = deleteNode.next;
		
	}
	
	public static void main(String[] args) {
		SLList l1 = new SLList();
		l1.addLast(10);
		l1.addLast(20);
		l1.addLast(30);
		l1.addLast(40);
		l1.addFirst(55);
		l1.addAnywhere(65);
		l1.display();
		l1.deleteNode(2);
		System.out.println();
		l1.display();
	}
}
