import java.util.Scanner;

public class KullaniciGirisi {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String username, password;
		System.out.print("Kullanici Adiniz : ");
		username = scanner.nextLine();
		System.out.print("Sifreniz : ");
		password = scanner.nextLine();
		
		if(username.equals("admin") && password.equals("12345")){
			System.out.println("Giris yaptiniz.");
		} else{
			System.out.println("Kullanici adi ya da sifre yanlis. Sifrenizi sifirlamak istermisiniz ?");
			System.out.print("1-Evet \\ 2-Hayir : ");
			int option = scanner.nextInt();
			if(option==1){
				String newPass;
				System.out.print("Yeni sifreyi giriniz : ");
				scanner.nextLine();
				newPass = scanner.nextLine();
				if(newPass.equals("12345")){
					System.out.println("Sifre olusturulamadi lutfen baska sifre giriniz!");
				}else{
					System.out.println("Sifre olusturuldu.");
				}
			}
		}
	}
}