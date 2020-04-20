import java.util.Scanner;

public class Shivu {
	public static void main(String[] args) {
Scanner ss=new Scanner(System.in);
System.out.println("fffffffff"); 
 int n = ss.nextInt();
for(int i=0;i<n;i++) {
	for (int j=0;j<n;j++) {
		if(i+j>n-1) 
			System.out.print("*");
			else 
			System.out.print(" ");
		}
	System.out.println();
	}
}
	}

