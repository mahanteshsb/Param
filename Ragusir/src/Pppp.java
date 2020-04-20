import java.util.Scanner;

public class Pppp {
	public static void main(String[] args) {
		

		Scanner tt=new Scanner(System.in);

		System.out.println("enter month");
		 int n=tt.nextInt();
		 int st=1,k=1;
		 for(int i=1;i<=n;i++)
		{
		
		 for(int j=1;j<=n-i;j++)
		 {
			 System.out.print(" ");
		 } 
		 k=1;
		 for(int j=1;j<=st;j++)
		 {
			 System.out.print(k+"");
			 if(j<=st/2)
			 k++;
			 else
				 k--;
		 }
		st=st+2;
		System.out.println();
		}
	}
}
