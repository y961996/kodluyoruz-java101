import java.util.Scanner;

public class IkininKuvvetleri {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int sayi = scanner.nextInt();

		System.out.println("Girdiginiz sayi -> " + sayi + ", Bu sayidan kucuk 4'un kuvvetleri:");
		for(int i = 1; i <= sayi; i*=4){
			System.out.print(i + ", ");
		}
		System.out.println();

		System.out.println("Girdiginiz sayi -> " + sayi + ", Bu sayidan kucuk 5'in kuvvetleri:");
		for(int i = 1; i <= sayi; i*=5){
			System.out.print(i + ", ");
		}
	}

}