package lesson9.problem1;

public class Main {
    static void main() {
        ArrayQueueImpl circular = new ArrayQueueImpl(5);
        circular.enqueue(10);
        circular.enqueue(20);
        circular.enqueue(30);
        System.out.println(circular);
        System.out.println(circular.peek());
        System.out.println(circular);
        System.out.println(circular.dequeue());
        System.out.println(circular.dequeue());
        System.out.println(circular.dequeue());
        System.out.println(circular.dequeue());
        System.out.println(circular);
        circular.enqueue(40);
        circular.enqueue(50);
        circular.enqueue(60);
        System.out.println(circular);
        circular.enqueue(70);
        circular.enqueue(80);
        circular.enqueue(90);
        System.out.println(circular);
        System.out.println(circular.size());
    }
}
