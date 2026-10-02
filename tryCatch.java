public class tryCatch {
    public static void main(String[] args) {
        int[] arr = new int[1];
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot access memory outside allocated block");
        }
    }

}
