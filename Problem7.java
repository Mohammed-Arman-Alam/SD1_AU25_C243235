import java.util.*;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int N = sc.nextInt();
        for(int i=1; i<=10; i++){
         System.out.println(N+" X "+i+" = "+(N*i));
        }
    }
}