package net.salesianos.abstractfaces.actividad2;

public class MainActividad2 {

    public static void main(String[] args) {

        CocheCombustion coche = new CocheCombustion(
                "Rojo",
                5,
                4,
                "Seat Ibiza",
                "1234ABC",
                20);

        coche.mover();

        coche.arrancar();

        coche.mover();
        coche.mover();
        coche.mover();

        System.out.println(
                "Combustible restante: "
                        + coche.getLitrosCombustible());

        coche.setLitrosCombustible(2);

        coche.mover();
        coche.mover();
        coche.mover();

        System.out.println(
                "Combustible final: "
                        + coche.getLitrosCombustible());
    }
}