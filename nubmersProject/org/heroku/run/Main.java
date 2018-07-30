package heroku.run;

import heroku.io.NumberReader;
import heroku.log.Log4j;

public class Main {
    public static void main(String[] args) {
        int[] ints = NumberReader.getINSTANCE().takeNumberFromConsov();
        System.out.println(ints);
//        int[] ints = {23,32,32,1,21,3};
        Log4j.getLogger().trace("Max Number: " + NumberReader.getINSTANCE().foundMaxNumber(ints));
        Log4j.getLogger().trace("Min Number: " + NumberReader.getINSTANCE().foundMinNumber(ints));
    }
}
