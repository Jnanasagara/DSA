
public class newDynamicArray {
    public static void main(String[] args) {

        Dynamic dynami = new Dynamic();

        dynami.add("A");
        dynami.add("B");
        dynami.add("C");
        dynami.add("D");
        dynami.add("E");
        dynami.add("F");

        System.out.println(dynami);
        System.out.println("size: " + dynami.size);
        System.out.println("empty: " + dynami.isEmpty());
    }
}

class Dynamic {
    int size;
    int capacity = 10;
    Object[] array;

    public Dynamic() {
        this.array = new Object[capacity];
    }

    public Dynamic(int capacity) {
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

    }

    public void delete(Object data) {

    }

    public int search(Object data) {
        return -1;
    }

    private void grow() {

    }

    private void shrink() {

    }

    public boolean isEmpty() {
        return size == 0;

    }

    public String toString() {
        String string = "";
        for (int i = 0; i < size; i++) {
            string += array[i] + ", ";
        }
        if (string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }
        return string;
    }
}
