package opgave3;

public class AgeDiscount implements Discount{
    private final int customerAge;

    public AgeDiscount(int customerAge) {
        this.customerAge = customerAge;
    }
    public double getDiscountPrice(double price){
        double discountAmount = price * customerAge/100.0;
        return price - discountAmount;
    }
}
