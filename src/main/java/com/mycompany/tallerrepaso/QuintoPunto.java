package com.mycompany.tallerrepaso;

import java.util.Scanner;

public class QuintoPunto {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n, res = 1;
        System.out.println("Digite el numero que le desea sacar factorial: ");
        n = leer.nextInt();
        
        int i;
        for (i=0;i<n;i++){
            res = res * (i+1);
        }
        
        System.out.println("Factorial de "+n+" es: "+res);
        
    }
    
}
