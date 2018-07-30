package test.interfaceNumber;


import heroku.io.NumberReader;
import org.junit.Assert;
import org.junit.Test;
import test.dataprovider.DataProvider;

public class TestNumberOpportunities implements DataProvider {
    @Test
    public void testFoundMaxNumber(){
        int[] array = getArrayInt();
        int maybeMaxNumber = NumberReader.getINSTANCE().foundMaxNumber(array);
        Assert.assertTrue(maybeMaxNumber==65);
    }
    @Test
    public void testFoundMinNumber(){
        int[] array = getArrayInt();
        int maybeMinNumber = NumberReader.getINSTANCE().foundMinNumber(array);
        Assert.assertTrue(maybeMinNumber==12);
    }
    @Test
    public void testParsingStringToInt(){
     String tmp = "234";
     String tmp2 = "432";
     Assert.assertTrue(NumberReader.getINSTANCE().parsingStringToInt(tmp)==234 && NumberReader.getINSTANCE().parsingStringToInt(tmp2)==432);
    }
}
