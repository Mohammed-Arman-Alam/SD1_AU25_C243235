import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A :");
        int a = sc.nextInt();
        System.out.println("Enter symbol :");
        char c = sc.next().charAt(0);
        System.out.println("Enter B :");
        int b = sc.nextInt();
        System.out.println("your output :");
        switch (c) {
            case '+':
                System.out.println(a+" "+c+" "+b+"="+" "+(a+b));
                break;
            case '-':
                System.out.println(a+" "+c+" "+b+"="+" "+(a-b));
                break;
            case '*':
                System.out.println(a+" "+c+" "+b+"="+" "+(a*b));
                break;
            case '/':
                System.out.println(a+" "+c+" "+b+"="+" "+(a/b));
                break;
            default:
                break;
        }

    }
}
