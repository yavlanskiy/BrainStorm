package com.example;

import java.io.File;
import java.util.Optional;

public class Operation {
    public static void main(String[] args) {
        System.out.println(Operation.class.getPackage().getName());
        System.out.println(new File("").toURI());
    }
}
