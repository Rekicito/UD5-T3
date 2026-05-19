package net.salesianos.abstractfaces.actividad2;

public class CocheCombustion extends Vehiculo {

    protected boolean motorEncendido;
    protected int litrosCombustible;

    public CocheCombustion(String color,
            int numeroPuertas,
            int numeroRuedas,
            String modelo,
            String matricula,
            int litrosCombustible) {

        super(color, numeroPuertas, numeroRuedas, modelo, matricula);

        this.motorEncendido = false;
        this.litrosCombustible = litrosCombustible;
    }

    @Override
    public void arrancar() {

        if (litrosCombustible > 0) {

            motorEncendido = true;
            litrosCombustible--;

            System.out.println("El coche ha arrancado");

        } else {

            System.out.println("No hay combustible");
        }
    }

    @Override
    public void pararMotor() {

        motorEncendido = false;

        System.out.println("El motor se ha detenido");
    }

    @Override
    public void mover() {

        if (motorEncendido && litrosCombustible > 0) {

            litrosCombustible--;

            System.out.println("El coche se está moviendo");

        } else {

            System.out.println("El coche no puede moverse");

            motorEncendido = false;
        }
    }

    public int getLitrosCombustible() {

        return litrosCombustible;
    }

    public void setLitrosCombustible(int litrosCombustible) {

        this.litrosCombustible = litrosCombustible;
    }
}