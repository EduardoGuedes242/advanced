package org.eduardoguedes.streams.hand_ons;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {


  public static void main(String[] args) {
    List<String> names = List.of("Rouse", "Eduardo", "Jack", "Bruno");

    Map<Integer, List<String>> groupBy = names.stream()
            .collect(Collectors.groupingBy(name -> name.length()));

    System.out.println(groupBy);

  }

}
