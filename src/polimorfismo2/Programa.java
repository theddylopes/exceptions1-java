package polimorfismo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		List<Product> listProd = new ArrayList<>();
		
		System.out.print("Enter the number of products:");
		int n = ler.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Product #" + (i+1) + " data: ");
			System.out.print("Commom, used or imported (c/u/i)? ");
			char mod = ler.next().charAt(0);
			System.out.print("Name: ");
			ler.nextLine();
			String na = ler.nextLine();
			System.out.print("Price: ");
			Double pr = ler.nextDouble();
			
			if(mod == 'i') {
				System.out.print("Custom fee: ");
				Double cf = ler.nextDouble();
				listProd.add(new ImportedProduct(na, pr, cf));
			}
			else if(mod == 'u') {
				System.out.print("Manufacture date: ");
				String d = ler.next();
				Date md = sdf.parse(d);
				listProd.add(new UsedProduct(na, pr, md));
			} 
			else if(mod == 'c') {
				listProd.add(new Product(na, pr));
			}
			
			System.out.println("");
		}
		
		System.out.println("PRICE TAGS:");
		
		for(Product p : listProd) {
			System.out.println(p.priceTag());
		}

		
		ler.close();

	}

}
