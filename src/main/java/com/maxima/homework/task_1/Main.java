package com.maxima.homework.task_1;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


@Slf4j
public class Main {
//    private static final Logger log = LoggerFactory.getLogger(
//            Main.class);

    public static void main(String[] args) {

        log.info("Hello World");

        List<String> list = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        while (list.size() < 5) {
            list.add(console.nextLine());
        }
        list.remove(2);
        List<String> reversed = list.reversed();
       reversed.forEach(System.out::println);


        console.close();
    }
}