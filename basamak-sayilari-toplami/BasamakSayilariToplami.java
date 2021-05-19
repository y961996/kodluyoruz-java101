import java.util.Scanner;

public class BasamakSayilariToplami {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int sayi = scanner.nextInt();
		int baslangicSayi = sayi;

		int toplam = 0;
		int kalan = 0;
		do{
			kalan = sayi % 10;
			toplam += kalan;
			sayi = sayi / 10;
		}while(sayi != 0);
		System.out.println(baslangicSayi + " sayisinin basamaklari toplami : " + toplam);
	}

}