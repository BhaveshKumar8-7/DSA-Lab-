import java.util.Arrays;

public class arraySpace2 {
    public int[] doubleAll(int[] numbers){
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i]*2;
        }
        return result;
    }

    public static void main(String[] args) {
        arraySpace2 obj = new arraySpace2();
        int[] data = new int[]{1, 2, 3, 4, 5};
        int[] result = obj.doubleAll(data);
        System.out.println("Input : " + java.util.Arrays.toString(data));
        System.out.println("Output : " + java.util.Arrays.toString(result));
    }
}