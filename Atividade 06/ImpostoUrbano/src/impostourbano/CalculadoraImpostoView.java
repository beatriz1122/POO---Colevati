package impostourbano;

public class CalculadoraImpostoView {
    public static void main(String[] args) {
        CalculadoraImpostoContext saoPaulo = new CalculadoraImpostoContext(new CalculadoraImpostoSaoPaulo());
        CalculadoraImpostoContext beloHorizonte = new CalculadoraImpostoContext(new CalculadoraImpostoBeloHorizonte());
        CalculadoraImpostoContext portoAlegre = new CalculadoraImpostoContext(new CalculadoraImpostoPortoAlegre());
        CalculadoraImpostoContext curitiba = new CalculadoraImpostoContext(new CalculadoraImpostoCuritiba());

        double impostoSaoPaulo = saoPaulo.calcularImposto(100, 5, 3, 0, 30);
        double impostoBeloHorizonte = beloHorizonte.calcularImposto(100, 5, 3, 0, 30);
        double impostoPortoAlegre = portoAlegre.calcularImposto(100, 5, 3, 20, 30);
        double impostoCuritiba = curitiba.calcularImposto(100, 5, 3, 0, 30);

        System.out.println("Imposto em São Paulo: R$" + impostoSaoPaulo);
        System.out.println("Imposto em Belo Horizonte: R$" + impostoBeloHorizonte);
        System.out.println("Imposto em Porto Alegre: R$" + impostoPortoAlegre);
        System.out.println("Imposto em Curitiba: R$" + impostoCuritiba);
    }
}
