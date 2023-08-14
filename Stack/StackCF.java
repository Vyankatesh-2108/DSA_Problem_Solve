//Stack Using Collection Framework

package stackLL;
import java.util.*;
public class StackCF {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println("Peek Element : "+s.peek());
		while(!s.isEmpty()) {
			System.out.println(" | "+s.peek()+" | ");
			s.pop();
		}
	}
}