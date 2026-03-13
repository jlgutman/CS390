package lesson9.problem1;

import java.util.Arrays;

public class ArrayQueueImpl {
    private final int DEFAULT_CAPACITY = 10;
    private int size;
    private Integer[] arr;
    private int front;
    private int rear;

    // Add Constructors, Default and Parameterized to initialize instance fields
    public ArrayQueueImpl() {
        this.arr = new Integer[DEFAULT_CAPACITY];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public ArrayQueueImpl(int capacity) {
        this.arr = new Integer[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public Integer peek() {
//implement
        if (isEmpty()) return null;
        return arr[front];
    }
    public void enqueue(int obj){
//implement
        if (size == arr.length)
            resize();
        arr[rear] = obj;
        rear = (rear + 1) % arr.length;
        size++;
    }

    public Integer dequeue() {
        if (isEmpty()) return null;
        Integer dequeueElement = arr[front];
        arr[front] = null;
        front = (front + 1) % arr.length;
        size--;
        return dequeueElement;
    }
    public boolean isEmpty(){
//implement
        return size == 0 || arr == null || arr.length == 0;
    }
    public int size(){
//implement
        if (isEmpty()) return 0;
        return size;
    }
    private void resize(){
//implement
        int newCapacity = 2 * arr.length;
        Integer[] newArr = new Integer[newCapacity];
        for (int i = 0; i < size; i++) {
            int currentFront = (front + i) % arr.length;
            newArr[i] = arr[currentFront];
        }
        arr = newArr;
        front = 0;
        rear = size;
    }

    public String toString(){
 /* Return data in this format, each element separated by comma with in [ ] eg:
[10, 20, 30, 40, 50, 60 ]*/
        if (isEmpty()) return "[ Empty Queue ]";
        StringBuilder sb = new StringBuilder("[");
        for (int i=0; i<size; i++) {
            String comma = i != size-1 ? ", ": "";
            sb.append(arr[(front + i) % arr.length]);
            sb.append(comma);
        }
        sb.append("]");
        return sb.toString();
    }
}