package poo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p, int quant) {
        this.itens.add(new Item(p, quant));
    }

    void adicionarItem(String nome, double preco, int quant) {
        this.itens.add(new Item(new Produto(nome, preco), quant));
    }

    double obterValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;

    }
}
