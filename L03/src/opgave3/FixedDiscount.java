package opgave3;

public class FixedDiscount implements Discount {
    private int fixedDiscount;
    private int discountLimit;

    public FixedDiscount(int fixedDiscount, int discountLimit) {
        this.fixedDiscount = fixedDiscount;
        this.discountLimit = discountLimit;
    }

    public double getDiscountPrice(double price){
        double discountedPrice = price;
        if(price > discountLimit){
            discountedPrice -= fixedDiscount;
        }
        return discountedPrice;
    }

}
