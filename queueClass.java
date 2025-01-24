public class queueClass {
    public static void main(String[] args) {
        
    }
    private static int frontPointer;
    private static int endPointer;
    private static int capacity;
    public static String[] queueArray;

    public queueClass(int capacityF) {
        frontPointer = 0;
        endPointer = 0;
        capacity = capacityF;
        queueArray = new String[capacity];
    }

    public static void initializeQueue() {
        for (int i = 0; i < queueArray.length; i++) {
            queueArray[i] = null;
        }
    }

    public void enqueue(String value) {
        if (isFull()) {
            System.out.println("The queue is full can not enqueue");
        } else {
            queueArray[endPointer++] = value;
            System.out.println(value + " has been enqueued");
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty can not dequeue");
        } else {
            String elementDequeue = "";
            elementDequeue = queueArray[frontPointer];
            System.out.println(elementDequeue + " has been dequeued from the queue");
            frontPointer++;
        }
    }

    public int size() {
        int result = endPointer - frontPointer;
        return result;
    }

    public static boolean isFull() {
        return endPointer == capacity;
    }

    public static boolean isEmpty() {
        return frontPointer == endPointer;
    }

    public void printQueue() {
        for (int i = frontPointer; i < capacity; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.printf("%3s" , "[first = " + frontPointer + ", rear = " + endPointer + ", length = " + size() + "]");
        System.out.println();
    }
}
