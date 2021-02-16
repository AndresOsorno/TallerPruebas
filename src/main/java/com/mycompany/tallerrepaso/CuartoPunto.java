package com.mycompany.tallerrepaso;

import java.util.Scanner;

public class CuartoPunto {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int base, expo,res=0,btemp=0;
        
        System.out.println("Por favor digita la base ");
        base = leer.nextInt();
        System.out.println("Por favor digita el exponente");
        expo = leer.nextInt();
        btemp=base;
        
        for (int i =1 ; i < expo; i++) {
            int suma = 0;
            
            for (int j = 0; j <base; j++) {
                suma = suma + btemp;
                 res = suma;
            }
            btemp = res;
        }
        System.out.println("El resultado es " + btemp);

    }

}
