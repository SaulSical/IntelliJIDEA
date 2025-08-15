package org.datacoins;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Tres {
    Scanner sc = new Scanner (System.in);
    Random dado = new Random();

    public void EjercicioTres(){
        System.out.println("BIENVENIDO AL ADIVINADOR DE NUMERO");
        System.out.println("Tiene 3 Oportunidades");

        for (int contador = 1; contador<=3; contador++){
            System.out.println("Este es tu intento: "+contador);
            System.out.println("Ingrese su numero");
            int numero = sc.nextInt();
            int ale = dado.nextInt(11);
            int pista = ale-numero;
            if (numero==ale){

                System.out.println("CORRECTOOOOOO!!! LE ACERTASTE");
                System.out.println("EL numero era: "+ale);
                contador=3;
            }else{
                System.out.println("Ohhh no el numero no es ese");

                if(pista>0){
                    System.out.println("El numero es mas pequeño");
                }else{
                    System.out.println("el numero es mas Grande");
                }
            }
        }


    }
}
