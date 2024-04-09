package view;

import java.util.Scanner;

// Classe Estudante
class Estudante {
    private String ra;
    private String nome;
    private String email;
    private float mediaNotas;
    private int qtdAprovacoes;

    // Construtor
    public Estudante(String ra, String nome, String email, float mediaNotas, int qtdAprovacoes) {
        this.ra = ra;
        this.nome = nome;
        this.email = email;
        this.mediaNotas = mediaNotas;
        this.qtdAprovacoes = qtdAprovacoes;
    }

    // Métodos Getters
    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public float getMediaNotas() {
        return mediaNotas;
    }

    public int getQtdAprovacoes() {
        return qtdAprovacoes;
    }

    // Método para calcular percentual de rendimento
    public float percentualRendimento() {
        return mediaNotas * qtdAprovacoes * 0.931f;
    }

    // Método para calcular percentual de progressão
    public float percentualProgressao() {
        return qtdAprovacoes / 3.0f;
    }
}

// Classe EstudanteTecnico, herda de Estudante
class EstudanteTecnico extends Estudante {
    public EstudanteTecnico(String ra, String nome, String email, float mediaNotas, int qtdAprovacoes) {
        super(ra, nome, email, mediaNotas, qtdAprovacoes);
    }

    // Sobrescrita do método percentualRendimento
    @Override
    public float percentualRendimento() {
        return super.percentualRendimento() * 0.972f;
    }

    // Sobrescrita do método percentualProgressao
    @Override
    public float percentualProgressao() {
        return super.percentualProgressao();
    }
}

// Classe EstudanteSuperior, herda de Estudante
class EstudanteSuperior extends Estudante {
    private String instituicaoSegundoGrau;
    private int anoConclusaoSegundoGrau;

    // Construtor
    public EstudanteSuperior(String ra, String nome, String email, float mediaNotas, int qtdAprovacoes, String instituicaoSegundoGrau, int anoConclusaoSegundoGrau) {
        super(ra, nome, email, mediaNotas, qtdAprovacoes);
        this.instituicaoSegundoGrau = instituicaoSegundoGrau;
        this.anoConclusaoSegundoGrau = anoConclusaoSegundoGrau;
    }

    // Método para calcular percentual de rendimento
    @Override
    public float percentualRendimento() {
        return super.percentualRendimento() * 0.972f;
    }

    // Método para calcular percentual de progressão
    @Override
    public float percentualProgressao() {
        return super.percentualProgressao() / 6.0f;
    }
}

// Classe View com método main para testar as operações
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados do estudante técnico:");
        System.out.print("RA: ");
        String raTecnico = scanner.nextLine();
        System.out.print("Nome: ");
        String nomeTecnico = scanner.nextLine();
        System.out.print("Email: ");
        String emailTecnico = scanner.nextLine();
        System.out.print("Media de Notas: ");
        float mediaNotasTecnico = scanner.nextFloat();
        System.out.print("Quantidade de Aprovacoes: ");
        int qtdAprovacoesTecnico = scanner.nextInt();

        EstudanteTecnico estudanteTecnico = new EstudanteTecnico(raTecnico, nomeTecnico, emailTecnico, mediaNotasTecnico, qtdAprovacoesTecnico);

        System.out.println("\nDigite os dados do estudante superior: ");
        System.out.print("RA: ");
        scanner.nextLine(); // Limpar o buffer do teclado
        String raSuperior = scanner.nextLine();
        System.out.print("Nome: ");
        String nomeSuperior = scanner.nextLine();
        System.out.print("Email: ");
        String emailSuperior = scanner.nextLine();
        System.out.print("Media de Notas: ");
        float mediaNotasSuperior = scanner.nextFloat();
        System.out.print("Quantidade de Aprovacoes: ");
        int qtdAprovacoesSuperior = scanner.nextInt();
        System.out.print("Instituição de Ensino Medio: ");
        scanner.nextLine(); // Limpar o buffer do teclado
        String instituicaoSegundoGrau = scanner.nextLine();
        System.out.print("Ano de Conclusão do Ensino Medio: ");
        int anoConclusaoSegundoGrau = scanner.nextInt();

        EstudanteSuperior estudanteSuperior = new EstudanteSuperior(raSuperior, nomeSuperior, emailSuperior, mediaNotasSuperior, qtdAprovacoesSuperior, instituicaoSegundoGrau, anoConclusaoSegundoGrau);

        // Exibir resultados
        System.out.println("\nResultados:");
        System.out.println("Percentual de Rendimento Estudante Tecnico: " + estudanteTecnico.percentualRendimento());
        System.out.println("Percentual de Progressão Estudante Tecnico: " + estudanteTecnico.percentualProgressao());
        System.out.println("Percentual de Rendimento Estudante Superior: " + estudanteSuperior.percentualRendimento());
        System.out.println("Percentual de Progressão Estudante Superior: " + estudanteSuperior.percentualProgressao());

        scanner.close();
    }
}
