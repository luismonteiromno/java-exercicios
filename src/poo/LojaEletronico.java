package poo;


public class LojaEletronico extends Loja{

    public LojaEletronico(String nome, String endereco) {
        super(nome, endereco);
    }

    public void exibirDetalhesLoja() {
        System.out.println("Nome da loja: " + nome + "\nEndereço: " + endereco);
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
