import java.util.Random;

public class Libro {

    /*Atributos*/

    Random random = new Random();
    private Integer id;
    private String titulo;
    private String autor;
    private Integer numeroPagina;

    /*Constructor*/
    public Libro(Integer id, String titulo, String autor, Integer numeroPagina) {
        this.id = 0;
        this.random.nextInt(101);
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
    }

    /*Metodos, set y get*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(Integer numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    /*ToString*/

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPagina=" + numeroPagina +
                '}';
    }
}
