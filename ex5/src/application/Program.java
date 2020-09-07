package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		holder = sc.nextLine();
		System.out.print("Enter a intial deposit value (y/n)? ");
		char comand = sc.nextLine().charAt(0);
		
		
		if (comand == 'y') {			
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			acc = new Account(number, holder, initialDeposit);
		} else {
			acc = new Account(number, holder);
		}
		System.out.println("Account data: ");
		System.out.println(acc);
		System.out.println();
		
		System.out.print("Enter deposit value: ");
		double depositValue = sc.nextDouble();
		acc.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(acc);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		acc.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(acc);
		
		sc.close();
	}

}
