
import java.util.LinkedList;
import java.util.Scanner;

public class DLL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		int choice;

		do {
			System.out.println("\n\nDoubly LinkedList Operations\n");
			System.out.println(
					"1. Add Data to First Position\n2. Add Data to Last Position\n3. Add Data to Particular Position\n4. Delete Data to First Position\n5. Delete Data to Last Position\n6. Delete Data at Particular Position\n7. Display List\n8. Exit");
			System.out.print("\nEnter Choice: ");
			choice = sc.nextInt();

			switch (choice) {

				case 1:
					System.out.print("Enter data: ");
					int data = sc.nextInt();
					list.addFirst(data);
					System.out.print(list);
					break;

				case 2:
					System.out.print("Enter data: ");
					int data1 = sc.nextInt();
					list.addLast(data1);
					System.out.print(list);
					break;

				case 3:
					System.out.print("Enter data: ");
					int dat = sc.nextInt();
					System.out.print("Enter position: ");
					int index = sc.nextInt();
					list.add(index, dat);
					System.out.print(list);
					break;

				case 4:
					list.removeFirst();
					System.out.print(list);
					break;

				case 5:
					list.removeLast();
					System.out.print(list);
					break;

				case 6:
					System.out.print("Enter position: ");
					int index1 = sc.nextInt();
					list.remove(index1);
					System.out.print(list);
					break;

				case 7:
					System.out.print(list);
					break;

				case 8:
					break;

				default:
					System.out.println("Invalid Option");

			}
		} while (choice != 8);

		sc.close();
	}

}
