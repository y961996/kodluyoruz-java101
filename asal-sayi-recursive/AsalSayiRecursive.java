import java.util.Scanner;

public class AsalSayiRecursive {

	public static boolean asal(int n, int t){
		if (n < 2) return false;
		if (t == 1) return true;
		return (n % t != 0) && asal(n, t-1);
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayi Giriniz : ");
		int sayi = scanner.nextInt();
		boolean result = asal(sayi, sayi/2);
		System.out.println(result ? (sayi + " sayisi ASALDIR !") : (sayi + " sayisi ASAL degildir !"));
	}

}