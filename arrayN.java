public class arrayN{
    public void log(int[] numbers ){
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
    public static void main(String[] args){
        
  
    arrayN demo = new arrayN();
    int [] data = {5,10,15};
    demo.log(data);
      }
}