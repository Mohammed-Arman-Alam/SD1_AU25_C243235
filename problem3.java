/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.*;
/**
 *
 * @author SDLab-PC-CX142
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        System.out.println("your number is "+ number );
        if(number%2==0){
            System.out.println(number + " is even number");
        }
        else{
            System.out.println(number + " is odd number");
        }
    }
}
