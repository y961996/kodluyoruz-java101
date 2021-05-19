import java.util.Scanner;

public class TersUcgen {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Basamak sayisini giriniz : ");
		int basamak = scanner.nextInt();

		for(int i = 1; i <= basamak; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(" ");
			}
			for(int k = 0; k < (2 * basamak - i * 2) + 1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}