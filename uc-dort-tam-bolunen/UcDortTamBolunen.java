import java.util.Scanner;

public class UcDortTamBolunen {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayiyi Giriniz : ");
		int sayi = scanner.nextInt();

		int toplam = 0;
		int sayiAdet = 0;
		
		for(int i = 0; i < sayi; i++){
			if(i % 3 == 0 && i % 4 == 0 && i != 0){
				toplam += i;
				sayiAdet++;
			}
		}

		if(sayiAdet > 0){
			double ortalama = toplam / sayiAdet;
			System.out.println("0'dan " + sayi + "'e kadar olan sayilardan 3'e ve 4'e tam bolunenlerin ortalamasi : " + ortalama);
		}else{
			System.out.println("0'dan " + sayi + "'e kadar olan sayilardan 3'e ve 4'e tam bolunenlerin ortalamasi : 0");
		}
		
	}

}