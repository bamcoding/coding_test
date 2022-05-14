package com.bamcoding;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestTempMain {
    public static void main(String[] args) throws IOException {

        BufferedReaderProcessor brp = new BufferedReaderProcessor() {
            @Override
            public String process() throws IOException {
                try(BufferedReader br = new BufferedReader(new FileReader("/Users/edward/Documents/bamcoding/coding_test/file1.txt"))){
                    return br.readLine();
                }
            }
        };

        System.out.println(brp.process());

    }
}
