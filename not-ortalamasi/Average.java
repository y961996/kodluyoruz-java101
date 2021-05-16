import java.util.Scanner;

public class Average {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int fiz, kim, turk, tar, muz;
		System.out.print("Fizik notu:");
		fiz = scanner.nextInt();

		System.out.print("Kimya notu:");
		kim = scanner.nextInt();

		System.out.print("Turkce notu:");
		turk = scanner.nextInt();

		System.out.print("Tarih notu:");
		tar = scanner.nextInt();

		System.out.print("Muzik notu:");
		muz = scanner.nextInt();

		double average = (fiz+kim+turk+tar+muz) / 5.0;
		System.out.println("Ortalama: " + average);
		System.out.println(average > 60 ? "Sinifi Gecti" : "Sinifta Kaldi");
	}

}