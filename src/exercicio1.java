import java.util.Scanner;

public class exercicio1 {
    // Definindo o metódo para retornar uma nota float
    // private static float retornarNotaFloat(String nota) {
    // // Tranformando a string em float
    // float notaFloat = Float.parseFloat(nota);
    // // Validando a nota
    // if (notaFloat < 0 || notaFloat > 10) {
    // System.out.println("Nota1 inválida");
    // }
    // // Retornando a nota
    // return notaFloat;
    // }

    public static void main(String[] args) {
        // Definindo as variáveis de notas dos alunos
        String nomeAluno = "";
        Float mediaAluno = 0.0f;
        Float nota1 = 0.0f;
        Float nota2 = 0.0f;
        Float nota3 = 0.0f;
        Float nota4 = 0.0f;
        // Crio uma váriavel constante(IMUTÁVEL, pois está com o metódo final)
        final Float MEDIA = 6.0f;
        Boolean rodarNovamente = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do aluno: ");
        nomeAluno = scanner.nextLine();

        while (rodarNovamente) {
            try {
                System.out.println("Digite a sua primeira nota: ");
                nota1 = scanner.nextFloat();

                System.out.println("Digite a sua segunda nota: ");
                nota2 = scanner.nextFloat();

                System.out.println("Digite a sua terceira nota: ");
                nota3 = scanner.nextFloat();

                System.out.println("Digite a sua quarta nota: ");
                nota4 = scanner.nextFloat();

                mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;
            } catch (Exception error) {
                System.out.println("Error: " + error.getMessage());
                scanner.nextLine();
                System.out.println("Reinicindo o cálculo da nota...");
                continue;
            }

            if (mediaAluno > MEDIA) {
                System.out.println("Aluno " + nomeAluno + "aprovado, média " + String.format("%.2f", mediaAluno));
            } else if (mediaAluno == MEDIA) {
                System.out.println("Aluno " + nomeAluno + "passou na média " + String.format("%.2f", mediaAluno));
            } else {
                System.out.println("Aluno " + nomeAluno + "reprovado, média " + String.format("%.2f", mediaAluno));
            }
            System.out.println("Deseja calcular outra média? (S/N)");

            String resposta = scanner.next();
            scanner.nextLine();
            if (resposta.equals("S") || resposta.equals("s")
                    || resposta.equals("Sim") || resposta.equals("sim")) {
                System.out.println("Reiniciando o cálculo da nota...");
                continue;
            }
            System.out.println("Encerrando o programa...");
            scanner.close();
            break;
        }
    }
}