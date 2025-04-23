class Node<T> {
    T value;
    Node<T> next;

    Node(T value) {
        this.value = value;
        this.next = null;
    }
}

public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void offer(T data) {
        Node<T> newNode = new Node<>(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public T poll() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return null;
        }
        T removed = front.value;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return removed;
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return null;
        }
        return front.value;
    }

    public boolean contain(T data) {
        Node<T> current = front;
        while (current != null) {
            if (current.value.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        Node<T> current = front;
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) System.out.print(", ");
            current = current.next;
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        System.out.println("=== LinkedList Queue Test ===");
        Queue<String> myQueue = new Queue<>();

        myQueue.offer("A");
        myQueue.offer("B");
        myQueue.offer("C");
        myQueue.print(); // [A, B, C]

        System.out.println("Peek: " + myQueue.peek()); // A
        System.out.println("Contains B? " + myQueue.contain("B")); // true
        System.out.println("Size: " + myQueue.size()); // 3

        System.out.println("Poll: " + myQueue.poll()); // A
        myQueue.print(); // [B, C]

        myQueue.offer("D");
        myQueue.offer("E");
        myQueue.print(); // [B, C, D, E]

        while (!myQueue.isEmpty()) {
            System.out.println("Removing: " + myQueue.poll());
        }

        myQueue.print(); // []
        System.out.println("Size after clear: " + myQueue.size()); // 0
    }
}
