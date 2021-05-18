import java.util.Scanner;

public class KucuktenBuyuge {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x, y, z;

		System.out.print("1. sayiyi giriniz : ");
		x = scanner.nextInt();

		System.out.print("2. sayiyi giriniz : ");
		y = scanner.nextInt();

		System.out.print("3. sayiyi giriniz : ");
		z = scanner.nextInt();

		System.out.println("x : " + x + ", y : " + y + ", z : " + z);

		if((x < y) && (x < z)){
			if(y < z){
				System.out.println("x < y < z");
			}else if(z < y){
				System.out.println("x < z < y");
			}else {
				System.out.println("Sayilardan bazilari birbirine esit.");
			}
		}else if((y < x) && (y < z)){
			if(x < z){
				System.out.println("y < x < z");
			}else if(z < x){
				System.out.println("y < z < x");
			}else {
				System.out.println("Sayilardan bazilari birbirine esit.");
			}
		}else if((z < x) && (z < y)){
			if(x < y){
				System.out.println("z < x < y");
			}else if(y < x){
				System.out.println("z < y < x");
			}else {
				System.out.println("Sayilardan bazilari birbirine esit.");
			}
		}else{
			System.out.println("Sayilardan bazilari esit.");
		}
	}

}