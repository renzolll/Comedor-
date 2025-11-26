package comedor.comensal.modelo;

import comedor.comensal.Comensal;

public class PublicoGeneral extends Comensal {

    private String motivo;

    public PublicoGeneral() {}

    public PublicoGeneral(String codigo, String dni, String nombre, String estado, String tipo, String motivo) {
        super(codigo, dni, nombre, estado, TipoComensal.PUBLICO_GENERAL);
        this.motivo = motivo;
    }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
}
