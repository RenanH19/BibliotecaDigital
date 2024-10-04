package Teste;

import Dominio.Ebook;
import Dominio.ItemBibliotecaDigital;
import Dominio.VideoDigital;
import servicos.Servico;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Ebook ebook001 = new Ebook("21 liçoes para o século XXI", "Yuval Noah Harari");
        Ebook ebook002 = new Ebook("Medicina dos horrores", "Lindsey Fitzherry");
        Ebook ebook003 = new Ebook("Hábitos Atômicos", "James Clear");
        VideoDigital video001 = new VideoDigital("Me at the zoo", "jawed");
        VideoDigital video002 = new VideoDigital("Iphone 1", "Protecterstar Inc.");

        ArrayList<ItemBibliotecaDigital> itens = new ArrayList<>();
        itens.add(ebook001);
        itens.add(ebook002);
        itens.add(ebook003);
        itens.add(video001);
        itens.add(video002);

        Servico.verDescricao(itens);
        Servico.visualizar(itens);
        Servico.baixar(itens);
    }
}