package comedor.comensal.modelo;

import comedor.comensal.Comensal;

public class Profesor extends Comensal {

    private String departamento;

    public Profesor() {}

    public Profesor(String codigo, String dni, String nombre, String estado, String tipo, String departamento) {
        super(codigo, dni, nombre, estado, TipoComensal.PROFESOR);
        this.departamento = departamento;
    }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
}