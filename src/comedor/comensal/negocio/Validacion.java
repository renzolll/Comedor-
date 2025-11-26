package comedor.comensal.negocio;

import comedor.comensal.Comensal;

public class Validacion {

    public static void validarDatosComensal(Comensal c) {

        if (c.getCodigo() == null || c.getCodigo().isBlank())
            throw new IllegalArgumentException("El código es obligatorio.");

        if (c.getDni() == null || !c.getDni().matches("\\d{8}"))
            throw new IllegalArgumentException("El DNI no es válido.");

        if (c.getNombre() == null || c.getNombre().length() < 3)
            throw new IllegalArgumentException("El nombre es demasiado corto.");

        if (c.getEstado() == null)
            throw new IllegalArgumentException("El estado no puede ser nulo.");

        if (c.getTipo() == null)
            throw new IllegalArgumentException("El tipo de comensal es obligatorio.");
    }
}