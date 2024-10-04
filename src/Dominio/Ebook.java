package Dominio;

import Interface.Baixavel;

public class Ebook extends ItemBibliotecaDigital{

    public Ebook(String titulo, String autorTitulo) {
        super(titulo, autorTitulo);
    }

    @Override
    public String descricao() {
        return "Título: " + getTitulo() + " \n" +
                " Autor: " + getAutorTitulo();
    }

    @Override
    public void baixar(){
        System.out.println("Baixando ebook... " + getTitulo());
    }
}
