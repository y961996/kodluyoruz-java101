import java.util.Scanner;

public class ManavKasa {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double armut = 2.14;
		double elma = 3.67;
		double domates = 1.11;
		double muz = 0.95;
		double patlican = 5.00;

		System.out.print("Armut kac kilo ? : ");
		int armutAdet = scanner.nextInt();
		System.out.print("Elma kac kilo ? : ");
		int elmaAdet = scanner.nextInt();
		System.out.print("Domates kac kilo ? : ");
		int domatesAdet = scanner.nextInt();
		System.out.print("Muz kac kilo ? : ");
		int muzAdet = scanner.nextInt();
		System.out.print("Patlican kac kilo ? : ");
		int patlicanAdet = scanner.nextInt();
		double tutar = armut * armutAdet + elma * elmaAdet + domates * domatesAdet + muz * muzAdet + patlican * patlicanAdet;
		System.out.println("Toplam Tutar : " + tutar);
	}

}