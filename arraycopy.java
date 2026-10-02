public class arraycopy {

    static int[] append(int[] arr, int size, int value) {

        if (size == arr.length) {
            int[] bigger = new int[arr.length * 2];

            System.arraycopy(arr, 0, bigger, 0, size);

            arr = bigger;
        }

        arr[size] = value;

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = new int[3];
        int size = 0;

        arr = append(arr, size, 10);
        size++;

        arr = append(arr, size, 20);
        size++;

        arr = append(arr, size, 30);
        size++;

        arr = append(arr, size, 40);
        size++;

        System.out.println("Capacity: " + arr.length);
        System.out.println("Used: " + size);
    }
}