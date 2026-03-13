package lesson9.problem2;

public class LinkedStack {
    private Node top;
    private int size;

    private class Node {
        Integer data;
        Node next;
        Node(Integer data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedStack() {
        this.top = null;
        this.size = 0;
    }

    public void push(Integer x) {
        if(x == null) return;
        Node nn = new Node(x);
        nn.next = top;
        top = nn;
        size++;
    }

    public Integer peek() {
        //returns null if stack is empty
        return (top == null) ? null : top.data;
    }

    public Integer pop() {
        Integer ret = peek();
        if(ret != null) {
            top = top.next;
            size--;
        }
        return ret;
    }

    public boolean isEmpty(){ // true if stack is empty
        return top == null;
    }

    public int size(){ // returns number of items in the stack
        return size;
    }

    @Override
    public String toString() {
        if(top == null) return "<empty>";
        StringBuilder sb = new StringBuilder();
        Node current = top;
        while (current != null) {
            //sb.append(current.data.toString()).append(" ");
            sb.insert(0, current.data + " "); //to print in the same order that was pushed
            current = current.next;
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        LinkedStack st = new LinkedStack();
        st.push(1);
        st.push(2);
        System.out.println(st);
        System.out.println("peek: " + st.peek());
        System.out.println("Size = " + st.size());
        System.out.println("Is empty? " + st.isEmpty());
        System.out.println("pop: " + st.pop());
        System.out.println(st);
        System.out.println("pop: " + st.pop());
        System.out.println(st);
    }
}