public class ArrayList {
    int size = 0;  // Banyak data
    int capacity = 10;  // Banyak ruang
    Object[] array;

    public ArrayList() {
        this.array = new Object[capacity];
    }

    public ArrayList(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data) {
        if (size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data) {
        if (size >= capacity) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i-1];
        }

        array[index] = data;
        size++;
    }

    public void delete(Object data) {
        for(int i = 0; i < size; i++) {
            if(array[i] == data) {
                for(int j = 0; j < size - i - 1; j++) {
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;

                if(size <= (int) (capacity/3)) {
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data) {
        for (int i = 0; i < size; i++) {
            if(array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {
        int newCapacity = capacity * 2;
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    private void shrink() {
        int newCapacity = capacity / 2;
        if (newCapacity < 10) {
            newCapacity = 10; // Minimum kapasitas
        }
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public boolean isEmpty() {
        return size == 0;  // Return benar hanya saat size = 0 -> Array list kosong
    }

    public String toString() {
        String string = "";

        for (int i = 0; i < size; i++) {
            string += array[i] + ", ";
        }
        if(string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        }
        else {
            string = "[]";
        }
        return string;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();

        arr.add(90);
        arr.add(75);
        arr.add(80);
        arr.insert(1, 67);
        arr.delete(75);

        arr.add(123);
        arr.add(6);
        arr.add(23);
        arr.insert(5, 656);

        arr.add(90);
        arr.add(75);
        arr.add(80);
        arr.insert(1, 67);

        System.out.println("\ncapacity = " + arr.capacity);
        System.out.println("size = " + arr.size);

        System.out.println(arr.toString());

        arr.delete(75);
        arr.delete(80);
        arr.delete(123);
        arr.delete(6);
        arr.delete(23);

        System.out.println("\ncapacity = " + arr.capacity);
        System.out.println("size = " + arr.size);

        System.out.println(arr.toString());
    }
}
