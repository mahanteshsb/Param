
public class Fruit {

	String model;
	String clr;
	Fruit(String m,String a)
	{
		
		model=m;
	
		clr=a;
	}
	
public static void main(String arg[]) {
		Fruit c1= new Fruit("mango","yellow");
		Fruit c2= new Fruit("apple","rd");
		
		
		System.out.println(c1.model);
		System.out.println(c1.clr);
		System.out.println(c2.model);
		System.out.println(c2.clr);
		
	} 
}
