import java.util.Scanner;
class Fabolous {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner tt=new Scanner(System.in);
		int n=tt.nextInt();
		int m=tt.nextInt();
		int p=tt.nextInt();
	printfib(m,p);
	
	}
	static void printfib(int m,int p)
	{
	int f1=0,f2=1;
	while(f1<=p)
	{
		if(f1>=m)
		System.out.println(f1);
		int f3=f1+f2;
		f1=f2;
		f2=f3;
		
	}
	
			
	}
	
}
