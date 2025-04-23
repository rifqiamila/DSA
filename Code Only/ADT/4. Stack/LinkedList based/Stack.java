class Node<E> {
    E value;
    Node<E> nextNode;

    // Konstruktor
    Node(E data) {
        this.value = data;
        this.nextNode = null;
    }
}

class LinkedList<E> {
    Node<E> head = null;
    Node<E> temp = null;
    Node<E> tail = null;
    int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(E data) {
        Node<E> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            tail = head;
        }
        else {
            newNode.nextNode = head;
            head = newNode;
        }

        size++;
    }

    public E removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return null;
        }
        if (head.nextNode == null) {
            E removedValue = head.value;
            head = tail = null;
            size--;
            return removedValue;
        }

        E removedValue = head.value;
        head = head.nextNode;
        size--;
        return removedValue;
    }
}

public class Stack<E> {
    private LinkedList<E> linkedList = new LinkedList<>();

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    public int size() {
        return linkedList.size();
    }

    public void push(E data) {
        linkedList.addFirst(data);
    }

    public E pop() {
        return linkedList.removeFirst();
    }

    public E peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return null;
        }
        return linkedList.head.value;
    }

    public void print() {
        Node<E> current = linkedList.head;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.value);
            if (current.nextNode != null) {
                System.out.print(", ");
            }
            current = current.nextNode;
        }
        System.out.println("]");
    }

    // Main method buat testing
    public static void main(String[] args) {
        Stack<String> stackStr = new Stack<>();
        stackStr.push("Satu");
        stackStr.push("Dua");
        stackStr.push("Tiga");

        stackStr.print(); // [Tiga, Dua, Satu]
        System.out.println("Peek: " + stackStr.peek()); // Tiga
        System.out.println("Pop: " + stackStr.pop()); // Tiga
        stackStr.print(); // [Dua, Satu]

        Stack<Integer> stackInt = new Stack<>();
        stackInt.push(10);
        stackInt.push(20);
        stackInt.push(30);

        stackInt.print(); // [30, 20, 10]
        System.out.println("Peek: " + stackInt.peek()); // 30
        System.out.println("Pop: " + stackInt.pop()); // 30
        stackInt.print(); // [20, 10]
    }
}
