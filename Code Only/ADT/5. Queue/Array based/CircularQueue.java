public class CircularQueue<T> {
    private Object[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new Object[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(T data) {
        if (isFull()) {
            System.out.println("Queue penuh!");
            return;
        }
        queue[rear] = data;
        rear = (rear + 1) % capacity;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return null;
        }
        T removed = (T) queue[front];
        front = (front + 1) % capacity;
        size--;
        return removed;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return null;
        }
        return (T) queue[front];
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
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        CircularQueue<String> cq = new CircularQueue<>(5);

        System.out.println("Is empty? " + cq.isEmpty());
        System.out.println("Is full? " + cq.isFull());

        cq.enqueue("A");
        cq.enqueue("B");
        cq.enqueue("C");
        cq.print(); // [A, B, C]

        System.out.println("Dequeue: " + cq.dequeue()); // A
        cq.print(); // [B, C]

        cq.enqueue("D");
        cq.enqueue("E");
        cq.enqueue("F"); // now full
        cq.print(); // [B, C, D, E, F]

        System.out.println("Is full? " + cq.isFull());

        System.out.println("Peek: " + cq.peek()); // B

        while (!cq.isEmpty()) {
            System.out.println("Removed: " + cq.dequeue());
        }

        cq.print(); // []

        System.out.println("Is empty? " + cq.isEmpty());
    }
}
