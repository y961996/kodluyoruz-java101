import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Yolu giriniz: ");
		int yol = scanner.nextInt();
		double tutar = 10 + (yol * 2.20);
		System.out.println("Odenecek tutar:" + (tutar < 20 ? 20.0 : tutar));
	}
}