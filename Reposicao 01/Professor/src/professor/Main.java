
package professor;

import java.util.Scanner;



class Professor {
    private String nome;
    private String matricula;
    private int idade;

    public Professor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double calcSalario() {
        // A ser implementado pelas subclasses
        return 0.0;
    }
}





class ProfessorHorista extends Professor {
    private int horasAula;
    private double valorHoraAula;

    public ProfessorHorista() {
    }

    public int getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public double calcSalario() {
        return horasAula * valorHoraAula;
    }
}






class ProfessorTitular extends Professor {
    private int anosInstituicao;
    private double salario;
    
    public ProfessorTitular() {
    }

    public int getAnosInstituicao() {
        return anosInstituicao;
    }

    public void setAnosInstituicao(int anosInstituicao) {
        this.anosInstituicao = anosInstituicao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcSalario() {
        // Incrementa 5% para cada 5 anos de instituição
        double incremento = (anosInstituicao / 5) * 0.05;
        return salario * (1 + incremento);
    }
}




public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os dados do professor titular:");
        ProfessorTitular professorTitular = new ProfessorTitular();
        System.out.print("Nome: ");
        professorTitular.setNome(scanner.nextLine());
        System.out.print("Matricula: ");
        professorTitular.setMatricula(scanner.nextLine());
        System.out.print("Idade: ");
        professorTitular.setIdade(Integer.parseInt(scanner.nextLine()));
        System.out.print("Anos na instituicao: ");
        professorTitular.setAnosInstituicao(Integer.parseInt(scanner.nextLine()));
        System.out.print("Salario: ");
        professorTitular.setSalario(Double.parseDouble(scanner.nextLine()));

        System.out.println("Informe os dados do professor horista:");
        ProfessorHorista professorHorista = new ProfessorHorista();
        System.out.print("Nome: ");
        professorHorista.setNome(scanner.nextLine());
        System.out.print("Matricula: ");
        professorHorista.setMatricula(scanner.nextLine());
        System.out.print("Idade: ");
        professorHorista.setIdade(Integer.parseInt(scanner.nextLine()));
        System.out.print("Horas de aula: ");
        professorHorista.setHorasAula(Integer.parseInt(scanner.nextLine()));
        System.out.print("Valor da hora aula: ");
        professorHorista.setValorHoraAula(Double.parseDouble(scanner.nextLine()));

    
        
        
        System.out.println("Salario do professor titular: " + professorTitular.calcSalario());
        System.out.println("Salario do professor horista: " + professorHorista.calcSalario());

        scanner.close();
    }
}
