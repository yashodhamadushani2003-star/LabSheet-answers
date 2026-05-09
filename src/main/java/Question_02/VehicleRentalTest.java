/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_02;

/**
 *
 * @author User
 */
public class VehicleRentalTest {
    public static void main(String[] args) {
        
        Vehicle vehicle1 = new Car("C-1001", "Toyota", 5, 5000.0);
        Vehicle vehicle2 = new Bike("B-2002", "Yamaha", 10, 200.0);

        
        System.out.println("--- Car Rental Details ---");
        vehicle1.displayVehicleInfo();
        System.out.println("Total Cost: " + vehicle1.calculateRentalCost());

        System.out.println("\n--- Bike Rental Details ---");
        
        vehicle2.displayVehicleInfo();
        System.out.println("Total Cost: " + vehicle2.calculateRentalCost());

        /* * This is runtime polymorphism because Java decides which version of 
         * calculateRentalCost() to execute at runtime based on the actual object type 
         * (Car or Bike) rather than the reference type (Vehicle). 
         */
    }
}