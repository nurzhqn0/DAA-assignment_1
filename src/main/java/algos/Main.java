package main.java.algos;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 10, 6, 8, 9, 100000, 12};

        Arrays.stream(numbers).forEach(a -> System.out.print(a + " "));
    }
}