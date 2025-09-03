import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int N = sc.nextInt();
        int fac = 1;
        System.out.print(N+"! = ");
        for(int i=N; i>0; i--){
         System.out.print(i);
         if(i>1){
            System.out.print(" X ");
         }
         fac*=i;
        }
        System.out.println(" = "+fac);
    }
}
