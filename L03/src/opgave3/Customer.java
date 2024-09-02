package opgave3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private final LocalDate birthday;
    private Discount discount; // can be null

    private final ArrayList<Order> orders = new ArrayList<>();

    public Customer(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return this.name;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public List<Order> getOrders() {
        return new ArrayList<>(orders);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public double totalBuy(){
        double totalPrice = 0;
        for(Order o : orders){
            totalPrice += o.orderPrice();
        }
        return totalPrice;
    }
    public double totalBuyWithDiscount(){
        double totalBuyWithDiscount = totalBuy();
        if(discount != null){
            return discount.getDiscountPrice(totalBuy());
        }
        return totalBuyWithDiscount;
    }
    public int age(){
        int age = (int) ChronoUnit.YEARS.between(birthday, LocalDate.now());
        return age;
    }
}
