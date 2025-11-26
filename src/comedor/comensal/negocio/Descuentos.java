package comedor.comensal.negocio;

import comedor.comensal.Comensal;

public class Descuentos{

    public static double calcularPrecioFinal(Comensal c, double precioBase) {

        switch (c.getTipo()) {
            case ESTUDIANTE:
                return precioBase * 0.5;
            case ADMINISTRATIVO:
                return precioBase * 0.8;
            case PROFESOR:
                return precioBase * 0.9;
            case PUBLICO_GENERAL:
                return precioBase;
            default:
                return precioBase;
        }
    }
}