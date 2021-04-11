package app;
import entities.*;
import java.text.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws ParseException{
		
		Locale.setDefault(Locale.US);
		Scanner e = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> product = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = e.nextInt();
		e.nextLine();
		System.out.println();
		
		for(int c = 0; c < n; c++){

			System.out.println("Product #" + (c + 1) + " Data: ");
			
			System.out.print("Commo, Used, Imported ( C | U | I ): ");
			char op = e.next().charAt(0);
			e.nextLine();
			
			System.out.print("Name: ");
			String name = e.nextLine();
			
			System.out.print("Price $: ");
			double price = e.nextDouble();
			
			switch(op){
				case 'c' : product.add(new Product(name, price)); break;
				
				case 'u' : 	System.out.print("Manufacture Date: ");
							Date manDate = sdf.parse(e.next());
							product.add(new UsedProduct(manDate, name,price));break;
				
				case 'i' : 	System.out.print("Customs fee: ");
							double customs = e.nextDouble();
							product.add(new ImportedProduct(customs, name,price));break;			
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS");
		
		for(Product p: product){
			System.out.println(p.priceTag());
		}
		e.close();
	}	
}
