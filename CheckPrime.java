import java.util.Scanner;
class PrimeChecker{
	boolean isPrime(int item) {
		for(int i = 2;i<=item/2;i++) {
			if(item%i == 0) {
				
				return false;
			}
		}
		return true;
	}
}

public class CheckPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrimeChecker p = new PrimeChecker();
		System.out.print("enter the limit : ");
		int n = sc.nextInt();
		int count=1;
		int i=2;
		while(count<=n) {
			
			if(p.isPrime(i)) {
				System.out.print(i+" ");
				count++;
			}
			i++;
			
		}
		sc.close();
		
		
		
	}

}
