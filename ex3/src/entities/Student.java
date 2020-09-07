package entities;

public class Student {

	public String name;
	public double t1;
	public double t2;
	public double t3;

	public void notaFinal() {
		double notaFim = t1 + t2 + t3;
		if (notaFim < 60) {
			System.out.println("FINAL GRADE = " + notaFim);
			System.out.println("FAILED");

			System.out.printf("MISSING %.2f POINTS", 60 - notaFim);
		} else {
			System.out.println("FINAL GRADE = " + notaFim);
			System.out.println("PASS");
		}
	}
}
