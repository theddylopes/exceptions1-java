package abstrata;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Enter the of shapes: ");
		int n = ler.nextInt();
		
		List<Shape> listShape = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Shape " + (i+1) + " data:");
			
			char sh;
			do {
				System.out.print("Rectangle or Circle (r/c)?");
				sh = ler.next().charAt(0);
				
				if(sh == 'r') {
					System.out.print("Color (BLACK/BLUE/RED):");
					String co = ler.next();
					System.out.print("Width: ");
					Double wi = ler.nextDouble();
					System.out.print("Height: ");
					Double he = ler.nextDouble();
					listShape.add(new Rectangle(Color.valueOf(co), wi, he));
				}
				else if (sh == 'c'){
					System.out.print("Color (BLACK/BLUE/RED):");
					String co = ler.next();
					System.out.print("Radius: ");
					Double ra = ler.nextDouble();
					listShape.add(new Circle(Color.valueOf(co), ra));
				}
				else {
					System.out.println("Burro! Digite as letras r ou c apenas.");
				}
				
			}while(sh != 'r' && sh != 'c');
		}
		
		System.out.println("Areas: ");
		for(Shape shape : listShape) {
			if(shape instanceof Rectangle) {
				System.out.println("Area do retangulo: " + shape.area());
			}
			if(shape instanceof Circle) {
				System.out.println("Area do circulo: " + shape.area());
			}
		}
		
		ler.close();
	}

}
