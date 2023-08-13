public class ReversePrintSLL {
	static Node head;
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
	//Display Elements
		public void display() {
			Node tail = head;
			while(tail != null) {
				System.out.print(tail.data+"->");
				tail = tail.next;
			}
			System.out.println();
		}
	//Reverse Print Singly Linked List
		public void reversePrint(Node head) {
			if(head == null)
				return;
			reversePrint(head.next);
			System.out.print(head.data+"->");
		}
	public static void main(String[] args) {
		ReversePrintSLL s1 = new ReversePrintSLL();	
		s1.insertAtLast(10);
		s1.insertAtLast(20);
		s1.insertAtLast(30);
		s1.insertAtLast(40);
		s1.insertAtLast(50);
		s1.insertAtLast(60);
		s1.display();
		s1.reversePrint(head);
	}

}
