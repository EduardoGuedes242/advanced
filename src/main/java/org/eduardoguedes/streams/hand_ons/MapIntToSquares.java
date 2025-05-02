package org.eduardoguedes.streams.hand_ons;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapIntToSquares {

  public static void main(String[] args) {

    List<Integer> numbers = List.of(1,2,3,4,5);

    Map<Integer, Integer> numbersAndSquares = numbers.stream().collect(Collectors.toMap(number -> number, number -> number * number));

    System.out.println(numbersAndSquares);

  }
}
