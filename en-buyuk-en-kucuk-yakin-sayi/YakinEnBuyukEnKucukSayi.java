import java.util.Scanner;
import java.util.Arrays;

public class YakinEnBuyukEnKucukSayi{

	public static void main(String[] args){
		int[] dizi = {56, 34, 72, -1, -196, -38, 99, 68, -69};

		Arrays.sort(dizi);
		System.out.println("Dizi => " + Arrays.toString(dizi));

		int kucuk = dizi[0];
		int buyuk = dizi[dizi.length - 1];

		Scanner scanner = new Scanner(System.in);		
		System.out.print("Girilen sayi: ");
		int n = scanner.nextInt();

		for(int i = 0; i < dizi.length; i++){
			if(n > dizi[i]) kucuk = dizi[i];
			if(n < dizi[i]){
				buyuk = dizi[i];
				break;
			}
		}

		System.out.println("Girilen sayidan kucuk en yakin sayi : " + kucuk);
		System.out.println("Girilen sayidan buyuk en yakin sayi : " + buyuk);
	}

}