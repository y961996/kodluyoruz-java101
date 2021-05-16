import java.util.Scanner;

public class DaireDilimAlan {

	public static void main(String[] args){
		double PI = 3.14;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Yaricapi yaziniz: ");
		int yaricap = scanner.nextInt();
		System.out.print("Merkez aci olcusunu yaziniz: ");
		int merkezOlcu = scanner.nextInt();
		System.out.println("Daire diliminin alani: " + (PI * (yaricap * yaricap) * merkezOlcu) / 360);
	}
}