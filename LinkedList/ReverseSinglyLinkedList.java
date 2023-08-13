//Reverse a Singly Linked List
public class ReverseSLL {
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
		public void display(Node head) {
			while(head != null) {
				System.out.print(head.data+"->");
				head = head.next;
			}
			System.out.println();
		}
	//Reverse a Singly Linked List
		public Node reverse(Node head) {
			Node previous = null;
			Node current = head;
			Node nextNode = null;
			while(current != null) {
				nextNode = current.next;
				current.next = previous;
				previous = current;
				current = nextNode;
			}
			head = previous;
			return head;
		}
	public static void main(String[] args) {
		ReverseSLL s1 = new ReverseSLL();	
		s1.insertAtLast(10);
		s1.insertAtLast(20);
		s1.insertAtLast(30);
		s1.insertAtLast(40);
		s1.insertAtLast(50);
		s1.insertAtLast(60);
		s1.display(head);
		head = s1.reverse(head);
		s1.display(head);
	}
}
