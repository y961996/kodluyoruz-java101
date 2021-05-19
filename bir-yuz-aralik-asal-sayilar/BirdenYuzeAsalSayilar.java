public class BirdenYuzeAsalSayilar {

	public static void main(String[] args){
		boolean asal = true;
		System.out.print("2 ");
		for(int i = 3; i <= 100; i++){
			for(int j = 2; j < i; j++){
				if(i % j == 0){
					asal = false;
				}
			}
			if(asal){
				System.out.print(i + " ");
			}
			asal = true;
		}
	}

}