import java.util.Scanner;

public class UcgenAlan {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ilk kenar uzunlugunu girin: ");
		double kenar_1 = scanner.nextDouble();
		System.out.print("Ikinci kenar uzunlugunu girin: ");
		double kenar_2 = scanner.nextDouble();
		System.out.print("Ucuncu kenar uzunlugunu girin: ");
		double kenar_3 = scanner.nextDouble();
		double cevre = (kenar_1 + kenar_2 + kenar_3) / 2.0;
		double alan = Math.sqrt(cevre * (cevre - kenar_1) * (cevre - kenar_2) * (cevre - kenar_3));
		System.out.println("Ucgenin alani: " + alan);
	}
}