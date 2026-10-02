public class arrayTime {

    public void log(int[] numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public void log(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        arrayTime obj = new arrayTime();

        obj.log(new int[]{1, 2, 3});
        obj.log(new String[]{"Bhavesh", "sanjay"});
    }
}

