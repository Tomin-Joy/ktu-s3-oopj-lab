package lab;
import java.util.Scanner;
class Matrix{
	Scanner sc = new Scanner(System.in);
	void readMatrix(int[][] A,int m,int n){
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("Enter element["+i+"]["+j+"] : ");
				A[i][j]=sc.nextInt();
			}
		}
	}
	void printMatrix(int [][] A,int m,int n) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(A[i][j]+"  ");
			}
			System.out.println();
		}
	}
	void product(int[][] A,int [][] B,int[][] res,int m,int n,int q) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<q;j++) {
				res[i][j]=0;
				for(int k= 0;k<n;k++) {
					res[i][j]+=A[i][k]+B[k][j];
				}
			}
		}
	}
}
public class Experiment3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n,p,q;
		System.out.print("Enter the number of rows of first matrix : ");
		m=sc.nextInt();
		System.out.print("Enter the number of columns of first matrix : ");
		n=sc.nextInt();
		System.out.print("Enter the number of rows of second matrix : ");
		p=sc.nextInt();
		System.out.print("Enter the number of columns of second matrix : ");
		q=sc.nextInt();
		if(n==p) {
			Matrix matrix = new Matrix();
			int[][] matrix1 = new int[m][n];
			int[][] matrix2 = new int[p][q];
			int[][] product = new int[m][q];
			System.out.println("Enter first matrix :");
			matrix.readMatrix(matrix1, m, n);
			System.out.println("The matrix is ;");
			matrix.printMatrix(matrix1, m, n);
			System.out.println("Enter second matrix :");
			matrix.readMatrix(matrix2, p, q);
			System.out.println("The matrix is :");
			matrix.printMatrix(matrix2, p, q);
			matrix.product(matrix1, matrix2, product, m, n, q);
			System.out.println("The product matrix is : ");
			matrix.printMatrix(product, m, q);
			
			
		}
		else {
			System.out.println("Invalid order for matrix multiplication");
		}
		sc.close();
	}

}
