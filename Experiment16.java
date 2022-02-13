import java.util.*;

public class Experiment16 {
    public static void main(String[] args) {
        System.out.print("Enter the coma separated integer string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer s = new StringTokenizer(str,",");
        int sum=0;
        while(s.hasMoreTokens()){
            int i = Integer.parseInt(s.nextToken());
            System.out.println(i);
            sum+=i;
        }
        System.out.println("The sum is : "+sum);
        sc.close();
    }
}
