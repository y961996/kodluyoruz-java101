import java.util.Scanner;

public class UsluSayi {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ussu alinacak sayiyi giriniz : ");
		int sayi = scanner.nextInt();

		System.out.print("Us degerini giriniz : ");
		int us = scanner.nextInt();
		
		int sonuc = 1;

		for(int i = 0; i < us; i++){
			sonuc *= sayi;
		}

		System.out.println("\nUssu alinan sayi : " + sayi);
		System.out.println("Us degeri : " + us);
		System.out.println("Sonuc : " + sonuc);
	}

}