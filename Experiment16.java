import java.util.Scanner;
import java.util.StringTokenizer;

public class Experiment16 {
    public static void main(String[] args) {
        System.out.print("Enter the coma separated integer string : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer s = new StringTokenizer(str,",");
        while(s.hasMoreTokens()){
            System.out.println(s.nextToken());
        }
        sc.close();
    }
}
