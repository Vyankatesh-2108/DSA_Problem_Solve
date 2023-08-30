//Delete Nodes

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	LinkedList<Integer> ls = new LinkedList<>();
	int d = sc.nextInt();
	while(d!=00){
	    ls.add(d);
	    d = sc.nextInt();
	}
	int n = sc.nextInt();
	int count=1;
	Iterator it = ls.iterator();
	while(it.hasNext() && count <= n){
	    System.out.print(it.next()+" ");
	    count++;
	}
	}
}