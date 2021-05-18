import java.util.Scanner;

public class SinifGecme {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int mat, fizik, turkce, kimya, muzik;
		System.out.print("Matematik notunuz : ");
		mat = scanner.nextInt();
		System.out.print("Fizik notunuz : ");
		fizik = scanner.nextInt();
		System.out.print("Turkce notunuz :");
		turkce = scanner.nextInt();
		System.out.print("Kimya notunuz : ");
		kimya = scanner.nextInt();
		System.out.print("Muzik notunuz : ");
		muzik = scanner.nextInt();

		double average = 0.0;
		int count = 0;
		if(mat >= 0 && mat <= 100){
			average += mat;
			count++;
		}
		if(fizik >= 0 && fizik <= 100){
			average += fizik;
			count++;
		}
		if(turkce >= 0 && turkce <= 100){
			average += turkce;
			count++;
		}
		if(kimya >= 0 && kimya <= 100){
			average += kimya;
			count++;
		}
		if(muzik >= 0 && muzik <= 100){
			average += muzik;
			count++;
		}
		average /= count;
		if(average <= 55){
			System.out.println("Sinifta kaldiniz. :( Ortalamaniz : " + average);
		} else{
			System.out.println("Sinifi gectiniz. :) Ortalamaniz : " + average);
		}
	}

}