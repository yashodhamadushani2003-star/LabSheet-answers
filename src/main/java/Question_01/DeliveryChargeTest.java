package Question_01;

public class DeliveryChargeTest {

    public static void main(String[] args) {

        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        double charge1 = calculator.calculateCharge(500.0);
        System.out.println("Base charge only: Rs. " + charge1);

        double charge2 = calculator.calculateCharge(500.0, 3.0);
        System.out.println("Base + distance (3 km): Rs. " + charge2);

        double charge3 = calculator.calculateCharge(500.0, 3.0, 2.0);
        System.out.println("Base + distance (3 km) + weight (2 kg): Rs. " + charge3);

        double charge4 = calculator.calculateCharge(500.0, true);
        System.out.println("Base + express delivery: Rs. " + charge4);

        double charge5 = calculator.calculateCharge(500.0, false);
        System.out.println("Base + no express delivery: Rs. " + charge5);
    }
}

// This is compile-time polymorphism because Java decides which
        // calculateCharge() method to call at compile time based on the
        // number and types of arguments passed (method overloading).