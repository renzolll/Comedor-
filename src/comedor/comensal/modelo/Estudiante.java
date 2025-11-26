package comedor.comensal.modelo;

import comedor.comensal.Comensal;

public class Estudiante extends Comensal {
    private String carrera;

    public Estudiante(String codigo, String dni, String nombre, String estado, String carrera) {
        super(codigo, dni, nombre, estado, TipoComensal.ESTUDIANTE);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}