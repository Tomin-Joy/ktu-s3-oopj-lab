import java.util.Scanner;
public class palindrome{
    static boolean checkPalindrome(String s){
        int n = s.length();
        int i=0;
        int j=n-1;
        while(i!=j || i-j == 1 || j-i == 1){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word to check : ");
        String word = sc.next();
        boolean flag = checkPalindrome(word);
        if(flag){
            System.out.println(word + "is palindrome");
        }
        else{
            System.out.println(word + "is not palindome");
        }
    }
}