package poo;

public class Loja {
    String nome;
    String endereco;

    public Loja(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void LojaAberta() {
        System.out.println("Loja aberta\n");
    }

    public void LojaFechada() {
        System.out.println("Loja fechada\n");
    }
}
