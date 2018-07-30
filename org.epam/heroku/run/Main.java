package run;


import flower.Flower;
import model.Order;
import org.apache.log4j.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Order order = new Order(true, "Something");
        order.addFlower(Flower.Chrysanthemum, 2)
                .addFlower(Flower.Daisy, 2)
                .addFlower(Flower.Narcisse, 1);
        Order tmp = new Order(false, "TMP");
        tmp.addFlower(Flower.Rose, 3)
                .addFlower(Flower.Poppy, 2);
        logger.trace(order.toString());
        logger.trace(tmp.toString());
    }
}
