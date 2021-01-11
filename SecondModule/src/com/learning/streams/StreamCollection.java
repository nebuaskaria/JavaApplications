package com.learning.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamCollection {

    public void testStreamInCollection(){

        List<Integer> myList = new ArrayList<Integer>();
        myList.add(10);myList.add(9);
        myList.add(13);myList.add(7);
        myList.add(12);myList.add(6);
        myList.add(18);myList.add(5);
        myList.add(19);myList.add(1);

        myList.stream().filter((num)-> num > 10).forEach(System.out::println);


    }
}
