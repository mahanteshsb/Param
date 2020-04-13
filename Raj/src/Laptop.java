
public class Laptop {
String model;
int price;
String clr;
Laptop (String m,int p,String c)
{
	model=m;
	price=p;
	clr=c;
	
}
	public static void main(String arg[])
	{
		Laptop l1=new Laptop("hp",1520,"black");
		Laptop l2=new Laptop("dell",45555,"green");
		Laptop l3=new Laptop("sony",5858546,"blue");
		System.out.println(l1.model+l1.price+l1.clr);
		System.out.println(l2.model+l2.price+l2.clr);
		System.out.println(l3.model+l3.price+l3.clr);
		
		
	}
}

