//Stack Using Array List

import java.util.*;
public class StackAL {
	static class stack{
		 ArrayList<Integer> arr = new ArrayList<>();
		 void push(int data) {
			arr.add(data);
		 }
		 
		 boolean isEmpty() {
			 return arr.size() == 0;
		 }
		 
		 void pop() {
			 if(isEmpty())
				 return;
			 arr.remove(arr.size()-1);
		 }
		 
		 int peek() {
			 if(isEmpty())
				 return -1;
			 return arr.get(arr.size()-1);
		 }
		 
		 void display() {
			 for(int i=arr.size()-1; i>=0; i--)
				 System.out.println(arr.get(i));
		 }
		
	}
	
	
	public static void main(String[] args) {
		stack s = new stack();
		s.push(45);
		s.push(18);
		s.push(50);
		s.push(85);
		System.out.println("Stack Elements : ");
		s.display();
		System.out.println("Peek Element : "+s.peek());
		System.out.println("After one Elment is Pop : ");
		s.pop();
		s.display();
		
	}

}
