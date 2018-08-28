package util;

import flower.Flower;

public interface OrderValidation {
    default boolean isValid(String[] strings){
        if ((strings[0].equalsIgnoreCase("true") || strings[0].equalsIgnoreCase("false")) && strings[3].matches("\\d+")){
            return true;
        }else {
            return false;
        }

    }
    default Flower searchForFlowers(String s){
        switch (s){
            case "Tulip": return Flower.Tulip;
            case "Rose": return Flower.Rose;
            case "Narcisse": return Flower.Narcisse;
            case "Sunflower": return Flower.Sunflower;
            case "Gerbera": return Flower.Gerbera;
            case "Chrysanthemum": return Flower.Chrysanthemum;
            case "Daisy": return Flower.Daisy;
            case "Poppy": return Flower.Poppy;
        }
        return null;
    }
}
