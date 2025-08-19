
public class Main {
    public static void main(String[] args) {
        LojaEletronicoInterface loja = new LojaEletronicoInterface(
            "Loja de teste com interface",
            "123.456.789/0001-00"
        );
        loja.lojaAberta();
        loja.lojaFechada();
        loja.exibirDetalhesLoja();
    }
}
