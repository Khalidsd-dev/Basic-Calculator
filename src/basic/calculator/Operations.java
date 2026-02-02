/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic.calculator;

import java.util.Scanner;

/**
 *
 * @author Shadrack
 */
public class Operations {
    
    private Scanner scanner;
    
    public void addition() throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        
            System.out.println("\n-------Addition----\n");
            
            System.out.println("Enter First Number: ");
            double number1 = scanner.nextDouble();
            
            System.out.println("Enter Second Number: ");
            double number2 = scanner.nextDouble();
            
           
           if(number1 <= 0 || number2 <=0) {
            // Throw New Exception
            throw new Exception("Number Out Of Bounds");
        }
        
         // Expression
        double sum = number1 + number2;
        
        System.out.println("\nResult: " + sum);
        System.out.println("\n\n******* ADDITION **********\n");
        }
        
        
    
    public void subtraction() throws Exception {
        scanner = new Scanner(System.in);
        
        System.out.println("\n\n***** SUBTRACTION ******\n");
        System.out.println("Enter First Number: ");
        float number1 = scanner.nextFloat();
        
        System.out.println("Enter Second Number: ");
        float number2 = scanner.nextFloat();
        
        if (number1 < 0 || number2 < 0) {
            throw new Exception("Cannot Subtract From A Negative Value!");
        }
        else{
            float result = number1 - number2;
            
            System.out.print("\nDivision Result: " + result + "\n");
        }
    }
    
    
    public void multiply() throws Exception {
        
        scanner = new Scanner(System.in);
        
        
        System.out.println("\n****** MULTIPLICATION *****\n");
        System.out.println("Enter Number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter Second Number");
        int number2 = scanner.nextInt();
        
        if(number1 < 0 || number2 < 0) {
            throw new Exception("Cannot multiply by a negative value!"); 
        }
        else {
            int result = number1 * number2;
            System.out.println("\nMultiplication Result: \n" + result + "\n");
        }
    }

    public void division() throws Exception {
  
        scanner = new Scanner(System.in);
        
        
        System.out.println("\n****** Division *****\n");
        System.out.println("Enter Number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter Second Number");
        int number2 = scanner.nextInt();
        
        if(number1 <= 0 || number2 <= 0) {
            throw new Exception("Cannot Divide by a negative value!"); 
        }
        else {
            int result = number1 / number2;
            System.out.println("\nDivision Result: \n" + result + "\n");
        }
    }
}
