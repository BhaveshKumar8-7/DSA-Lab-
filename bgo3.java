public class bgo3 {

    public void log(int[] numbers) {

        for (int first : numbers) {
            for (int second : numbers) {
                for (int third : numbers) {
                    System.out.println(first + " " + second + " " + third);
                }
            }
        }
    }

    public static void main(String[] args) {
        bgo3 obj = new bgo3();

        obj.log(new int[]{1, 2});
    }
}

