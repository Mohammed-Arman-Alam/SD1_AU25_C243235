import java.util.*;
public class problem4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        System.out.print("Enter three numbers : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        if(number1>number2 && number1>number3){
            System.out.println(number1 +"is the largest");
        }
        else if(number2>number1 && number2>number3){
            System.out.println(number2 +" is the largest");
        }
        else{
            System.out.println(number3 +" is the largest");
        }
    }
}
