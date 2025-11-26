package comedor.comensal.modelo;

import comedor.comensal.Comensal;

public class Administrativo extends Comensal {

    private String area;

    public Administrativo() {}

    public Administrativo(String codigo, String dni, String nombre, String estado, String tipo, String area) {
        super(codigo, dni, nombre, estado, TipoComensal.ADMINISTRATIVO);
        this.area = area;
    }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }
}