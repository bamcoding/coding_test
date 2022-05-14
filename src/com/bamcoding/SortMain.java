package com.bamcoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for(int i=0;i<n;i++){
            numbers.add(sc.nextInt());
        }

        for(int number : numbers){
            System.out.println(number);
        }
    }
}
