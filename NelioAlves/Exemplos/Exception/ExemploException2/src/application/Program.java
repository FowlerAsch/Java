package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import models.entities.Reserva;
import models.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {

			System.out.print("Numero do Quarto: ");
			int numeroDoQuarto = sc.nextInt();

			System.out.print("Data do Check-in (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());

			System.out.print("Data do Check-out (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());

			Reserva reserva = new Reserva(numeroDoQuarto, checkIn, checkOut);
			System.out.println("Reserva: " + reserva);

			System.out.println();
			System.out.println("Entre com a nova data de reserva:");

			System.out.print("Data do Check-in (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());

			System.out.print("Data de check-out (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());

			reserva.updateDates(checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
		} 
		catch (ParseException e) {
			System.out.println("Formato de Data Errada");
		} 
		catch (DomainException e) {
			System.out.println("Erro de Reserva: " + e.getMessage());
		} 
		catch (RuntimeException e) {
			System.out.println("Erro inesperado");
		}

		sc.close();

	}

}
