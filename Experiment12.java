import java.util.Scanner;
/*
 * file   : Experiment12
 * Date   : 28-01-2022
 * Author : Tomin Joy
 * Desc   : A program to implement syncronization
 */
public class Experiment12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Table you want to run by thread1 : ");
        int x1 = sc.nextInt();
        System.out.println("Enter the Table you want to run by thread2 : ");
        int x2 = sc.nextInt();
        System.out.println("Enter the Table you want to run by thread3 : ");
        int x3 = sc.nextInt();
        Table t = new Table();
        Thread t1 = new Thread(new Thread1(x1,t));
        t1.start();
        Thread t2 = new Thread(new Thread1(x2,t));
        t2.start();
        Thread t3 = new Thread(new Thread1(x3,t));
        t3.start();
        sc.close();
    }

}

class Table {
    synchronized void printTable(int x) {
        System.out.println(x+"'s Table started");
        for (int i = 1; i <= 5; i++) {
            System.out.println(x + " * " + i + " = " + i * x);
        }
        System.out.println(x+"'s Table finished\n");
    }
}

class Thread1 implements Runnable {
    int x;
    Table t;
    Thread1(int x,Table t) {
        this.t = t;
        this.x = x;
    }

    public void run() {
        t.printTable(x);
    }
}
