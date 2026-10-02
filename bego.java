public class bego {

    public void log(int[] numbers) {
        for (int first : numbers) {

            for (int second : numbers) {
                System.out.println(first + " " + second);
            }

        }
    }

    public static void main(String[] args) {
        bego obj = new bego();

        obj.log(new int[]{1, 2, 3});
    }
}


