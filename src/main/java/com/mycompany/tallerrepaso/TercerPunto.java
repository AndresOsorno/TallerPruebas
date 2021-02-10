package com.mycompany.tallerrepaso;

import java.util.Scanner;

public class TercerPunto {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n1, n2, res = 0;
        
        System.out.println("Por favor digita el numero que deseas multiplicar: ");
        n1 = leer.nextInt();
        System.out.println("Cuantas veces deseas multiplicarlo");
        n2 = leer.nextInt();
        
        int i;
        for (i=0;i<n2;i++){
            res = (res+n1);
        }
        
        System.out.println("La solucion es:  "+res);
        
    }
    
}
