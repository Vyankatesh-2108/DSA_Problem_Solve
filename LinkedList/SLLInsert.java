public class SLL2 {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}	
	//Insert Element at tail
	public void insertAtLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head=newNode;
			return;
		}	
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	//Insert Element At Beginning
	public void insertAtBegining(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}	
		newNode.next = head;
		head = newNode;
	}
	//Insert Element At any Position
	public void insertAtAnyPos(int data, int pos) {
		Node newNode = new Node(data);
		if(pos == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}
		Node temp = head;
		for(int i=0; i<pos-1; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	//Display Elements
	public void display() {
		Node tail = head;
		while(tail != null) {
			System.out.print(tail.data+"->");
			tail = tail.next;
		}
	}
	//Count Elements in LL
	void countElement() {
		Node temp = head;
		int count=0;
		while(temp != null) {
			count++;
			temp=temp.next;
		}
		System.out.println("\nNumber of elements : "+count);
	}
	//Delete Element At Any Position
	public void deleteElementAtAnyPos(int pos) {
		Node temp = head;
		if(pos == 0) {
			Node deleteNode = head;
			head = deleteNode.next;
			return;
		}
		for(int i=0; i<pos-1; i++) {
			temp = temp.next;
		}
		Node deleteNode = temp.next;
		temp.next = deleteNode.next;
	}
	public static void main(String[] args) {
		SLL2 s1 = new SLL2();	
		s1.insertAtLast(10);
		s1.insertAtLast(20);
		s1.insertAtLast(30);
		s1.insertAtLast(40);
		s1.insertAtLast(50);
		s1.insertAtLast(60);
		s1.insertAtBegining(56);
		s1.insertAtAnyPos(68, 6);
		s1.display();
		s1.countElement();
		s1.deleteElementAtAnyPos(3);
		s1.display();
		s1.countElement();
	}
}
