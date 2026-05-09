package Question_01;

public class DeliveryChargeCalculator {

    private static final double DISTANCE_RATE = 100.0;
    private static final double WEIGHT_RATE = 50.0;
    private static final double EXPRESS_CHARGE = 500.0;

    // Part As
    public double calculateCharge(double baseCharge) {
        return baseCharge;
    }

    public double calculateCharge(double baseCharge, double distanceKm) {
        return baseCharge + (distanceKm * DISTANCE_RATE);
    }

    // Part B
    public double calculateCharge(double baseCharge, double distanceKm, double weightKg) {
        return baseCharge + (distanceKm * DISTANCE_RATE) + (weightKg * WEIGHT_RATE);
    }

    public double calculateCharge(double baseCharge, boolean expressDelivery) {
        if (expressDelivery) {
            return baseCharge + EXPRESS_CHARGE;
        }
        return baseCharge;
    }
}