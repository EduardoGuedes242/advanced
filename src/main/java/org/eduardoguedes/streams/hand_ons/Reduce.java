package org.eduardoguedes.streams.hand_ons;

import java.util.List;

public class Reduce {

  public static void main(String[] args) {
    List<Integer> numbers = List.of(1,2,3,4,5);

    Integer resultOfSum = numbers.stream().reduce(0, (valorInical, valorItemArray) -> valorInical + valorItemArray);

    System.out.println("The result of Sum this is: " + resultOfSum);
  }
}
