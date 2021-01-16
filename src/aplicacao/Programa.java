package aplicacao;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room Number: ");
		int rn = ler.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(ler.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(ler.next());
		
		if(!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date.");
		}
		else
		{
			Reservation r1 = new Reservation(rn, checkIn, checkOut);
			System.out.println("Reservation: " + r1);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(ler.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(ler.next());
			
			Date now = new Date();
			if(checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			}
			else {
				if(!checkOut.after(checkIn)) {
					System.out.println("Error in reservation: Check-out date must be after check-in date.");
				}
				else {
					r1.updateDates(checkIn, checkOut);
					System.out.println("Reservation: " + r1);
				}
				
			}
			
		}
	
		ler.close();
	}
	
}
