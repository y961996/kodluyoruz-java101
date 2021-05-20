import java.util.Scanner;

public class PalindromSayi{

	public static boolean isNumPalindrome(int num, int len){
		for(int i = 0; i < len / 2; i++){
			int currentTail = num;
			for(int j = 0; j < i; j++){
				currentTail /= 10;
			}
			int digitTail = currentTail % 10;

			int currentHead = num;
			for(int k = 0; k < (len-i-1); k++){
				currentHead /= 10;
			}
			//System.out.println(currentHead + " | " + currentTail);
			int digitHead = currentHead % 10;

			//System.out.println(digitHead + ", " + digitTail);
			if(digitHead != digitTail){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int sayi = scanner.nextInt();

		boolean val = isNumPalindrome(sayi, String.valueOf(sayi).length());
		System.out.println(val ? (sayi + " palindrom bir sayidir.") : (sayi + " palindrom bir sayi degildir."));
	}
}