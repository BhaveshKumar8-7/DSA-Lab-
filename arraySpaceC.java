//public class arraySpaceC {
//    public int sum(int[] numbers) {
//      int total = 0;
//        for (int number : numbers) {
//           total += number;
//        }
//        return total;
//    }
//
//    public static void main(String[] args) {
//        arraySpaceC obj = new arraySpaceC();
//        int[] data = new int[]{1, 2, 3, 4, 5};
//        int total = obj.sum(data);
//        System.out.println("sum: " + total);
//    }
//}

public class arraySpaceC {

    public int sum(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            numbers[0] += numbers[i];
        }

        return numbers[0];
    }

    public static void main(String[] args) {
        arraySpaceC obj = new arraySpaceC();

        int[] data = new int[]{1, 2, 3, 4, 5};

        int number = obj.sum(data);

        System.out.println("sum: " + number);
    }
}
