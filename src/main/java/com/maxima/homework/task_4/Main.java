package com.maxima.homework.task_4;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

@Slf4j
public class Main {


    public static List<String> doubleValues(List<String> list) {


        return list.stream()
                .flatMap(str -> Stream.of(str, str))
                .toList();
    }

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(console.nextLine());
        }
        doubleValues(list).forEach(log::info);

        console.close();
    }
}

