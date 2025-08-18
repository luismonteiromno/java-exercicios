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

        
        System.out.println("Digite a sua primeira nota: ");
        nota1 = Float.parseFloat(System.console().readLine());

        System.out.println("Digite a sua segunda nota: ");
        nota2 = Float.parseFloat(System.console().readLine());

        System.out.println("Digite a sua terceira nota: ");
        nota3 = Float.parseFloat(System.console().readLine());

        System.out.println("Digite a sua quarta nota: ");
        nota4 = Float.parseFloat(System.console().readLine());

        media_aluno = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media_aluno > MEDIA) {
            System.out.println("Aluno aprovado, média " + media_aluno);
        } else if (media_aluno == MEDIA) {
            System.out.println("Aluno passou na média " + media_aluno);
        } else {
            System.out.println("Aluno reprovado, média " + media_aluno);
        }

    }
}