package Dominio;

import Interface.Baixavel;
import Interface.Visualizavel;

public class VideoDigital extends ItemBibliotecaDigital {

    public VideoDigital(String titulo, String autorTitulo) {
        super(titulo, autorTitulo);
    }

    @Override
    public String descricao() {
        return "Título: " + getTitulo() + " \n" +
                " Autor: " + getAutorTitulo();
    }

    @Override
    public void baixar(){
        System.out.println("Baixando o ebook... \n" + getTitulo() );
    }

    @Override
    public void visualizar(){
        System.out.println("Visualizando vídeo... \n" + getTitulo());
    }
}
