package polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		List<Employee> listaFunc = new ArrayList<>();
		
		System.out.print("Enter the number of employees:");
		int N = ler.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.println("Employee #" + (i+1) + " data:");
			System.out.print("Outsourced (y/n)?");
			char r = ler.next().charAt(0);
			
			System.out.print("Name:");
			ler.nextLine();
			String name = ler.nextLine();
			
			System.out.print("Hours:");
			Integer hours = ler.nextInt();
			
			System.out.print("Value per hour:");
			Double value = ler.nextDouble();
			
			if(r == 'y') {
				System.out.print("Addicional charge:");
				Double additional = ler.nextDouble();
				listaFunc.add(new OutsourceEmployee(name, hours, value, additional));
			}
			else {
				listaFunc.add(new Employee(name, hours, value));
			}
			
			System.out.println("");
		}

		for(Employee f : listaFunc) {
			System.out.println(f.getName() + " - $ " + f.payment());
		}
		
		ler.close();
	}
	
	

}
