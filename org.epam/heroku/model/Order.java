package model;

import flower.Flower;
import util.FlowerInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Formatter;

public class Order implements FlowerInterface {
    private final int MIN_LENGTH_ORDER_NAME = 4;
    private final int MAX_LENGTH_ORDER_NAME = 20;
    private double count;
    private boolean basket;
    private ArrayList<Flower> bouquet;
    private int orderNumber;
    private String orderName;
    private LocalDate localDate = LocalDate.now();

    public Order(boolean basket, String orderName) {
        this.basket = basket;
        this.orderName = orderName;
        this.bouquet = new ArrayList<>();
        this.orderNumber = (int) (Math.random() * 1000);
        if (basket) {
            count += 7;
        } else {
            count += 2;
        }
        if (orderName.length() <= MIN_LENGTH_ORDER_NAME || orderName.length() >= MAX_LENGTH_ORDER_NAME) {
            this.orderName = "Client " + orderNumber;
        }
    }

    @Override
    public Order addFlower(Flower flower, int quantity) {
        flower.setQuantity(quantity);
        bouquet.add(flower);
        count += flower.getCount() * quantity;
        return this;
    }

    @Override
    public String toString() {
        Formatter formatter = new Formatter();
        formatter.format("%-9s%-11s%n", "Order:", "10000");
        formatter.format("%-9s%-11s%n", "Client:", orderNumber);
        formatter.format("%-9s%-11s%n", "Name:", orderName);
        formatter.format("%s%n", "---------------------------------");
        for (Flower f : bouquet) {
            formatter.format("%-17s%-7s%-6s%n", f.name(), f.getQuantity(), f.getCount() * f.getQuantity() + "$");
        }
        formatter.format("---------------------------------\n");
        formatter.format("%-24s%-6s%n", "Registration time:", localDate);
        formatter.format("%-24s%-6s%n", "Total amount:", count);
        formatter.format("%-20s%n", "*********************************");

        return formatter.toString();
    }
}


