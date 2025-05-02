package org.eduardoguedes.streams.hand_ons;

import java.util.List;

public class FilterName {

  public static void main(String[] args) {
    List<String> names = List.of("Adriel", "Eduardo", "Amnadiel");

    names.stream().filter(name -> name.startsWith("A")).
            forEach(name -> System.out.println("Name: " + name));


  }
}
