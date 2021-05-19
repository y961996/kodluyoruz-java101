import java.util.Scanner;

public class Atm {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String username, password;
		int right = 3;
		int balance = 1500;
		int select;
		while(right > 0){
			System.out.print("Kullanici Adiniz : ");
			username = scanner.nextLine();
			System.out.print("Parolaniz : ");
			password = scanner.nextLine();

			if(username.equals("admin") && password.equals("12345")){
				System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz!");
				do{
					System.out.println("\n1-Para yatirma\n2-Para Cekme\n3-Bakiye Sorgula\n4-Cikis Yap\n");
					select = scanner.nextInt();
					switch(select){
						case 1:
							System.out.print("Para miktari : ");
							int priceD = scanner.nextInt();
							balance += priceD;
							break;
						case 2:
							System.out.print("Para miktari : ");
							int priceW = scanner.nextInt();
							if(priceW > balance){
								System.out.println("Bakiye yetersiz.");
							}else{
								balance -= priceW;
							}
							break;
						case 3:
							System.out.println("Bakiyeniz : " + balance);
							break;
					}
				}while(select != 4);
				System.out.println("Tekrar gorusmek uzere.");
				break;
			}else{
				right--;
				System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz.");
				if(right == 0){
					System.out.println("Hesabiniz bloke olmustur lutfen banka ile iletisime geciniz.");
				}else{
					System.out.println("Kalan Hakkiniz : " + right);
				}
			}
		}
	}

}