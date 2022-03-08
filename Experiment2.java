import java.util.Scanner;
class Frequency{
	int counter(String str,char ch) {
		int l =str.length();
		int count =0;
		for(int i=0;i<l;i++) {
			if(ch == str.charAt(i)) {
				count++;
			}
		}
		return count;
	}
}
public class Experiment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str=sc.nextLine();
		System.out.print("Enter the character to count : ");
	    char ch = sc.next().charAt(0);
		Frequency frequency = new Frequency();
		int count=frequency.counter(str, ch);
		System.out.println("The frequency of "+ch+" in "+str+" is : "+count);
		
		sc.close();
	}
}
