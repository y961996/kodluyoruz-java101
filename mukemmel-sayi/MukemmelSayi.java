import java.util.Scanner;

public class MukemmelSayi {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int sayi = scanner.nextInt();

		int toplam = 0;
		int counter = sayi-1;
		while(counter > 0){
			if(sayi % counter == 0){
				toplam += counter;
			}
			counter--;
		}

		if(sayi == toplam){
			System.out.println(sayi + " Mukemmel sayidir.");
		}else{
			System.out.println(sayi + " Mukemmel sayi degildir.");
		}
		
	}

}