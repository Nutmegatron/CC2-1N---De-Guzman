/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M306User
 */


//imported scanner
import java.util.Scanner;

public class UserInput {
    public static void main (String[] args) {
        
        //created a scanner object to accept input from users
        Scanner scanner = new Scanner(System.in);
        
        //created an input for integers
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        //created an input for floats
        System.out.print("Enter a decimal number: ");
        float decimal = scanner.nextFloat();
        
        //created an input for characters
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        
        //created a boolean if else statement where a user can answer true or false
        System.out.print("Are you under 18? Answer true or false: ");
        boolean age = scanner.nextBoolean();
        if (age == true ) {
        System.out.println("You are under 18");
        } else if (age == false){ 
            System.out.println("You are over 18");
        } 
        
        //created a nextline scanner so the string input works
        scanner.nextLine();
        
        //created a string input
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
    
    
     
    }
    
}
