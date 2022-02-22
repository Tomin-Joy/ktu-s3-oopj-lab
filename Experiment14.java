import java.util.Scanner;

public class Experiment14 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the numerator : ");
            Double num = sc.nextDouble();
            System.out.print("Enter the denominator : ");
            Double den = sc.nextDouble();
            Division d = new Division();
            d.div(num, den);
            sc.close();
        } catch (Exception e) {
            System.out.println("Syntax Error");
        }finally{
            System.out.println("\nProgram terminating");
        }
    }
}
class Division{
    void div(Double num, Double den) throws ArithmeticException{
        if(den == 0){
            throw new ArithmeticException();
        }
        System.out.println("The result is : "+ num/den);
    }
}