package heroku.io;

import heroku.interfaceNumber.NumberOpportunities;
import heroku.log.Log4j;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class NumberReader implements NumberOpportunities {
    private int itrator = 0;
    private int[] ints;
    private static final NumberReader INSTANCE = new NumberReader();

    private NumberReader() {

    }

    public static NumberReader getINSTANCE() {
        return INSTANCE;
    }

    // \\d+ use that
    public int[] takeNumberFromFile() {
        //TODO java NIO
        File file = new File("number.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedReader bufferedReader1 = new BufferedReader(fileReader);
            String[] d = new String[1];
            int i = 0;
            while ((d[i] = bufferedReader.readLine()) != null) {
                if (d[i].matches("\\d+")) {
                    String[] strings = d[i].split(" ");
                    for (int j = 0; j < strings.length; j++) {
                        itrator++;
                    }
                }
            }
            ints = new int[itrator];
            while ((d[i] = bufferedReader1.readLine()) != null) {
                itrator = 0;
                if (d[i].matches("\\b+")) {
                    String[] strings = d[i].split(" ");
                    for (int j = 0; j < strings.length; j++) {
                        ints[itrator] = parsingStringToInt(strings[j]);
                        itrator++;
                    }
                }
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            Log4j.getLogger().error("Error: " + e.getMessage());
        }
        return ints;
    }

    public int[] takeNumberFromConsov() {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] st = string.split(" ");
        itrator = (int) Arrays.stream(st).filter(s -> s.matches("\\d+")).count();
        ints = new int[itrator];
        itrator = 0;
        Arrays.stream(st).filter(s -> s.matches("\\d+")).forEach(s -> ints[itrator++] = parsingStringToInt(s));
        return ints;
    }
}
