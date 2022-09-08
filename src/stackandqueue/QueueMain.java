package stackandqueue;

public class QueueMain {
    public static void main(String[] args) {
        CustomQueue customQueue = new CustomQueue();
        customQueue.insert(5);
        customQueue.insert(3);
        customQueue.insert(4);
        customQueue.insert(2);
        customQueue.insert(15);

        customQueue.display();

    }
}
