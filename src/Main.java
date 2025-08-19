public class Main {
    public static void main(String[] args) {
       exercicio3Objetos computador = new exercicio3Objetos("Acer", "Nitro 5", "Linux", 5000);
       computador.ligar();
       computador.desligar();
       System.out.println(computador.getComputador());
    }
}
