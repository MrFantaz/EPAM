package heroku.interfaceNumber;

import heroku.log.Log4j;

public interface NumberOpportunities {
    default int parsingStringToInt(String string) {
        int number = -1;
        try {
            number = Integer.valueOf(string);
        } catch (NumberFormatException e) {
            Log4j.getLogger().error("Error pars: " + e.getMessage());
        }

        return number;
    }

    default int foundMaxNumber(int[] arrayInt) {
        int maxNumber = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            if (maxNumber < arrayInt[i]) {
                maxNumber = arrayInt[i];
            }
        }
        return maxNumber;
    }

    default int foundMinNumber(int[] arrayInt) {
        int minNumber = 1000000000;
        for (int i = 0; i < arrayInt.length; i++) {
            if (minNumber > arrayInt[i]) {
                minNumber = arrayInt[i];
            }
        }
        return minNumber;
    }

    default String[] filterString(String[] strings){
        int count =0;
        for (String number:strings) {
            if (number.matches("\\b+")){
                count++;
            }
        }
        String[] tmp = new String[count];
        count=0;
        for (String number: strings) {
            if (number.matches("\\b+")){
                tmp[count]=number;
                count++;
            }
        }
        return tmp;
    }
}
