public class bgo2 {
    public void log(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
        for (int first : numbers) {
            for (int second : numbers) {
                System.out.println(first + " " + second);
            }
        }

    }

    public static void main(String[] args) {
        bego obj = new bego();

        obj.log(new int[]{1, 2});
    }
}
