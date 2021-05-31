import java.util.Scanner;
import java.util.Arrays;

public class DiziElemanlariSiralama{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dizinin boyutu : ");
		int n = scanner.nextInt();
		int[] dizi = new int[n];
		System.out.println("Dizinin elemanlarini giriniz : ");
		for(int i = 0; i < n; i++){
			System.out.print((i+1) + ". Elemani : ");
			int currentInput = scanner.nextInt();
			dizi[i] = currentInput;
		}

		for(int i = 0; i < n - 1; i++){
			for(int j = i+1; j < n; j++){
				if(dizi[i] > dizi[j]){
					int temp = dizi[i];
					dizi[i] = dizi[j];
					dizi[j] = temp;
				}
			}
		}

		System.out.print("Siralama: " + Arrays.toString(dizi));
	}
}