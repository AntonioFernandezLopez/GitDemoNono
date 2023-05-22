/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorademo;

/**
 *
 * @author Antonio <2860075@alu.murciaeduca.es>
 */
public class Practica1 {
    public static int calculo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número " + n + " no puede ser < que 0");
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        if (fact < 0) {
            throw new ArithmeticException("Overflow, núemro " + n + " demasiado grande");
        }
        return fact;
    }

}
