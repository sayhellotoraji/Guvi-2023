package Sample_Tasks;

public class OddOrEvenThreads {

    int count = 1;

    static int N;

    public void printOddNumber() {
        synchronized (this) {
            while (count < N) {
                while (count % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Thread 1 - " + count);
                count++;
                notify();
            }
        }
    }

    public void printEvenNumber() {
        synchronized (this) {
            while (count < N) {
                while (count % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Thread 2 - " + count);
                count++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        N = 10;
        OddOrEvenThreads obj = new OddOrEvenThreads();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                obj.printEvenNumber();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                obj.printOddNumber();
            }
        });
        t1.start();
        t2.start();
    }
}