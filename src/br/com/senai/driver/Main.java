package br.com.senai.driver;

import br.com.senai.object.Biblioteca;
import br.com.senai.object.Livro;
import br.com.senai.object.Revista;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605, "Romance");
        Revista revista1 = new Revista("National Geographic", "Vários", 2023, 5);

        biblioteca.adicionarItem(livro1);
        biblioteca.adicionarItem(revista1);

        biblioteca.mostrarItens();
        biblioteca.buscarPorTitulo("Dom Quixote");
        biblioteca.buscarPorTitulo("Matemática","Java");
    }
}