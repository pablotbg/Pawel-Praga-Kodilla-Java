package ModulCzteryDwa;

import java.util.*;
import java.lang.*;
import java.io.*;

class Order {

    int numberOrder;
    String name;
    String model;

    public Order(int numberOrder, String name, String model) {
        this.numberOrder = numberOrder;
        this.name = name;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        Order order = (Order) o;
        return numberOrder == order.numberOrder &&
                Objects.equals(name, order.name) &&
                Objects.equals(model, order.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOrder, name, model);
    }

    @Override
    public String toString() {
        return "Number of order: " + numberOrder +
                ". Order item: " + name + ", " + model;
    }

    public int getNumberOrder() {
        return numberOrder;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }
}

class ListOrder {
    public static void main(String[] args) {

        Order order1 = new Order(001, "Samsung", "Galaxy S3000");
        Order order2 = new Order(002, "Xiaomi", "Note 900");
        Order order3 = new Order(003, "Huawei", "P 4000");
        Order order4 = new Order(001, "Samsung", "Galaxy S3000");
        Order order5 = new Order(004, "Noka", "E3500");

        Set<Order> orderSet = new HashSet<>();
        orderSet.add(order1);
        orderSet.add(order2);
        orderSet.add(order3);
        orderSet.add(order4);
        orderSet.add(order5);

        for(Order orders: orderSet) {
            System.out.println(orders);
        }
        System.out.println(orderSet.size());
    }
}