package org.eduardoguedes.streams.hand_ons;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapNameAndLenght {

  public static void main(String[] args) {
    List<String> names = List.of("Rouse", "Eduardo", "Jack");




    Map<String, Integer> mapList = names.stream()
            .collect(Collectors.toMap(name -> name,
                    name -> name.length()));

    System.out.println(mapList);

  }

  }
