/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quadrilateros;

import java.util.Scanner;

abstract class Quadrilatero {
    private float base;
    private float altura;

    public Quadrilatero(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public abstract float calcArea();

    public float calcPerimetro() {
        return 2 * (base + altura);
    }
}

class Paralelogramo extends Quadrilatero {
    public Paralelogramo(float base, float altura) {
        super(base, altura);
    }

    @Override
    public float calcArea() {
        return getBase() * getAltura();
    }
}

class Trapezio extends Quadrilatero {
    private float baseMenor;

    public Trapezio(float base, float altura, float baseMenor) {
        super(base, altura);
        this.baseMenor = baseMenor;
    }

    public float getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(float baseMenor) {
        this.baseMenor = baseMenor;
    }

    @Override
    public float calcArea() {
        return (getBase() + baseMenor) * getAltura() / 2;
    }
}

public class TesteQuadrilatero {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite a base do quadrilatero:");
            float base = scanner.nextFloat();
            System.out.println("Digite a altura do quadrilatero:");
            float altura = scanner.nextFloat();
            
            Quadrilatero quadrilatero = new Paralelogramo(base, altura);
            System.out.println("Area: " + quadrilatero.calcArea());
            System.out.println("Peremetro: " + quadrilatero.calcPerimetro());
            
            System.out.println("\n Digite a base menor do trapezio:");
            float baseMenor = scanner.nextFloat();
            
            Quadrilatero trapezio = new Trapezio(base, altura, baseMenor);
            System.out.println("Área: " + trapezio.calcArea());
            System.out.println("Perímetro: " + trapezio.calcPerimetro());
        }
    }
}
