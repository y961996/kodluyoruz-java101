import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ilk sayiyi giriniz : ");
		int n1 = scanner.nextInt();
		System.out.print("Ikinici sayiyi giriniz : ");
		int n2 = scanner.nextInt();
		
		int small = n1 <= n2 ? n1 : n2;
		int big = n1 >= n2 ? n1 : n2;		

		int ebob = 0;
		int ekok = 0;

		// EBOB		
		int i = small;
		while(i > 0){
			if(big % i == 0 && small % i == 0){
				ebob = i;
				break;
			}
			i--;
		}

		// EKOK		
		int j = 1;
		while(j <= (small * big)){
			if(j % big == 0 && j % small == 0){
				ekok = j;
				break;
			}
			j++;
		}

		System.out.println(big + " ve " + small + " sayilarinin ebobu : " + ebob + " | ekoku : " + ekok + ".");
	}

}