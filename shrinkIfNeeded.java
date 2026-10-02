
  public class shrinkIfNeeded{  
    static int[] shrinkIfNeeded(int[] arr, int size) {

        if (size < arr.length/4) {
            int[] smaller = new int[arr.length / 2];

            System.arraycopy(arr, 0, smaller, 0, size);
            return smaller;
        }
        return arr;

        

}
public static void main(String[] args) {
    int[] arr = new int[10];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        int size = 3;

        System.out.println("Before shrinking:");
        System.out.println("Capacity: " + arr.length);
        System.out.println("Used: " + size);

        arr =  shrinkIfNeeded(arr, size);

        System.out.println("\nAfter shrinking:");
        System.out.println("Capacity: " + arr.length);
        System.out.println("Used: " + size);

        System.out.println("\nElements:");

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }   
}

