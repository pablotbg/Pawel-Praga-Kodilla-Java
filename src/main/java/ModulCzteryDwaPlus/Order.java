package ModulCzteryDwaPlus;

import java.util.*;
import java.lang.*;
import java.io.*;

class Order {

    int numberOrder;

    public Order(int numberOrder) {
        this.numberOrder = numberOrder;
    }

    @Override
    public boolean equals(Object o) {
        Order orders = (Order) o;
        if (orders.getNumberOrder() == numberOrder) {
            return true;
        } else {
            return false;
        }
    }

    public int getNumberOrder() {
        return numberOrder;
    }
}

class Application {
    public static void main(String[] args) {

        List<Order> theOrders = new LinkedList<>();
        //Random theGenerator = new Random();
        //for (int n=0; n < 50; n++){
        theOrders.add(new Order(1));
        theOrders.add(new Order(2));
        theOrders.add(new Order(3));
        theOrders.add(new Order(4));
        theOrders.add(new Order(5));
        theOrders.add(new Order(6));
        theOrders.add(new Order(7));
        theOrders.add(new Order(8));
        theOrders.add(new Order(9));
        theOrders.add(new Order(9));
        theOrders.add(new Order(1));
        //}

        Iterator<Order> iterator = theOrders.iterator();
        while(iterator.hasNext()) {
            Order examinedOrder = iterator.next();
            for (int n = 0; n < theOrders.size(); n++) {
                if (theOrders.get(n).hashCode() != examinedOrder.hashCode()) {
                    if (theOrders.get(n).equals(examinedOrder)) {
                        System.out.println("Duplicated order number: " +
                                examinedOrder.getNumberOrder());
                    }
                }
            }
        }
        System.out.println(theOrders.size());
    }
}
