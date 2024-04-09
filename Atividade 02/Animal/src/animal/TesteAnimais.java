package animal;

class Animal {
    private String nome;
    private int comprimento;
    int patas;
    String cor;
    String ambiente;
    private float velocidade;

    public Animal() {
        this.patas = 4;
        this.ambiente = "Terra";
    }

    public void dados() {

        System.out.println("Animal: " + nome);
        System.out.println("Comprimento: " + comprimento + " cm");
        System.out.println("Patas: " + patas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade: " + velocidade + " m/s ");
        System.out.println("\n");
    }

    public void alteraNome(String nome) {
        this.nome = nome;
    }

    public void alteraComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void alteraCor(String cor) {
        this.cor = cor;
    }

    public void alteraVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
}

class Peixe extends Animal {
    private String caracteristica;

    public Peixe() {
        super();
        this.patas = 0;
        this.ambiente = "Mar";
        this.cor = "Cinzento";
    }

    @Override
    public void dados() {
        super.dados();
        System.out.println("Caracteristica: " + caracteristica);
    }

    public void alteraCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
}

class Mamifero extends Animal {
    private String alimento;

    public Mamifero() {
        super();
    }

    @Override
    public void dados() {
        super.dados();
        System.out.println("Alimento: " + alimento);
    }

    public void alteraAlimento(String alimento) {
        this.alimento = alimento;
    }
}

public class TesteAnimais {

    public static void main(String[] args) {
        Animal camelo = new Animal();
        camelo.alteraNome("Camelo");
        camelo.alteraComprimento(150);
        camelo.alteraCor("Amarelo");
        camelo.alteraVelocidade(2.0f);

        Peixe tubarao = new Peixe();
        tubarao.alteraNome("Tubarao");
        tubarao.alteraComprimento(300);
        tubarao.alteraCor("Cinzento");
        tubarao.alteraVelocidade(1.5f);
        tubarao.alteraCaracteristica("Barbatanas e cauda");

        Mamifero ursoCanada = new Mamifero();
        ursoCanada.alteraNome("Urso-do-canada");
        ursoCanada.alteraComprimento(180);
        ursoCanada.alteraCor("Vermelho");
        ursoCanada.alteraVelocidade(0.5f);
        ursoCanada.alteraAlimento("Mel");

        System.out.println("Zoo:");
        camelo.dados();
        tubarao.dados();
        ursoCanada.dados();
    }
}
