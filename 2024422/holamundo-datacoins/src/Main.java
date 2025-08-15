
import java.util.Scanner;
import org.datacoins.Uno;
import org.datacoins.Dos;
import org.datacoins.Tres;

public class Main {
    public static void main(String[] args) {
        boolean a = false;
        do {
            System.out.printf("Bienvenido al listado de actividades\n");
            Scanner sc = new Scanner(System.in);
            System.out.println("0.Cerrar el programa");
            System.out.println("1.Numeros pares");
            System.out.println("2.Numero primo");
            System.out.println("3.Numero aleatorio");
            System.out.println("4.Conversion grados");
            System.out.println("5.CRUD");
            System.out.println("6.Lo de la DB");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Uno uno = new Uno();
                    uno.EjercicioUno();
                    break;
                case 2:
                    Dos dos = new Dos();
                    dos.EjerciciosDos();
                    break;
                case 3:
                    Tres tres = new Tres();
                    tres.EjercicioTres();

                    break;
                case 4:


                    break;
                case 5:

                    break;
                case 6:

                    break;
            }
        } while (!a);
    }
}