import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numero = new ArrayList<Integer>();
        Libro libro = new Libro();

        System.out.print(libro.toString());

        /*
        PASOS
        a) Para instanciar un objeto o una variable
        b) Tipo de dato o clase
        c) Nombre o etiqueta que le voy a dar
         El valor despues del = (importante que cuando estoy instanciando un nuevo objeto, se usa la palabra reservada new
         Entre los parentesis los parametros especificado en el constructor).
        */

        Biblioteca biblioteca = new Biblioteca();
        int opcion;

        System.out.printf("\n---Menu de la biblioteca---");
        System.out.printf("1- Agregar un nuevo libro");
        System.out.printf("2- Buscar libro");
        System.out.printf("3- Ver todos los libros");
        System.out.printf("4- Salir");
        opcion = scanner.nextInt();
        scanner.nextLine();

    }
}