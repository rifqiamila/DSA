public class Array {
    int[] num;
    int size = 0;

    public Array(int lenght) {
        this.size = lenght;
        num = new int[size];
    }

    public void assign(int index, int value) {
        if (index >= 0 && index < size) {
            num[index] = value;
        } 
        else {
            System.out.println("Index out of bounds");
        }
    }

    public int access(int index) {
        if (index >= 0 && index < size) {
            return num[index];
        } 
        else {
            System.out.println("Index out of bounds");
            return -1;
        }
    }

    public int length() {
        return size;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String[] args) {
        Array numb = new Array(7);

        numb.assign(0, 90);
        numb.assign(6, 85);

        System.out.println(numb.access(6));

        numb.printArray();
    }
}
