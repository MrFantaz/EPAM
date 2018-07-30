package test.sort;

import heroku.sort.BubbleSort;
import junit.framework.Assert;
import org.junit.Test;
import test.dataprovider.DataProvider;

public class TestBubbleSort implements DataProvider {
    @Test
    public void testSort(){
        BubbleSort bubbleSort = new BubbleSort();
        int[] arrayTest= bubbleSort.sort(getArrayInt());
        int[] array = getAssortedArrayInt();
        for(int i=0;i<array.length;i++){
            Assert.assertTrue("ERROR...",array[i]==arrayTest[i]);
        }

    }
}
