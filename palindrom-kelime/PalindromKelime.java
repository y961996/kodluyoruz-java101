public class PalindromKelime{

	public static void main(String[] args){
		String[] kelimeler = {"araba", "ara", "kavak", "test", "foof", "aa", "d", "abcdedcba", "ztyuuytz"};

		for(int i = 0; i < kelimeler.length; i++){
			String currentStr = kelimeler[i] + " => ";
			if(isPalindrome(kelimeler[i])) currentStr += "Palindrom.";
			else currentStr += "Palindrom degil.";
			System.out.println(currentStr);
		}
	}

	public static boolean isPalindrome(String s){
		if(s.length() <= 1) return true;
		if(s.length() == 2) return s.charAt(0) == s.charAt(1);
		return (s.charAt(0) == s.charAt(s.length()-1)) && isPalindrome(s.substring(1, s.length()-1));
	}
}