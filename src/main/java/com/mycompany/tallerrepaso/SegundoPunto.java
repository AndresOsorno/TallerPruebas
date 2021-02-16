package com.mycompany.tallerrepaso;

import java.util.Scanner;

public class SegundoPunto {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String palabra;
        int in,fn;
        boolean palindromo;
        
        System.out.println("Se permiten puntos, comas y espacios");
        System.out.println("Ingrese la palabra: ");
        palabra = leer.nextLine();
        
        palabra = palabra.replace(" ", "");
        palabra = palabra.replace(",", "");
        palabra = palabra.replace(".", "");
        
        fn = palabra.length()-1;
        in = 0;
        palindromo = true;
        
        while (in<fn) {
            if (palabra.charAt(in) != palabra.charAt(fn)){
                palindromo = false;
            }
            in++;
            fn--;
        }
        
        if (palindromo){
            System.out.println("La plabra esta clasificada como Palindromo");
        } else {
            System.out.println("La palabra no aplica para ser palindromo");
        }
        
    }
    
}
