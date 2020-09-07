package application;

import java.util.Scanner;
import entities.Room;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		sc.nextLine();
		Room[] room = new Room[10];

		for (int i = 0; i < n; i++) {
			System.out.println();
			int rent = i + 1;
			System.out.println("Rent #" + rent + ": ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Number: ");
			int number = sc.nextInt();

			room[number] = new Room(name, email, number);
			System.out.println();
			sc.nextLine();

		}

		System.out.println("Busy rooms:");

		for (int i = 0; i < room.length; i++) {
			if (room[i] != null) {
				System.out.println(room[i].getNumber() + ": " + room[i].getName() + ", " + room[i].getEmail());
			}
		}

		sc.close();
	}

}