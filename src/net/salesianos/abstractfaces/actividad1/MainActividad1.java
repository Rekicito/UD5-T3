package net.salesianos.abstractfaces.actividad1;

import java.util.Scanner;

public class MainActividad1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // RECTANGULO

        System.out.println("=== RECTANGULO ===");

        System.out.print("Introduce la base: ");
        double base = sc.nextDouble();

        System.out.print("Introduce la altura: ");
        double altura = sc.nextDouble();

        Rectangulo rectangulo = new Rectangulo(base, altura);

        System.out.println("\nDatos del rectángulo:");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());

        // CIRCULO

        System.out.println("\n=== CIRCULO ===");

        System.out.print("Introduce el radio: ");
        double radio = sc.nextDouble();

        Circulo circulo = new Circulo(radio);

        System.out.println("\nDatos del círculo:");
        System.out.println("Radio: " + radio);
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        sc.close();
    }
}