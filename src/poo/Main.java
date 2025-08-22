package poo;

public class Main {
    public static void main(String[] args) {
        LojaEletronico loja = new LojaEletronico("Loja do Luis e Izadora", "Conjunto Salinas e Sapiranga");
        // loja.setNome("Loja do Luis e Izadora");
        // loja.setEndereco("Conjunto Salinas e Sapiranga");
        loja.LojaAberta();
        loja.LojaFechada();

        // loja.exibirDetalhesLoja();
        System.out.println(loja.getNome());
        System.out.println(loja.getEndereco());
    }
}
