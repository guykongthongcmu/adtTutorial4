// 672115045 Virawit Kongthong ADT Tutorial 4

public class main4 {
    public static void main(String[] args) {
        queueClass testQueue = new queueClass(5);

        testQueue.enqueue("John");
        testQueue.printQueue();
        System.out.println();

        testQueue.enqueue("Man");
        testQueue.printQueue();
        System.out.println();

        testQueue.enqueue("Pree");
        testQueue.printQueue();
        System.out.println();

        testQueue.dequeue();
        testQueue.printQueue();

    }
}
