package servicos;

import Dominio.ItemBibliotecaDigital;

import java.util.ArrayList;

public class Servico {
    public static void verDescricao(ArrayList<ItemBibliotecaDigital> itens) {
        for (ItemBibliotecaDigital item : itens) {
            System.out.println(item.descricao());
            System.out.println();
        }
    }

    public static void baixar(ArrayList<ItemBibliotecaDigital> itens) {
        for (ItemBibliotecaDigital item : itens) {
            item.baixar();
            System.out.println();

        }
    }

    public static void visualizar(ArrayList<ItemBibliotecaDigital> itens) {
        for (ItemBibliotecaDigital item : itens) {
            item.visualizar();
            System.out.println();

        }
    }
}


