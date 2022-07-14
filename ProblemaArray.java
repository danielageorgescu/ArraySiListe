package com.itfactory;

import java.util.Scanner;

public class ProblemaArray {

    public static void main(String[] args) {
        String[] stringDeLaTastatura = new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un top 5 de bauturi preferate:");
        stringDeLaTastatura[0] = scanner.nextLine();
        stringDeLaTastatura[1] = scanner.nextLine();
        stringDeLaTastatura[2] = scanner.nextLine();
        stringDeLaTastatura[3] = scanner.nextLine();
        stringDeLaTastatura[4] = scanner.nextLine();


        for (int i = 0; i < stringDeLaTastatura.length; i++) {
            System.out.println(stringDeLaTastatura[i]);
        }
        String[] citireInversa = {stringDeLaTastatura[4], stringDeLaTastatura[3], stringDeLaTastatura[2], stringDeLaTastatura[1], stringDeLaTastatura[0]};

        for (int y = 0; y < citireInversa.length; y++) {
            System.out.println(citireInversa[y]);
        }
    }
}
