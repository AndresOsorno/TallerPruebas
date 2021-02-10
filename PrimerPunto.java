package com.mycompany.tallerrepaso;

import java.util.Scanner;

public class PrimerPunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n,i,temp=0,f;
        int[] numeros;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Cuantos numeros deseas digitar:");
        n = leer.nextInt();
        numeros = new int[n];
        
        for (i=0; i < numeros.length; i++){
            System.out.println("Digite el numero en la posicion "+(i+1));
            numeros[i] = leer.nextInt();
        }
        
        for (f=0; f < numeros.length; f++){
            if (temp<numeros[f]){
                temp = numeros[f];
            }
        }
        
        System.out.println("El numero mayor es: "+temp);
    }
    
}
