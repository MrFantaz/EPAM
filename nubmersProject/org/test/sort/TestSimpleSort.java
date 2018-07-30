package test.sort;

import heroku.sort.SimpleSort;
import junit.framework.Assert;
import org.junit.Test;
import test.dataprovider.DataProvider;

public class TestSimpleSort implements DataProvider {
    @Test
    public void testSort(){
        SimpleSort simpleSort = new SimpleSort();
        int[] arrayTest= simpleSort.sort(getArrayInt());
        int[] array = getAssortedArrayInt();
        for(int i=0;i<array.length;i++){
            Assert.assertTrue("ERROR...",array[i]==arrayTest[i]);
        }
    }

}
