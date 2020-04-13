
public class ProductTest {
	public static void main(String[] args) {
		Product p1=new Product("apple",15,10);
		Product p2=new Product("mango",85,5);
		Product p3=new Product("orange",220,45);
		System.out.println(p1.name+" "+p1.price+" "+p1.qty);
		System.out.println(p2.name+" "+p2.price+" "+p2.qty);
		System.out.println(p3.name+" "+p3.price+" "+p3.qty);
		
	}

}
