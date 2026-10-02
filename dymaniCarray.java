public class dymaniCarray {
    public static void main(String[] args) {
        int[] arr = new int[2];
        int size = 0;
        arr[size++] = 1;
        arr[size++] = 2;
        System.out.println(arr.length);
        int[] bigger = new int [arr.length*2];
        System.arraycopy(arr,0,bigger,0,arr.length);
        arr = bigger;
        arr[size++] = 3;
        System.out.println(arr.length);
        System.out.println(arr[2]);
    }
    
}
