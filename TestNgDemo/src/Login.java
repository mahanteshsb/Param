import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		System.out.println("Enter the numbber");

		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		
		System.out.println("Enter the gender");
		Scanner ss1=new Scanner(System.in);

		String gend=ss1.nextLine();

		if(n>20&&n<40)
		{
		     System.out.println("any");
		}
		else if(n>40)
		 {

		      if(gend.equals("female"))
		      {
					 System.out.println("urban");
		    	  
		      }
		       else if(gend.equals("male"))
		       {
		              System.out.println("any");
		       }
	     }
		 else if(n<=20){ 
		        System.out.println("value is less than 20 i don't know what to print");
		}

	}

}
