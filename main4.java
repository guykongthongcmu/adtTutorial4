//672115045 Virawit Kongthong ADT Tutorial 4

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        queueClass testQueue = new queueClass(5);
        Scanner input = new Scanner(System.in);

        boolean quit = false;
        while (quit != true) {
            System.out.println("Please input names: (Enter Quit to exit the program)");
            String userInput = input.nextLine();

            if ((userInput).toLowerCase().equals("quit")) {
                quit = true;
            } else {
                testQueue.enqueue(userInput);
                testQueue.printQueue();
                System.out.println();
            }
        }

        testQueue.dequeue();
        testQueue.printQueue();

    }
}
