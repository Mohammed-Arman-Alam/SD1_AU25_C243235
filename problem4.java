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
        
        System.out.print("Enter three numbers : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        if(number1>number2 && number1>number3){
            System.out.println(number1 +"is largest");
        }
        else if(number2>number1 && number2>number3){
            System.out.println(number2 +"is largest");
        }
        else{
            System.out.println(number3 +"is largest");
        }
    }
}
