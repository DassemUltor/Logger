package com.maxima.homework.task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void checks(List<String> list) {
        boolean isOrdered = true;
        int index = -1;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() < list.get(i - 1).length()) {
                isOrdered = false;
                index = i;
                break;
            }
        }
        if (isOrdered) {
            System.out.println("The list is ordered");
        } else {
            System.out.println("The list is not ordered. Index of the first breaking element: " + index);
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(console.nextLine());
        }
        checks(list);
        console.close();
    }
}
