package opgave3;

public class PercentDiscount implements Discount {
    private int discountPercentage;

    public PercentDiscount(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPrice(double price) {
        double discountAmount = price * discountPercentage / 100.0;
        return price - discountAmount;
    }

}
