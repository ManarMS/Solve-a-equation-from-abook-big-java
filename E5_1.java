
import java.util.Scanner;


public class E5_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the number : ");
        int number=input.nextInt();
        if (number>0){
            System.out.println("The number is postive ");
        }
        else if(number<0){
            System.out.println("The number is negative ");
        }
        else {
            System.out.println("The number is zero");
        }
    }
   
}
