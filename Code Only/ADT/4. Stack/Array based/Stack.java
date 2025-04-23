public class Stack<T>{
    private Object[] stack;
    private int top;
    private int capacity;

    @SuppressWarnings("unchecked")
    public Stack(int capacity) {
        this.capacity = capacity;
        this.stack = (T[]) new Object[capacity];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity - 1;
    }

    public void push(T elemen) {
        if (isFull()) {
            System.out.println("Stack penuh!");
        }
        else {
            top++;
            stack[top] = elemen;
        }
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
            return null;
        }
        else {
            return (T) stack[top--];
        }
    }

    public T peek() {
        if(isEmpty()) {
            System.out.println("Stack kosong!");
            return null;
        }
        else {
            return (T) stack[top];
        }
    }

    public int size() {
        return top + 1;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("[]");
        }
        else {
            System.out.print("[");
            for (int i = 0; i < top; i++) {
                System.out.print(stack[i] + ", ");
            }
            System.out.println(stack[top] + "]");
        }
    }

    public static void main (String[] args){
        Stack<Integer> stack1 = new Stack<>(30);

        stack1.push(90);
        stack1.push(78);
        stack1.push(11);
        stack1.push(56);

        System.out.println("\nadd 90 78 11 56");
        System.out.println("Kondisi stack");
        stack1.print();

        stack1.pop();
        System.out.println("\n" + stack1.pop());
        System.out.println(stack1.peek());

        System.out.println("\npop dua kali");
        System.out.println("Kondisi stack");
        stack1.print();

        System.out.println("\nUkuran stack: " + stack1.size());
        System.out.println("Stack kosong? " + stack1.isEmpty());

        stack1.pop();
        System.out.println("\n" + stack1.pop());
        stack1.peek();

        System.out.println("\npop dua kali");
        System.out.println("Kondisi stack");
        stack1.print();

        System.out.println("\nUkuran stack: " + stack1.size());
        System.out.println("Stack kosong? " + stack1.isEmpty());
    }
}
