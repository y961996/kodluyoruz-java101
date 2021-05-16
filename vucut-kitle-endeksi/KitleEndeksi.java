import java.util.Scanner;

public class KitleEndeksi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int kilo;
		double boy;
		System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz : ");
		boy = scanner.nextDouble();
		System.out.print("Lutfen kilonuzu giriniz : ");
		kilo = scanner.nextInt();
		System.out.println(boy + " " + kilo);
		double endeks = kilo / (boy * boy);
		System.out.println("Vucut kitle indeksiniz : " + endeks);
	}
}