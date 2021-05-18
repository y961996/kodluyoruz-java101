import java.util.Scanner;

public class BurcBul {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dogdugunuz ayi sayi olarak giriniz (Ocak->1) : ");
		int ay = scanner.nextInt();
		System.out.print("Dogdugunuz gunu sayi olarak giriniz (22 {22-Ocak}) : ");
		int gun = scanner.nextInt();

		if(ay == 1){
			if(gun > 0 && gun < 32){
				if(gun < 22){
					System.out.println("Oglak Burcu");
				} else {
					System.out.println("Kova Burcu");
				}
			} else {
				System.out.println("Hatali gun girdiniz!");
			}
		} else if (ay == 2){
			if(gun > 0 && gun < 29){
				if(gun < 20){
					System.out.println("Kova Burcu");
				} else {
					System.out.println("Balik Burcu");
				}
			} else {
				System.out.println("Hatali gun girdiniz!");
			}
		} else if (ay == 3){
			if(gun > 0 && gun < 32){
				if(gun < 21){
					System.out.println("Balik Burcu");
				} else {
					System.out.println("Koc Burcu");
				}
			} else {
				System.out.println("Hatali gun girdiniz!");
			}
		} else if (ay == 4){
			if(gun > 0 && gun < 31){
				if(gun < 21){
					System.out.println("Koc Burcu");
				} else {
					System.out.println("Boga Burcu");
				}
			} else {
				System.out.println("Hatali gun girdiniz!");
			}
		} else if (ay == 5){
			if(gun > 0 && gun < 32){
				if(gun < 22){
					System.out.println("Boga Burcu");
				} else {
					System.out.println("Ikizler Burcu");
				}
			} else {
				System.out.println("Hatali gun girdiniz!");
			}
		} else if (ay == 6){
			if(gun > 0 && gun < 31){
				if(gun < 23){
					System.out.println("Ikizler Burcu");
				} else {
					System.out.println("Yengec Burcu");
				}
			} else {
				System.out.println("Hatali gun girdiniz!");
			}
		} else if (ay == 7){
			if(gun > 0 && gun < 32){
				if(gun < 23){
					System.out.println("Yengec Burcu");
				} else {
					System.out.println("Aslan Burcu");
				}
			} else {
				System.out.println("Hatali gun girdiniz!");
			}
		} else if (ay == 8){
			if(gun > 0 && gun < 32){
				if(gun < 23){
					System.out.println("Aslan Burcu");
				} else {
					System.out.println("Basak Burcu");
				}
			} else {
				System.out.println("Hatali gun girdiniz!");
			}
		} else if (ay == 9){
			if(gun > 0 && gun < 31){
				if(gun < 23){
					System.out.println("Basak burcu");
				} else {
					System.out.println("Terazi Burcu");
				}
			} else {
				System.out.println("Hatali gun girdiniz!");
			}
		} else if (ay == 10){
			if(gun > 0 && gun < 32){
				if(gun < 23){
					System.out.println("Terazi Burcu");
				} else {
					System.out.println("Akrep Burcu");
				}
			} else {
				System.out.println("Hatali gun girdiniz!");
			}
		} else if (ay == 11){
			if(gun > 0 && gun < 31){
				if(gun < 22){
					System.out.println("Akrep Burcu");
				} else {
					System.out.println("Yay Burcu");
				}
			} else {
				System.out.println("Hatali gun girdiniz!");
			}
		} else if (ay == 12){
			if(gun > 0 && gun < 32){
				if(gun < 22){
					System.out.println("Yay Burcu");
				} else {
					System.out.println("Oglak Burcu");
				}
			} else {
				System.out.println("Hatali gun girdiniz!");
			}
		} else{
			System.out.println("Hatali bir ay girdiniz!");
		}
	}

}