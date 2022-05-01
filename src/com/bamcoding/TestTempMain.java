package com.bamcoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestTempMain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        List<Integer> list = new ArrayList<>();

        for(int a : arr) {
            list.add(a);
        }

        int test = list.get(0).compareTo(list.get(1));
        System.out.println(test);

        list = list.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        list.stream().forEach(System.out::println);

        test = list.get(0).compareTo(list.get(1));
        System.out.println(test);

        list = list.stream().sorted().collect(Collectors.toList());
        list.stream().forEach(System.out::println);

    }
}
