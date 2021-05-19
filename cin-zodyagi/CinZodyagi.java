import java.util.Scanner;

public class CinZodyagi {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Dogum Yilinizi Giriniz : ");
		int yil = scanner.nextInt();

		String burc = "";

		switch(yil % 12){
			case 0:
				burc = "Maymun";
				break;
			case 1:
				burc = "Horoz";
				break;
			case 2:
				burc = "Kopek";
				break;
			case 3:
				burc = "Domuz";
				break;
			case 4:
				burc = "Fare";
				break;
			case 5:
				burc = "Okuz";
				break;
			case 6:
				burc = "Kaplan";
				break;
			case 7:
				burc = "Tavsan";
				break;
			case 8:
				burc = "Ejderha";
				break;
			case 9:
				burc = "Yilan";
				break;
			case 10:
				burc = "At";
				break;
			case 11:
				burc = "Koyun";
				break;
			default:
				System.out.println("Bir hata olustu!");
		}

		System.out.println("Cin zodyagi burcunuz : " + burc);
	}

}