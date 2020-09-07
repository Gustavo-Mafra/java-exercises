package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f %n", emp.name, emp.netSalary());
		System.out.print("Wich percentage increase salary? ");
		double per = sc.nextDouble();
		System.out.println();
		emp.increaseSalary(per);
		System.out.println(emp.toString());
		
		
		sc.close();
	}

}
