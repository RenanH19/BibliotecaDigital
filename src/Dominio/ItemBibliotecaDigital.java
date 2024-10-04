package Dominio;

import Interface.Baixavel;
import Interface.Visualizavel;

public abstract class ItemBibliotecaDigital implements Baixavel, Visualizavel {
    private String titulo;
    private String autorTitulo;

    public ItemBibliotecaDigital(String titulo, String autorTitulo) {
        this.titulo = titulo;
        this.autorTitulo = autorTitulo;
    }

    public abstract String descricao();

    @Override
    public abstract void baixar();

    @Override
    public void visualizar(){
        System.out.println("Esse item não pode ser visualizado \n" + descricao());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutorTitulo() {
        return autorTitulo;
    }

    public void setAutorTitulo(String autorTitulo) {
        this.autorTitulo = autorTitulo;
    }
}
