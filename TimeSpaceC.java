public class TimeSpaceC {
    public void reverse(int[] number) {
        int left = 0;
        int right = number.length - 1;
        while (left < right) {
            int temp = number[left];
            number[left] = number[right];
            number[right] = temp;
            left++;
            right--;
        }
    }
    public int[] resizeArray(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[numbers.length - 1 - i];
        }
        return result;
    }
    public static void main(String[] args) {
        TimeSpaceC obj = new TimeSpaceC();

        int[] data = {1, 2, 3, 4, 5};

        obj.reverse(data);

        System.out.println("Reverse: " + java.util.Arrays.toString(data));

        int[] result = obj.resizeArray(data);

        System.out.println("ResizeArray: " + java.util.Arrays.toString(result));
    }
}
