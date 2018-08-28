package filereader;

import model.Order;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileParseToOrder {
    private final String path = "createObject.txt";
    private List<Order> orderList = new ArrayList<>();
    public List<Order> getOrder() {
        File file = new File("heroku/createObject.txt");
        Path path = file.toPath();
        try {
            orderList = Files.lines(path).map(s -> new ParseToOrder().parse(s)).filter(order -> {
                if (order == null) {
                    return false;
                } else {
                    return true;
                }
            }).collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
      return orderList;
    }
}
