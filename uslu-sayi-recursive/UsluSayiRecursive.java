import java.util.Scanner;

public class UsluSayiRecursive {

	public static int us(int a, int b){
		if(b == 0) return 1;
		return a * us(a, b-1);
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Taban degerini giriniz : ");
		int taban = scanner.nextInt();
		System.out.print("Us degerini giriniz : ");
		int usDeger = scanner.nextInt();
		int result = us(taban, usDeger);		
		System.out.println("Sonuc : " + result);
	}

}