/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Example;

/**
 *
 * @author User
 */
public class BasicExceptionExample {
    public static void main(String[] args) {
        
       
        int firstNumber = 20;
        int secondNumber = 0;
        
        try {
            int answer = firstNumber / secondNumber;
            System.out.println("Answer: " + answer);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } 
        finally {
            System.out.println("Division attempt finished.");
        }
        
        System.out.println();

        
        String markText = "eighty";
        
        try {
            int mark = Integer.parseInt(markText);
            System.out.println("Mark: " + mark);
        } 
        catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        } 
        finally {
            System.out.println("Number conversion attempt finished.");
        }
        
        System.out.println();

        
        int[] marks = {65, 72, 80};
        
        try {
            System.out.println("Selected Mark: " + marks[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array position.");
        } 
        finally {
            System.out.println("Array access attempt finished.");
        }
        
        System.out.println();
        
        
        System.out.println("Program continues after handling exceptions.");
    }
}