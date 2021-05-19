import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Yil Giriniz : ");
		int yil = scanner.nextInt();

		if(yil % 100 == 0){
			if(yil % 400 == 0){
				System.out.println(yil + " bir artik yildir !");
			}else{
				System.out.println(yil + " bir artik yil degildir !");
			}
			
		}else if(yil % 4 == 0){
			System.out.println(yil + " bir artik yildir !");
		}else{
			System.out.println(yil + " bir artik yil degildir !");
		}
	}

}