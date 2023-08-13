//Doubly Linked List

public class DoublyLL {
	Node head;
	class Node{
		int data;
		Node prev;
		Node next;
		Node(int data){
			this.data=data;
			this.prev=null;
			this.next=null;
		}
	}
	//Create A Doubly Linked List
	public void insertDLL(int data) {
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
		newNode.prev = temp;
	}
	//Display Elements of Doubly Linked List
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	//Delete an element
	public void delete(int pos) {
		Node temp = head;
		if(pos == 0) {
			temp = head;
			head = temp.next;
			temp.prev = null;
			return;
		}
		for(int i=0; i<pos-1; i++)
			temp = temp.next;
		Node deleteNode = temp.next;
		temp.next = deleteNode.next;
		deleteNode.next.prev = temp;
	}
	public static void main(String[] args) {
		DoublyLL d1 = new DoublyLL();
		d1.insertDLL(10);
		d1.insertDLL(20);
		d1.insertDLL(30);
		d1.insertDLL(40);
		d1.insertDLL(50);
		d1.insertDLL(60);
		d1.display();
		d1.delete(3);
		d1.display();
	}
}