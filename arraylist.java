import java.util.ArrayList;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        System.out.println(nums);

        List<String> names = new ArrayList<>();
        names.add("Bhavesh");
        names.add("Kamran");
        System.out.println(names.get(0));
        System.out.println(names.contains("Kamran"));

       
    
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.remove("Apple");
    System.out.println(fruits);

      ArrayList<Integer> num = new ArrayList<>();

      for(int i = 0; i<15 ; i++){
        num.add(i);


      }

System.out.println(num.size());

      ArrayList<String> name = new ArrayList<>(List.of("ali","sara"));

      System.out.println(name.get(1));

      name.set(1,"Zara");

      System.out.println(name); 

      ArrayList<Integer> number = new ArrayList<>(List.of(2,4,6,8));

      int sum =0;

      for(int n:number){
        sum+=n;
      }
      System.out.println(sum);

      ArrayList<Integer> Num = new ArrayList<>(5);

      System.out.println("size: "+ num.size());

      Num.add(1);
      Num.add(2);
      Num.add(2);
      Num.add(2);
      Num.add(2);
      Num.add(2);
      Num.add(2);
      
      System.out.println("Size after adding 2: "+ Num.size());

    }
}