import java.util.Scanner;

public class Circulo {
	
 public static void main(String args[]){
double perimetro;
double area;

  Scanner entrada = new Scanner(System.in);

  System.out.print("Raio? ");
  
  double raio = entrada.nextDouble();
  area = Math.PI * raio * raio;
  perimetro = 2 * Math.PI * raio;
  
  System.out.printf("Area ="+area+"   Perimetro ="+perimetro);
 }
}