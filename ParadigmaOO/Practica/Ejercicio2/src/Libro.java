// Clase que representa un libro
public class Libro {
    private int codigo;
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(int codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void marcarComoNoDisponible() {
        disponible = false;
    }

    public void marcarComoDisponible() {
        disponible = true;
    }
}
