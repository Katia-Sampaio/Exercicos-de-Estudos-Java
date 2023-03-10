package poo.desafio;

public class Sistema {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana maria Braga");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 9.67, 100);
        compra1.adicionarItem(new Produto("Notebook", 3000.80), 1);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 28.00, 10);
        compra2.adicionarItem(new Produto("Impressora", 900.80), 2);

        cliente.compras.add(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());
    }
}
