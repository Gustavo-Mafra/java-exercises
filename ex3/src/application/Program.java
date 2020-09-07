package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stu = new Student();
		stu.name = sc.nextLine();
		stu.t1 = sc.nextDouble();
		stu.t2 = sc.nextDouble();
		stu.t3 = sc.nextDouble();
		
		stu.notaFinal();
		sc.close();
	}

}
