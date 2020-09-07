package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter conv = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		conv.dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		conv.dollar = sc.nextDouble();
		
		conv.amountPaid();
		double iofTax = conv.amountPaid() + conv.amountPaid() * CurrencyConverter.IOF;
		System.out.println("Amount to be paid in reais: " + iofTax);
		
		sc.close();
	}

}
