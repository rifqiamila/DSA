class Node<E> {
    E value;
    Node<E> nextNode;

    // Konstruktor
    Node(E data) {
        this.value = data;
        this.nextNode = null;
    }
}

public class LinkedList<E> {
    Node<E> head = null;
    Node<E> temp = null;
    Node<E> tail = null;
    int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
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

    public void addLast(E data) {
        Node<E> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            tail = head;
        }
        else {
            tail.nextNode = newNode;
            tail = newNode;
        }

        size++;
    }

    public E getFirst() {
        return (head != null) ? head.value : null;
    }

    public E getLast() {
        return (tail != null) ? tail.value : null;
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

    public E removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return null;
        }
        if (head.nextNode == null) {
            E removed = head.value;
            head = tail = null;
            size--;
            return removed;
        }

        temp = head;
        while(temp.nextNode != tail) {
            temp = temp.nextNode;
        }
        E removedValue = tail.value;
        tail = temp;
        tail.nextNode = null;

        size--;
        return removedValue;
    }

    public void add(int index, E data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }
        if (index < 0 || index > size - 1) {
            System.out.println("Index tidak terdapat dalam linked list");
            return;
        }

        Node<E> newNode = new Node<>(data);
        temp = head;
        for (int i = 0; i < index -1; i++) {
            temp = temp.nextNode;
        }
        newNode.nextNode = temp.nextNode;
        temp.nextNode = newNode;
        size++;
    }

    public E remove(int index) {
        if(isEmpty()) {
            System.out.println("Linked list kosong");
            return null;
        }
        if (index < 0 || index > size - 1) {
            System.out.println("Index tidak terdapat dalam linked list");
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == size - 1) {
            return removeLast();
        }
        temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.nextNode;
        }

        E removedValue = temp.nextNode.value;
        temp.nextNode = temp.nextNode.nextNode;
        size--;
        return removedValue;
    }

    public E get(int index) {
        if(isEmpty()) {
            System.out.println("Linked list kosong");
            return null;
        }
        temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.nextNode;
        }
        return temp.value;
    }

    public boolean contain(E data) {
        if (isEmpty()) {
            return false;
        }
        temp = head;
        while (temp != null) {
            if (temp.value.equals(data)) {
                return true;
            }
            temp = temp.nextNode;
        }

        return false;
    }

    public int indexOf(E data) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return -1;
        }
        temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.value.equals(data)) {
                return index;
            }
            temp = temp.nextNode;
            index++;
        }
        return -1;
    }

    public void print() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.nextNode;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        System.out.println(" Initial state:");
        list.print();

        // Add elements
        System.out.println("\n Adding elements...");
        list.addFirst("C");
        list.addFirst("B");
        list.addFirst("A"); // A -> B -> C
        list.print();

        list.addLast("D");
        list.addLast("E"); // A -> B -> C -> D -> E
        list.print();

        list.add(2, "X"); // A -> B -> X -> C -> D -> E
        list.print();

        // Check size
        System.out.println("\n Size: " + list.size());

        // Get first and last
        System.out.println("\n First element: " + list.getFirst());
        System.out.println(" Last element: " + list.getLast());

        // Get by index
        System.out.println("\n Get element at index 2: " + list.get(2));
        System.out.println(" Get element at index 4: " + list.get(4));

        // Check contains
        System.out.println("\n Contains 'X'? " + list.contain("X"));
        System.out.println(" Contains 'Z'? " + list.contain("Z"));

        // Index of
        System.out.println("\n Index of 'C': " + list.indexOf("C"));
        System.out.println(" Index of 'Z': " + list.indexOf("Z"));

        // Remove elements
        System.out.println("\n Removing first...");
        list.removeFirst(); // Removes A
        list.print();

        System.out.println(" Removing last...");
        list.removeLast(); // Removes E
        list.print();

        System.out.println(" Removing at index 2...");
        list.remove(2); // Removes C
        list.print();

        System.out.println("\n Current size: " + list.size());

        // Try to remove out-of-bounds
        System.out.println(" Removing at index 10 (out of bounds)...");
        list.remove(10); // should remove last
        list.print();

        System.out.println(" Removing at index -5 (negative index)...");
        list.remove(-5); // should remove first
        list.print();

        // Clear list
        System.out.println("\n Clearing list...");
        list.clear();
        list.print();
        System.out.println(" Is list empty? " + list.isEmpty());
    }
}
