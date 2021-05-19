import java.util.Scanner;

public class FindMinMax {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kac tane sayi giriceksiniz : ");
		int N = scanner.nextInt();
		int smallest = Integer.MAX_VALUE;
		int biggest = Integer.MIN_VALUE;
		
		for(int i = 0; i < N; i++){
			System.out.print((i+1) + ". sayiyi giriniz : ");
			int current = scanner.nextInt();
			if(current < smallest){
				smallest = current;
			}
			if(current > biggest){
				biggest = current;
			}
		}

		System.out.println("En buyuk sayi : " + biggest);
		System.out.println("En kucuk sayi : " + smallest);
	}

}