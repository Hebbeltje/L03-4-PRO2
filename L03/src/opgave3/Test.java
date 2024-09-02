package opgave3;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Toilet paper", 1000);
        Product product2 = new Product(2, "Rubber duck", 20);
        Product product3 = new Product(3, "Toblerone", 15.89);
        Product product4 = new Product(4, "Fake beard", 115.99);
        Product product5 = new Product(5, "Per1", 0.98);

        Customer customer1 = new Customer("Per1", LocalDate.of(1985,8,27));
        Customer customer2 = new Customer("Per2", LocalDate.of(1999,1,16));

        Order order1 = new Order(1);
        Order order2 = new Order(2);
        Order order3 = new Order(3);
        Order order4 = new Order(4);
        Order order5 = new Order(5);
        Order order6 = new Order(6);

        OrderLine orderLine1 = new OrderLine(1,2,product1);
        OrderLine orderLine2 = new OrderLine(2,23,product3);
        OrderLine orderLine3 = new OrderLine(3,1,product4);
        OrderLine orderLine4 = new OrderLine(4,10,product5);
        OrderLine orderLine5 = new OrderLine(5,6,product4);

        order1.addOrderLine(orderLine1);
        order1.addOrderLine(orderLine5);

        order2.addOrderLine(orderLine1);
        order2.addOrderLine(orderLine2);

        order3.addOrderLine(orderLine4);
        order3.addOrderLine(orderLine3);

        order4.addOrderLine(orderLine2);
        order4.addOrderLine(orderLine3);

        order5.addOrderLine(orderLine5);
        order5.addOrderLine(orderLine3);

        order6.addOrderLine(orderLine2);
        order6.addOrderLine(orderLine4);

        customer1.addOrder(order1);
        customer1.addOrder(order2);
        customer1.addOrder(order3);
        customer1.addOrder(order4);

        customer2.addOrder(order5);
        customer2.addOrder(order6);

        Discount discount1 = new FixedDiscount(200, 1000);
        Discount discount2 = new PercentDiscount(10);
        Discount discount3 = new AgeDiscount(customer1.age());

        customer1.setDiscount(discount1);
        customer2.setDiscount(discount2);

        System.out.println(customer2.totalBuy());
        System.out.println(customer2.totalBuyWithDiscount());

        System.out.println(customer1.totalBuy());
        System.out.println(customer1.totalBuyWithDiscount());

        customer1.setDiscount(discount3);

        System.out.println(customer1.totalBuy());
        System.out.println(customer1.totalBuyWithDiscount());

        System.out.println(customer1.age());

        
    }
}
