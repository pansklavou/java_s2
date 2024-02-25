package intro;
import java.util.Random;

public class  ex2_12_2 {
    public static void main(String[] args) {
        int[] values = new int[10];
        int sum=0;

        Random rnd= new Random();
        for (int i=0;i < values.length; i++){
            values[i]= rnd.nextInt(101);

        }
        int max= Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int value:values){
            max=Math.max(max, value);
            min=Math.min(min, value);
            sum=sum+value;
        }
        double avg= (double) sum/10;
        System.out.print("The array elements are:");
        for (int value:values){
            System.out.println(value + "");
        }
        System.out.println("The maximum value is : "+ max);
        System.out.println("The minimum value is : "+ min);
        System.out.println("The Sum of all values is : "+ sum);
        System.out.println("The average of values is : "+ avg);
    }


}