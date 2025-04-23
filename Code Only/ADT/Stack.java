public class Stack{

    static int[] data = new int[12];
    static int top = -1;

    public static int push(int value){
        if (top < 11){
            top++;
            data[top] = value;
            return 1;
        }
        else{
            return -1;
        }
    }

    public static int pop(){
        if (top == -1){
            System.out.println("Tidak ada data pada stack.:p");
            return -1;
        }

        int popped = data[top];
        top--;

        return popped;
    }

    public static int peek(){
        if (top == -1){
            System.out.println("Tidak ada data pada stack.:p");
            return -1;
        }
        int peeked = data[top];

        return peeked;
    }

    public static boolean isEmpty(){
        if (top == -1){
            return true;
        }

        return false;
    }
    public static void main (String[] args){
        // pakai array supaya gampang
        push(12);
        push(13);
        push(33);

        for (int i = top; i >=0; i--){
            System.out.println(data[i]);
        }
    }
}
