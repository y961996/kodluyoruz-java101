import java.util.Arrays;
import java.util.stream.IntStream;

public class TekrarEdilenSayilar{

	public static void main(String[] args){
		int[] dizi = {72, 72, 1, 100, 123, 100, 12, 734, 23, 12, 36, 36, -34, 36, -34, -10, 10, -10};
		int[] bulunanlar = new int[dizi.length];
		int count = 0;
		for(int i = 0; i < dizi.length - 1; i++){
			for(int j = i+1; j < dizi.length; j++){
				int valueSearching = dizi[i];
				if(IntStream.of(bulunanlar).anyMatch(x -> x == valueSearching)) continue;
				if(valueSearching == dizi[j]){
					bulunanlar[count++] = valueSearching;
				}
			}
		}

		System.out.println("Orijinal dizi => " + Arrays.toString(dizi));
		System.out.print("Tekrar eden sayi dizisi => [");
		for(int i = 0; i < count; i++){
			System.out.print(bulunanlar[i]);
			if(i < count - 1) System.out.print(", ");
		}
		System.out.println("]");
	}

}