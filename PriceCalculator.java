public class PriceCalculator {
    public double calculateDiscountedPrice(double originalPrice, double discountPercentage) {
        return originalPrice * (1 - discountPercentage);
    }
}
