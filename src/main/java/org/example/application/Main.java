package org.example.application;

import org.example.model.Cliente;
import org.example.model.Trabajador;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Cliente(21, "Juan", "1234", 15.0));
        System.out.println(new Trabajador(20, "pedro", "212342324", 20.0));
    }
}