 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Shadrack
 */
public class BasicCalculator {

    private static String[] FunctionalOperations = {"Addition", "Subtraction", "Multiplication", "Division"};
    public static Operations operation = new Operations();
    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        // Instantiate Scanner class to get the input from User(keyboard)
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
          
          System.out.println("******** BASIC CALCULATOR ********");
          
            for (int i = 0; i < 4; i++) {
              System.out.println(i + " . " + FunctionalOperations[i]);
          }
          
            System.out.println("\nPlease Enter Your Desired Operation Of the Number Specified Above.\n ");
            
            // Get User Input
            int input = scanner.nextInt();
            
            
            switch(input) {
                
                case 0:
                    operation.addition();
                    break; 
                    
                case 1:
                    operation.subtraction();
                    break;
                    
                case 2:
                    operation.multiply();
                    break;
                    
                case 3:
                    operation.division();
                    break;
            }
        }
        
    }
    
}
