package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter rectangle width and height:");
		Rectangle rectangle = new Rectangle();
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println("Area: " + rectangle.area());
		System.out.println("Perimeter: " + rectangle.perimeter());
		System.out.println("Diagonal: " + rectangle.diagonal());
		sc.close();
	}

}
