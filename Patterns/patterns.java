public class Main
{
	public static void main(String[] args) {
		for(int i=0; i<5; i++){
		    for(int j=0; j<5; j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
---------------------------------------------------
public class Main
{
	public static void main(String[] args) {
		for(int i=0; i<5; i++){
		    for(int j=0; j<5; j++){
		           if(j<=i)
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
---------------------------------------------------
public class Main
{
	public static void main(String[] args) {
		for(int i=1; i<6; i++){
		    for(int j=1; j<6; j++){
		           if(j<=i){
		            System.out.print(j);   
		           }
		    }
		    System.out.println();
		}
	}
}
----------------------------------------------------
public class Main
{
	public static void main(String[] args) {
		for(int i=1; i<6; i++){
		    for(int j=1; j<6; j++){
		           if(j<=i){
		            System.out.print(i);   
		           }
		    }
		    System.out.println();
		}
	}
}
----------------------------------------------------
public class Main
{
	public static void main(String[] args) {
		for(int i=1; i<6; i++){
		    for(int j=1; j<6; j++){
		           if(j>=i){
		            System.out.print("*");   
		           }
		    }
		    System.out.println();
		}
	}
}
----------------------------------------------------
public class Main
{
	public static void main(String[] args) {
		for(int i=1; i<6; i++){
		    int k=1;
		    for(int j=1; j<6; j++){
		           if(j>=i){
		            System.out.print(k);
		            k++;
		           }
		    }
		    k=0;
		    System.out.println();
		}
	}
}
-------------------------------------------------------
public class Main
{
	public static void main(String[] args) {
		for(int i=1; i<6; i++){
		    for(int j=1; j<6; j++){
		        if(i==1 || i==5 || j==1 | j==5)
		            System.out.print("*");
		        else    
		            System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}

