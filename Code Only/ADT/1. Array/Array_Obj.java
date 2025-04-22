public class Array {
    Object[] num;
    int size = 0;

    // Konstruktor
    public Array(int lenght) {
        this.size = lenght;
        num = new Object[size];
    }

    // Assign value di index tertentu
    public void assign(int index, Object value) {
        if (index >= 0 && index < size) {
            num[index] = value;
        } 
        else {
            System.out.println("Index out of bounds");
        }
    }

    // Akses value di index tertentu
    public Object access(int index) {
        if (index >= 0 && index < size) {
            return num[index];
        } 
        else {
            System.out.println("Index out of bounds");
            return -1;
        }
    }

    // Panjang Array
    public int length() {
        return size;
    }

    // Mencetak isi Array
    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String[] args) {
        Array numb = new Array(7); // Membuat objek baru (numb) dari kelas Array

        numb.assign(0, 90);
        numb.assign(6, 85);

        System.out.println(numb.access(6));

        numb.printArray();
    }
}
