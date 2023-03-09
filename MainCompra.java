package poo;

public class MainCompra {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.Cliente = "katia";
        compra1.itens.add(new Item("Caneta Azul", 20, 7.5));
        compra1.itens.add(new Item("Borracha", 12, 3.20));
        compra1.itens.add(new Item("Caderno", 2, 20.45));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.valorTotal());
    }
}
