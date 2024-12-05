package br.com.senai.object;

public class Revista extends ItemBiblioteca {
    private int edicao;

    public Revista(int edicao) {
        this.edicao = edicao;
    }

    public Revista(String titulo, int anoPublicacao, String autor, int edicao) {
        super(titulo, anoPublicacao, autor);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public void mostrarDetalhes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("Edição: " + getEdicao());
}
