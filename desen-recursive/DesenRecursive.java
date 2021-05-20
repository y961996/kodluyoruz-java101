import java.util.Scanner;

public class DesenRecursive {

	public static int desen(int n, int t, int c){
		if(c < 0) return n;
		System.out.println(n);
		if(t > 0) return desen(n-5, t-5, c+1);
		else return desen(n+5, t, c-1);
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("N sayisi : ");
		int N = scanner.nextInt();
		desen(N, N, 0);
	}

}