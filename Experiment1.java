
import java.util.Scanner;
class Palindrome{
	boolean checkPalindrome(String word) {
		int length=word.length();
		String revWord="";
		for(int i = length-1;i>=0;i--) {
			revWord+= word.charAt(i);
		}
		if(revWord.equalsIgnoreCase(word)) {
			return true;
		}
		return false;
	}
}
public class Experiment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word to check : ");
		String word = sc.next();
		Palindrome palindrome = new Palindrome();
		if(palindrome.checkPalindrome(word)) {
			System.out.println(word+" is a Palindrome word");
			
		}
		else {
			System.out.println(word+" is not a Palindrome word");
		}
		sc.close();
	}

}

//Program to check whether a given String/Word is Palindrome or Not
