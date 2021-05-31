import java.util.Arrays;

public class DiziElemanlarinFrekansi{

	public static void main(String[] args){
		int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
		System.out.println("Dizi : " + Arrays.toString(dizi));
		int maxValue = Arrays.stream(dizi).max().getAsInt();
		int[] tekrarlar = new int[maxValue+1];
		Arrays.fill(tekrarlar, 0);

		for(int i = 0; i < dizi.length; i++){
			tekrarlar[dizi[i]]++;
		}

		System.out.println("Tekrar Sayilari");
		for(int i = 0; i < maxValue+1; i++){
			if(tekrarlar[i] == 0) continue;
			else System.out.print(i + " sayisi " + tekrarlar[i] + " kere tekrar edildi.\n");
		}
	}
}