import java.util.Scanner;

public class HarmonikSeri {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int n = scanner.nextInt();

		double harmonik = 0.0;
		for(int i = 1; i <= n; i++){
			harmonik += (1.0 / i);
		}
		System.out.println(n + " sayisinin harmonigi : " + harmonik);
	}

}