import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca{
    Scanner scanner = new Scanner(System.in);

    /*Atributo (ArrayList<>)*/
    private ArrayList<Libro> libros;

    /*Metodos*/
    public Biblioteca(){
        this.libro = new ArrayList<Libro>();
    }

    public Biblioteca(){
        this.libros = new ArrayList<Libro>();
    }

    /*
    a) Alcance
    b) Tipo de retorno
    c) nombre del metodo
    d) Parametros (si no recibe parametros igual van los parentesis)
    */

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.print("Libro agregado." + libro.toString());
    }

    public Libro buscarLibro(String titulo) {}

    public void listarTodos(){}

    public void crearLibro(){
        System.out.printf("Ingresa el titulo del libro");
        String titulo = scanner.nextLine();

        System.out.printf("Ingresa el autor del titulo");
        String autor = scanner.nextLine();

        System.out.printf("Ingresa la cantidad de paginas");
        Integer numeroPagina = scanner.nextInt();

        Libro nuevoLibro = new Libro(titulo,autor,numeroPagina);
        libros.add(nuevoLibro);
    }


}

