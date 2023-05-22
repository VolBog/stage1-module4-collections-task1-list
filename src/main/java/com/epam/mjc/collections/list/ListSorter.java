package com.epam.mjc.collections.list;

import java.util.*;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        Integer aNumber = Integer.valueOf(a);
        Integer bNumber = Integer.valueOf(b);
        Integer aDouble = (int) (5*Math.pow(Integer.parseInt(a),2)+3);
        Integer bDouble = (int) (5*Math.pow(Integer.parseInt(b),2)+3);

        int result = aDouble.compareTo(bDouble);
        if(result == 0){
            return aNumber.compareTo(bNumber);
        } else {
            return result;
        }
    }
}
