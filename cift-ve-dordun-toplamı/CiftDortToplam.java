import java.util.Scanner;

public class CiftDortToplam{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int sayi, toplam = 0;
		do {
			System.out.print("Bir sayi giriniz : ");
			sayi = scanner.nextInt();
			if((sayi % 2 == 0) && (sayi % 4 == 0)){
				toplam += sayi;
			}
		}while(sayi % 2 == 0);
		System.out.println("Girilen sayilardan cift ve 4'e tam bolunen sayilarin toplami : " + toplam);
	}
}