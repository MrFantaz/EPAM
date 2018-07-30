package test.dataprovider;

public interface DataProvider {
    default String getTestString(){
        return null;
    }
    default int[] getArrayInt(){
        int[] array = {44,12,34,54,65};
        return array;
    }
    default int[] getAssortedArrayInt(){
        int[] array = {12,34,44,54,65};
        return array;
    }
}
