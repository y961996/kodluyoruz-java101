import java.util.Scanner;

public class HesapMakinesi {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number1, number2, operator;
		
		System.out.print("Ilk sayiyi giriniz : ");
		number1 = scanner.nextInt();

		System.out.print("Ikinci sayiyi giriniz : ");
		number2 = scanner.nextInt();

		System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
		System.out.print("Seciniz : ");
		operator = scanner.nextInt();
		
		switch(operator){
			case 1:
				System.out.println("Toplam : " + (number1 + number2));
				break;
			case 2:
				System.out.println("Cikarma : " + (number1 - number2));
				break;
			case 3:
				System.out.println("Carpma : " + (number1 * number2));
				break;
			case 4:
				if(number2 != 0){
					System.out.println("Bolme : " + (number1 / number2));
				} else {
					System.out.println("Bir sayi 0'a bolunemez!");
				}
				
				break;
			default:
				System.out.println("Yanlis secim yaptiniz.");
		}
	}
}