package br.com.senai.object;

abstract class ItemBiblioteca {
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;

    public ItemBiblioteca() {}

    public ItemBiblioteca(String titulo, int anoPublicacao, String autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
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

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    // Método abstrato para mostrar detalhes
    public abstract void mostrarDetalhes();

}
