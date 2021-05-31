import java.util.Arrays;

public class BLetter{

	public static void main(String[] args){
		String[][] b = new String[7][10];
		
		for(String[] row : b){
			Arrays.fill(row, " ");
		}

		for(int i = 0; i < b.length; i++){
			for(int j = 0; j < b[i].length; j++){
				if(j == 0 || j == b[i].length-1) b[i][j] = "*";
				if((i == 0 || i == b.length - 1) && (j % 3 == 0)) b[i][j] = "*";
				if(i == b.length / 2 && j % 3 == 0) b[i][j] = "*";
			}
		}

		for(String[] row : b){
			for(String col : row){
				System.out.print(col);
			}
			System.out.println();
		}
	}

}