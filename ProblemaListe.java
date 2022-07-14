package com.itfactory;

import java.util.*;

public class ProblemaListe {


    public static void main(String[] args) {
        List<Integer> randomList = new ArrayList<>(51);
        Random random = new Random();
        Integer randomInt = null;
        Integer numaratoare;
        {
            numaratoare = 0;
            while (numaratoare != 10) {
                randomInt = 1 + random.nextInt(15);
                System.out.print(randomInt + " ");
                numaratoare++;
                if (numaratoare == 10) {
                    System.out.println("Am intalnit 10");
                    break;
                }
                randomList.add(randomInt);
              }
            randomList.add(randomInt);
            System.out.println(randomList);
        }

        if (!randomList.isEmpty()){
            System.out.println("Lista nu este goala");
        }

        System.out.println("Numarul 5 apare de "+ Collections.frequency(randomList, 5)+ " dati.");
    }
}



