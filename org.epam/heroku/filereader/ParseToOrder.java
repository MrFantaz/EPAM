package filereader;

import model.Order;
import util.OrderValidation;

public class ParseToOrder implements OrderValidation {
    public Order parse(String s) {
        String[] splitString = s.split(" ");
        if(splitString[3].matches("\\d+")){
            System.out.println("here");
        }
        if (isValid(splitString)) {
            System.out.println("VALID "+splitString[3]);
            return null;
        }
        Order order = new Order(Boolean.parseBoolean(splitString[0]), splitString[1]);
        for (int i = 2; i < splitString.length; i += 2) {
            if (searchForFlowers(splitString[i]) == null) {
                return null;
            }
            order.addFlower(searchForFlowers(splitString[i]), Integer.parseInt(splitString[i + 1]));
        }
        return order;
    }
}
