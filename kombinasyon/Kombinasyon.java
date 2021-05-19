import java.util.Scanner;

public class Kombinasyon {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("N'i giriniz : ");
		int N = scanner.nextInt();

		System.out.print("r'yi giriniz : ");
		int r = scanner.nextInt();

		int N_perm = 1;
		for(int i = 1; i <= N; i++){
			N_perm *= i;
		}

		int r_perm = 1;
		for(int i = 1; i <= r; i++){
			r_perm *= i;
		}

		int N_minus_r_perm = 1;
		for(int i = 1; i <= N-r; i++){
			N_minus_r_perm *= i;
		}
		System.out.println("=> " + N_perm + ", " + r_perm + ", " + N_minus_r_perm);
		int kombinasyon = N_perm / (r_perm * N_minus_r_perm);
		System.out.println("C(" + N + "," + r + ") = " + kombinasyon);
	}

}