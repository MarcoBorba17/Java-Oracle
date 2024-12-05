package br.com.senai.object;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<ItemBiblioteca> itens;

    public Biblioteca() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(ItemBiblioteca item) {
        itens.add(item);
    }

    public void mostrarItens() {
        for (ItemBiblioteca item : itens) {
            item.mostrarDetalhes();
        }
    }

    // Sobrecarga de métodos
    public void buscarPorTitulo(String titulo) {
        for (ItemBiblioteca item : itens) {
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                item.mostrarDetalhes();
            }
        }
    }

    public void buscarPorTitulo(String titulo1, String titulo2) {
        for (ItemBiblioteca item : itens) {
            if (item.getAutor().equalsIgnoreCase(titulo1) || item.getAutor().equalsIgnoreCase(titulo2)) {
                item.mostrarDetalhes();
            }
        }
    }
}