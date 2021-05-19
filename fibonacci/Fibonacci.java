import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int sayi = scanner.nextInt();

		System.out.print("0 1 ");

		int prev = 0;
		int current = 1;
		for(int i = 0; i < sayi-1; i++){
			System.out.print((prev + current) + " ");
			int temp = current;
			current = prev + current;
			prev = temp;
		}
	}

}