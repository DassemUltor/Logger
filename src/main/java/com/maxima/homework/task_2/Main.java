package com.maxima.homework.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        List<String> result = list.stream()
                .flatMap(str -> Stream.of(str, "именно"))
                .toList();
        result.forEach(System.out::println);

    }
}
