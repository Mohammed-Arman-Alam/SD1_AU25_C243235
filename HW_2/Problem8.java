import java.util.*;
public class Problem8 {
    public static void main(String[] args) {
        System.out.print("Input a word : ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String lowerWord = word.toLowerCase();
        int len = word.length() -1;
        boolean palindrome = true;
        for(int i = 0; i<=len/2; i++){
            if((lowerWord.charAt(i)) != (lowerWord.charAt(len-i))){
                palindrome = false;
            }
        }
        if(palindrome){
            System.out.println(word+" is a palindrome");
        }
        else{
            System.out.println(word+" is not a palindrome");
        }
    }    
}
