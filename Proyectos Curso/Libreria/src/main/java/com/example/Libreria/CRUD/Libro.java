package com.example.Libreria.CRUD;

public class Libro {

    int id;
    String titulo;
    String autor;
    String isbn;
    int paginas;
    double precio;

    public Libro() {
    }

    public Libro(String titulo, String autor, String isbn, int paginas, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", paginas=" + paginas +
                ", precio=" + precio +
                '}';
    }
}
