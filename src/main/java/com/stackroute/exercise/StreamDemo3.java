package com.stackroute.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo3 {

    public static void main(String args[]){
        List<String> list=new ArrayList<String>();
        list.add("Shekhar");
        list.add("aman");
        list.add("Ahana");
        list.add("Shahrukh");
        list.add("Salman");
        list.add("Yana");


        //Printing all names starting with "A"
        System.out.println(list.stream().filter(employee -> employee.startsWith("A")).collect(Collectors.toList()));

        //Printing all names in upper case
        list.stream().map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        //Printing all names in uppercase whose name ends with s.

        List<String> startsWiths = list.stream().filter(s -> s.endsWith("s")).collect(Collectors.toList());
        startsWiths.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name));

        //counting names ending with h
        List<String> endswith = list.stream().filter(s -> s.endsWith("h")).collect(Collectors.toList());
        int[] count = {0};
        endswith.forEach(item -> {
            count[0]++;

        });
        System.out.println(count[0]);


        //Finding the first name start with "S"
        List<String> startWithS=list.stream().filter(employee -> employee.startsWith("S")).collect(Collectors.toList());
        System.out.println(startWithS.get(0));


        //even numbers using lambda expressions
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(9);
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

    }
}
