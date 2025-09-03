import java.util.*;
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int N = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=N; i++){
         System.out.print(i);
         sum+=i;
         if(i<N){
            System.out.print(" + ");
         }
        }
        System.out.println(" = "+sum);
    }
}
