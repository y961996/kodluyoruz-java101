import java.util.Scanner;

public class HavaSicakligi {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int sicaklik;
		System.out.print("Sicaklik Giriniz : ");
		sicaklik = scanner.nextInt();
		
		if(sicaklik < 5){
			System.out.println("Kayak yapabilirsizin.");
		}
		if(sicaklik >= 5 && sicaklik <= 15){
			System.out.println("Sinemaya gidebilirsiniz.");
		}
		if(sicaklik >= 10 && sicaklik <= 25){
			System.out.println("Piknige gidebilirsiniz.");
		}
		if(sicaklik > 25){
			System.out.println("Yuzmeye gidebilirsiniz.");
		}
	}

}