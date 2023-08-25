import java.util.Random;

public class MegaSena {
    public static void main(String[] args) {
        int x;
        int i=0;
        Random generate=new Random();


       while(i<6){
           int number= generate.nextInt(60);
           System.out.println(number);
           i++;
       }
    }
}
