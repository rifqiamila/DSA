public class Queue<T> {
    private Object[] queue;
    private int front;
    private int rear;
    private int capacity;

    @SuppressWarnings("unchecked")
    public Queue(int capacity) {
        this.capacity = capacity;
        this.queue = (T[]) new Object[capacity];
        this.front = 0;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return rear + 1 == capacity;
    }

    public void offer(T data) {
        if (isFull()) {
            System.out.println("Queue penuh!");
            return;
        }
        queue[++rear] = data;
    }

    @SuppressWarnings("unchecked")
    public T poll() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return null;
        }
        T removed = (T) queue[front];

        // Optional: shift all elements to the left
        for (int i = front + 1; i < rear + 1; i++) {
            queue[i - 1] = queue[i];
        }
        rear--; // reduce the rear index
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

    public boolean contain(T data) {
        for (int i = 0; i < rear + 1; i++) {
            if(queue[i].equals(data)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return rear - front + 1;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (int i = front; i < rear + 1; i++) {
            System.out.print(queue[i]);
            if (i < rear) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        System.out.println("=== Test Queue Implementation ===");
    
        Queue<String> myQueue = new Queue<>(5);
    
        System.out.println("\n> Test isEmpty on new queue:");
        System.out.println("Is empty? " + myQueue.isEmpty()); // true
    
        System.out.println("\n> Offering elements:");
        myQueue.offer("A");
        myQueue.offer("B");
        myQueue.offer("C");
        myQueue.print(); // [A, B, C]
    
        System.out.println("\n> Test peek:");
        System.out.println("Peek: " + myQueue.peek()); // A
    
        System.out.println("\n> Test contains:");
        System.out.println("Contains 'B'? " + myQueue.contain("B")); // true
        System.out.println("Contains 'Z'? " + myQueue.contain("Z")); // false
    
        System.out.println("\n> Test size:");
        System.out.println("Size: " + myQueue.size()); // 3
    
        System.out.println("\n> Dequeue (poll) some elements:");
        System.out.println("Removed: " + myQueue.poll()); // A
        myQueue.print(); // [B, C]
    
        System.out.println("Removed: " + myQueue.poll()); // B
        myQueue.print(); // [C]
    
        System.out.println("\n> Offer more elements:");
        myQueue.offer("D");
        myQueue.offer("E");
        myQueue.offer("F"); // should be okay
        myQueue.print(); // [C, D, E, F]
    
        System.out.println("\n> Test isFull:");
        System.out.println("Is full? " + myQueue.isFull()); // true or false depending on logic
    
        System.out.println("\n> Try to overfill:");
        myQueue.offer("G"); 
        myQueue.offer("H");  // Should print "Queue penuh!" if full
    
        System.out.println("\n> Dequeue all elements:");
        while (!myQueue.isEmpty()) {
            System.out.println("Removed: " + myQueue.poll());
            myQueue.print();
        }
    
        System.out.println("\n> Test after clearing:");
        System.out.println("Is empty? " + myQueue.isEmpty()); // true
        System.out.println("Peek: " + myQueue.peek()); // Should print "Queue kosong!"
        System.out.println("Poll: " + myQueue.poll()); // Should print "Queue kosong!"
    
        System.out.println("\n=== Test Finished ===");
    }    
}
