import java.util.Scanner;

public class FibonacciRecursive {

	public static int fibonacci(int n){
		if(n==1 || n==2) return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int sayi = scanner.nextInt();
		System.out.println("Fibonacci serisinin " + sayi + ". elemani : " + fibonacci(sayi));
	}

}