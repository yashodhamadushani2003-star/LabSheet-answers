/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_03;

/**
 *
 * @author User
 */
public class StudentMarkReportTest {
    public static void main(String[] args) {
        
        String[] marks = {"78", "82", "absent", "90"};
        
        StudentMarkReport report = new StudentMarkReport(marks); 

       
        try {
            
            int mark = report.getMarkAt(6);
            System.out.println("Mark at index 6: " + mark);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            /* * Part D Comment 1:
             * An ArrayIndexOutOfBoundsException occurs here because index 6 
             * is outside the bounds of the array. The array length is only 4 
             * (valid indices are 0 to 3).
             */
            System.out.println("Error: Selected mark position does not exist."); 
        } 
        finally {
            System.out.println("Array access checking completed."); 
        }

        
        try {
           
            int mark = report.getMarkAt(2); 
            System.out.println("Mark at index 2: " + mark);
        } 
        catch (NumberFormatException e) {
            /* * Part D Comment 2:
             * A NumberFormatException occurs here because index 2 contains 
             * the text value "absent", which Integer.parseInt() cannot convert 
             * into a valid mathematical integer.
             */ 
            System.out.println("Error: Selected mark is not a valid number."); }
        finally {
            System.out.println("Number conversion checking completed."); }

       
        System.out.println("Report checking completed.");
    }
}