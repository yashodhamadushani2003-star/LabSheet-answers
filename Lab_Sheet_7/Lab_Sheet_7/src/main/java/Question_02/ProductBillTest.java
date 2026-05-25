/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_02;

/**
 *
 * @author User
 */
public class ProductBillTest {
    public static void main(String[] args) {
        
        ProductBill bill = new ProductBill("1500.00", "two");

        try {
            
            double totalCost = bill.calculateTotal();
            System.out.println("Total Bill: " + totalCost);
        } 
        catch (NumberFormatException e) {
            /* * Part C Comment:
             * A NumberFormatException occurs here because the String "two" 
             * contains letters and cannot be converted into a valid 
             * numerical integer by Integer.parseInt().
             */
            System.out.println("Error: Price and quantity must be valid numbers.");
        } 
        finally {
           
            System.out.println("Product bill calculation completed.");
        }

        
        System.out.println("Program continues...");
    }
}
