import java.util.Scanner;

public class Kdv {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the money amount: ");
		double money = scanner.nextDouble();
		
		if(money >= 0 && money <= 1000){
			System.out.println("KDV'siz fiyat: " + money);
			System.out.println("KDV'li fiyat: " + (money + (money * 18/100)));
			System.out.println("KDV tutari: " + (money * 18 / 100));
		} else if(money > 1000) {
			System.out.println("KDV'siz fiyat: " + money);
			System.out.println("KDV'li fiyat: " + (money + (money * 8/100)));
			System.out.println("KDV tutari: " + (money * 8 / 100));
		}
	}

}