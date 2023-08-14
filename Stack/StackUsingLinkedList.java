//stack using Linked List

package stackLL;
public class stackSLL {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	static class stack{
		static Node head;
		//Creating a Stack using Linked List
		static void push(int data) {
			Node newNode = new Node(data);
			if(head == null) {
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}
		//Check Whether stack is empty or not
		static boolean isEmpty() {
			return head==null;
		}
		//pop one element at a time from top
		static int pop() {
			if(isEmpty())
				return -1;
			Node temp = head;
			head = head.next;
			return temp.data;
		}
		//find peek element in stack
		static int peek() {
			if(isEmpty())
				return -1;
			Node temp = head;
			return temp.data;
		}
		//Display all element
		static void display() {
			Node tail = head;
			while(tail != null) {
				System.out.println(" | "+tail.data+" | ");
				tail = tail.next;
			}
		}
	}
	public static void main(String[] args) {
		stack s = new stack();
		s.push(12);
		s.push(45);
		s.push(34);
		s.push(58);
		System.out.println("Peek Element   : "+s.peek());
		s.display();
		s.pop();
		System.out.println("After one element is pop.");
		s.display();
	}
}