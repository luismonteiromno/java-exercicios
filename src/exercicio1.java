public class exercicio1 {
    public static void main(String[] args) {
        // Definindo as variáveis de notas dos alunos
        Float media_aluno = 0.0f;
        Float nota1 = 0.0f;
        Float nota2 = 0.0f;
        Float nota3 = 0.0f;
        Float nota4 = 0.0f;
        // Crio uma váriavel constante(IMUTÁVEL, pois está com o metódo final)
        final Float MEDIA = 6.0f;
        Boolean rodarNovamente = true;

        while (rodarNovamente){
            System.out.println("Digite a sua primeira nota: ");
            nota1 = Float.parseFloat(System.console().readLine());

            if (nota1 < 0 || nota1 > 10) {
                System.out.println("Nota1 inválida");
            }

            System.out.println("Digite a sua segunda nota: ");
            nota2 = Float.parseFloat(System.console().readLine());

            if (nota2 < 0 || nota2 > 10) {
                System.out.println("Nota2 inválida");
            }

            System.out.println("Digite a sua terceira nota: ");
            nota3 = Float.parseFloat(System.console().readLine());

            if (nota3 < 0 || nota3 > 10) {
                System.out.println("Nota3 inválida");
            }

            System.out.println("Digite a sua quarta nota: ");
            nota4 = Float.parseFloat(System.console().readLine());

            if (nota4 < 0 || nota4 > 10) {
                System.out.println("Nota4 inválida");
            }

            media_aluno = (nota1 + nota2 + nota3 + nota4) / 4;

            if (media_aluno > MEDIA) {
                System.out.println("Aluno aprovado, média " + media_aluno);
                System.out.println("Deseja calcular outra média? (S/N)");

                String resposta = System.console().readLine();
                if (
                    resposta.equals("S") || resposta.equals("s") 
                    || resposta.equals("Sim") || resposta.equals("sim")
                ) {
                    continue;
                }
                break;

            } else if (media_aluno == MEDIA) {
                System.out.println("Aluno passou na média " + media_aluno);

                System.out.println("Deseja calcular outra média? (S/N)");
                String resposta = System.console().readLine();
                if (
                    resposta.equals("S") || resposta.equals("s") 
                    || resposta.equals("Sim") || resposta.equals("sim")
                ) {
                    continue;
                }
                break;
                
            } else {
                System.out.println("Aluno reprovado, média " + media_aluno);

                System.out.println("Deseja calcular outra média? (S/N)");
                String resposta = System.console().readLine();
                if (
                    resposta.equals("S") || resposta.equals("s") 
                    || resposta.equals("Sim") || resposta.equals("sim")
                ) {
                    continue;
                }
                break;
            }
        }
    }
}