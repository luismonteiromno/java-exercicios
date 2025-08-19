public class LojaEletronicoInterface implements Interface{
    String nome;
    String cnpj;

    public LojaEletronicoInterface(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    @Override
    public void lojaAberta() {
        System.out.println("Loja aberta\n");
    }

    @Override
    public void lojaFechada() {
        System.out.println("Loja fechada\n");
    }

    @Override
    public void exibirDetalhesLoja() {
        System.out.println("Nome da loja: " + nome + "\n CNPJ: " + cnpj);
    }
}
