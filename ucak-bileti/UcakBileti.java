import java.util.Scanner;

public class UcakBileti {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Mesafeyi yaziniz (KM) : ");
		int mesafe = scanner.nextInt();

		System.out.print("Yasinizi yaziniz : ");
		int yas = scanner.nextInt();

		System.out.print("Yolculuk tipinizi seciniz ");
		System.out.print("{1 => Tek Yon | 2 => Gidis Donus} : ");
		int tip = scanner.nextInt();

		if(mesafe < 0 || yas < 0 || (tip != 1 && tip != 2)){
			System.out.println("\nHatali veri girdiniz!");
		}else{
			double tutar = mesafe * 0.10;
			if(yas < 12){
				tutar = tutar - (tutar * 0.50);
			} else if(yas >= 12 && yas <= 24){
				tutar = tutar - (tutar * 0.10);
			} else if(yas > 65){
				tutar = tutar - (tutar * 0.30);
			}
			
			if(tip == 2){
				tutar = tutar - (tutar * 0.20);
				tutar *= 2;
			}
			System.out.println("\nToplam Tutar = " + tutar);
		}
	}

}