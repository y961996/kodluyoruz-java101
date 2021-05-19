import java.util.Scanner;

public class YildizlardanElmas {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int sayi = scanner.nextInt();

		for(int i = 1; i <= sayi; i++){
			for(int j = 1; j <= (sayi-i); j++){
				System.out.print(" ");
			}
			for(int k = 1; k <= (2*i)-1; k++){
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i = sayi-1; i > 0; i--){
			for(int j = sayi-i; j > 0; j--){
				System.out.print(" ");
			}
			for(int k = 1; k <= (2*i)-1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}