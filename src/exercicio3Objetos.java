public class exercicio3Objetos {
    String marca;
    String modelo;
    String sos;
    float preco;
    boolean ligado;

    public exercicio3Objetos(String marca, String modelo, String sos, float preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.sos = sos;
        this.preco = preco;
    }

    public String getComputador() {
        return marca + " " + modelo + " " + sos + " " + preco;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }
}

