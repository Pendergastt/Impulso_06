package org.example;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private String isbn;
    private int paginas;
    private double precio;

    public Libro(){};

    public Libro(String titulo, String autor, String isbn, int paginas, double precio){
        this.titulo=titulo;
        this.autor=autor;
        this.isbn=isbn;
        this.paginas=paginas;
        this.precio=precio;
    }

    public int getId(){
        return id;
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
}
