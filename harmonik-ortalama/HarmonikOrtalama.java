import java.util.Arrays;

public class HarmonikOrtalama {
	
	public static void main(String[] args){
		int[] numbers = {1, 2, 3, 4, 5};
		int[] numbers2 = {2, 3, 4};

		double result = harmonikOrtalamaHesapla(numbers);
		double result2 = harmonikOrtalamaHesapla(numbers2);
		
		System.out.println(Arrays.toString(numbers) + " dizisinin harmonik ortalamasi: " + result);
		System.out.println(Arrays.toString(numbers2) + " dizisinin harmonik ortalamasi: " + result2);
	}

	public static double harmonikOrtalamaHesapla(int[] dizi){
		int n = dizi.length;
		double sum = 0;
		for(int i = 0; i < n; i++){
			sum += 1.0 / dizi[i];
		}
		return n / sum;
	}
}