package org.eduardoguedes.streams;

import java.util.Comparator;
import java.util.List;

public class StreamLearn {


  public static void main(String[] args) {
    List<Integer> numbers = List.of(6,9,5,8,2,8,7,1,6,6,4,3);

    //Filter - Execute a expression
    List<Integer> numbersBiggerFive = numbers.stream()
            .filter(number -> number > 5)
            .toList();

    System.out.println("=== NUMBERS BIGGER OF FIVE ===");
    numbersBiggerFive.forEach(number -> System.out.println("Name: " + number));

    List<Integer> numbersPair = numbers.stream().filter(number -> number % 2 == 0).toList();
    System.out.println("=== List of Numbers Pair ===");
    numbersPair.forEach(number -> System.out.println("Number: " + number));

    //Map - Execute a function
    List<Integer> numbersMultiply = numbers.stream().map(number -> number * 10).toList();
    System.out.println("=== List of Numbers Multiply for 10 ===");
    numbersMultiply.forEach(number -> System.out.println("Number: " + number));

    //Distinct - remove elements duplicate
    List<Integer> listNumbersUnique = numbers.stream().distinct().toList();
    System.out.println("=== Remove duplicate ===");
    listNumbersUnique.forEach(number -> System.out.println("Number: " + number));

    //Sorted - order elements
    List<Integer> listNumberSort = numbers.stream().sorted().toList();
    System.out.println("=== List of Numbers Sorted ===");
    listNumberSort.forEach(number -> System.out.println("Number: " + number));

    //Sorted (Comparator) - order elements
    List<Integer> listNumberSortedComparator = numbers.stream().sorted(Comparator.reverseOrder()).toList();
    System.out.println("=== List of Numbers Sorted(Comparator) ===");
    listNumberSortedComparator.forEach(number -> System.out.println("Number: " + number));

    //Limit(n) - Select of "N" First elements
    List<Integer> listNumberLimit = numbers.stream().limit(4).toList();
    System.out.println("=== List of 4 first Numbers  ===");
    listNumberLimit.forEach(number -> System.out.println("Number: " + number));

    //Limit(n) - Skip of "N" First elements
    List<Integer> listNumberSkip = numbers.stream().skip(4).toList();
    System.out.println("=== List of 4 first Numbers  ===");
    listNumberSkip.forEach(number -> System.out.println("Number: " + number));

    //toList - add in the list, in encounter order
    //toSet - add  in the list, remove duplicates
    //toMap - add in the list, with Key and Value <Key, Value> and return {a=1, aa=2}

    //Method Returns true if...
    //anyMatch() At least 1 satisfies the condition
    //allMatch() All satisfies the condition
    //noneMatch() None satisfies the condition



  }

}
