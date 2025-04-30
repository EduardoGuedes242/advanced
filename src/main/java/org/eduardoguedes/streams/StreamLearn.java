package org.eduardoguedes.streams;

import java.util.List;

public class StreamLearn {


  public static void main(String[] args) {
    List<String> names = List.of("Bruno", "Jack", "Ivo", "Eva");

    List<String> namesWithMoreThanThreeLetters = names.stream()
            .filter(name -> name.length() > 3)
            .toList();

    System.out.println("=== ORIGINAL NAME LIST ===");
    names.forEach(name -> System.out.println("Name: " + name));

    System.out.println("=== NAMES WITH MORE THAN 3 LETTERS ===");
    namesWithMoreThanThreeLetters.forEach(name -> System.out.println("Name: " + name));
  }

}
