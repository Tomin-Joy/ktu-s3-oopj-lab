/*******************************************************************
 * File  : Experiment
 * Author: Name
 * Date  : DD/MM/YYYY
 *******************************************************************/
import java.util.*;
public class Experiment17{
	static void swap(String[] arr, int i, int j){
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static int partition(String[] arr, int low, int high){
		String pivot = arr[high]; 
		int i = (low - 1); 
		for(int j = low; j <= high - 1; j++){
			if ((arr[j].compareTo(pivot))<0) {
				i++; 
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}
	static void quickSort(String[] arr, int low, int high){
		if (low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}
	static void printArray(String[] arr, int size){
		for(int i = 0; i <= size; i++) {
			if(i==size || i==0) {
				System.out.print(arr[i]);
			}
			else {
				System.out.print(arr[i] + " ,");
			}
		}
	}
	public static void main(String[] args){
  
		Scanner sc=new Scanner(System.in);
		String[] arr=new String [50];
		System.out.print("Enter the number of names: ");
		int n=sc.nextInt();
		System.out.println("Enter the names : ");
		for(int i=0;i<=n;i++) {
			arr[i]=sc.nextLine();
		}
		quickSort(arr,0,n);
		System.out.println("\nSorted array is:");
		printArray(arr, n);
		sc.close();
	}
}