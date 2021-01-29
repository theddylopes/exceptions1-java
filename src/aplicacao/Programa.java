package aplicacao;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room Number: ");
			int rn = ler.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(ler.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(ler.next());
			
			Reservation r1 = new Reservation(rn, checkIn, checkOut);
			System.out.println("Reservation: " + r1);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(ler.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(ler.next());
			
			r1.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + r1);
		}
		catch (ParseException e) {
			System.out.println("Invalid date format");
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
	
		ler.close();
	}
	
}
