import java.util.Scanner;

public class exercicio1 {
    // Definindo o metódo para retornar uma nota float
    // private static float retornarNotaFloat(String nota) {
    //     // Tranformando a string em float
    //     float notaFloat = Float.parseFloat(nota);
    //     // Validando a nota
    //     if (notaFloat < 0 || notaFloat > 10) {
    //         System.out.println("Nota1 inválida");
    //     }
    //     // Retornando a nota
    //     return notaFloat;
    // }

    public static void main(String[] args) {
        // Definindo as variáveis de notas dos alunos
        Float mediaAluno = 0.0f;
        Float nota1 = 0.0f;
        Float nota2 = 0.0f;
        Float nota3 = 0.0f;
        Float nota4 = 0.0f;
        // Crio uma váriavel constante(IMUTÁVEL, pois está com o metódo final)
        final Float MEDIA = 6.0f;
        Boolean rodarNovamente = true;

        Scanner scanner = new Scanner(System.in);

        while (rodarNovamente){
            System.out.println("Digite a sua primeira nota: ");
            nota1 = scanner.nextFloat();

            System.out.println("Digite a sua segunda nota: ");
            nota2 = scanner.nextFloat();

            System.out.println("Digite a sua terceira nota: ");
            nota3 = scanner.nextFloat();

            System.out.println("Digite a sua quarta nota: ");
            nota4 = scanner.nextFloat();

            mediaAluno = (nota1 + nota2 + nota3 + nota4) / 4;

            if (mediaAluno > MEDIA) {
                System.out.println("Aluno aprovado, média " + mediaAluno);
            } else if (mediaAluno == MEDIA) {
                System.out.println("Aluno passou na média " + mediaAluno);
            } else {
                System.out.println("Aluno reprovado, média " + mediaAluno);
            }
            System.out.println("Deseja calcular outra média? (S/N)");

            String resposta = scanner.next();
            scanner.nextLine();
            if (
                resposta.equals("S") || resposta.equals("s") 
                || resposta.equals("Sim") || resposta.equals("sim")
            ) {
                System.out.println("Reiniciando o cálculo da nota...");
                continue;
            }
            System.out.println("Encerrando o programa...");
            break;
        }
    }
}