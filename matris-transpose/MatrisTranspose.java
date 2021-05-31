public class MatrisTranspose{

	public static void main(String[] args){
		int[][] matris = {
			{2, 3, 4},
			{5, 6, 4}
		};

		int[][] matris2 = {
			{2, 3},
			{5, 6},
			{7, 2}
		};

		int[][] transpose1 = matrisTransposeHesapla(matris);
		int[][] transpose2 = matrisTransposeHesapla(matris2);

		System.out.println("Matris : ");
		printMatris(matris);
		System.out.println("Transpoze : ");
		printMatris(transpose1);

		System.out.println("=========================");

		System.out.println("Matris : ");
		printMatris(matris2);
		System.out.println("Transpoze : ");
		printMatris(transpose2);
	}

	public static int[][] matrisTransposeHesapla(int[][] orijinalMatris){
		int[][] transpose = new int[orijinalMatris[0].length][orijinalMatris.length];
		for(int i = 0; i < transpose.length; i++){
			for(int j = 0; j < transpose[i].length; j++){
				transpose[i][j] = orijinalMatris[j][i];
			}
		}
		return transpose;
	}

	public static void printMatris(int[][] mat){
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[i].length; j++){
				System.out.print(mat[i][j] + "   ");
			}
			System.out.println();
		}
		System.out.println();
	}
}