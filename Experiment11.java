import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/*
 * file   : Experiment11
 * Date   : 28-01-2022
 * Author : Tomin Joy
 * Desc   : A program to implement multi threading
 */

class RandomThread extends Thread {
    Queue<Integer> sharedValue = new LinkedList<Integer>();

    RandomThread(Queue<Integer> sharedValue) {
        this.sharedValue = sharedValue;
    }

    public void run() {
        Random random = new Random();
        while (true) {
            synchronized (sharedValue) {
                while(sharedValue.size()>=1){
                   try{
                    sharedValue.wait();
                   }
                   catch(InterruptedException e){
                    e.printStackTrace();
                   }
                }
                int randomInteger = random.nextInt(1000);
                sharedValue.add(randomInteger);
                System.out.println("Random Integer generated : " + randomInteger);
                sharedValue.notifyAll();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }
    }
}

class SquareThread extends Thread {
    Queue<Integer> sharedValue = new LinkedList<Integer>();
    int x;

    SquareThread(Queue<Integer> sharedValue) {
        this.sharedValue = sharedValue;
        
    }

    public void run() {
        while (true) {
            synchronized (sharedValue) {
                while (sharedValue.size() < 1 || sharedValue.element() % 2 == 1) {
                    try {
                        sharedValue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                x = this.sharedValue.remove();

                int sqr = x * x;
                System.out.println("Square of " + x + " = " + sqr);
                sharedValue.notifyAll();
            }
        }
    }
}

class CubeThread extends Thread {
    Queue<Integer> sharedValue = new LinkedList<Integer>();
    int x;

    CubeThread(Queue<Integer> sharedValue) {
        this.sharedValue = sharedValue;
        
    }

    public void run() {
        while (true) {
            synchronized (sharedValue) {
                while (sharedValue.size() < 1 || sharedValue.element() % 2 == 0) {
                    try {
                        sharedValue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                x = this.sharedValue.remove();
                int t = x * x * x;
                System.out.println("Cube of " + x + " = " + t);
                sharedValue.notifyAll();
            }
        }
    }
}

public class Experiment11 {
    public static void main(String[] args) {
        Queue<Integer> sharedValue = new LinkedList<Integer>();
        RandomThread r = new RandomThread(sharedValue);
        r.start();
        CubeThread c = new CubeThread(sharedValue);
        SquareThread s = new SquareThread(sharedValue);
        s.start();
        c.start();

    }
}
