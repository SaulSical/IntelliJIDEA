package org.datacoins;
import java.util.Scanner;


public class Dos {
    Scanner sc = new Scanner(System.in);
    public void EjerciciosDos(){
        System.out.println("Ingrese su número");
        int numero = sc.nextInt();
        int contador = 0;

        for (int i=1; i<numero;i++){
            double resultado = numero%i;
            if (i == 0){
                contador = contador+1;
            }
        }

        if (contador == 2){
            System.out.println("El numero no es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
}
