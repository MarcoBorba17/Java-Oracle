package br.com.senai.object;

public class Livro extends ItemBiblioteca {
    private String genero;

    public Livro(String genero) {
        this.genero = genero;
    }

    public Livro(String titulo, int anoPublicacao, String autor, String genero) {
        super(titulo, anoPublicacao, autor);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("Gênero: " + getGenero());
    }
