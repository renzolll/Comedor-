package comedor.comensal;
import comedor.comensal.modelo.TipoComensal;

public abstract class Comensal {
    protected String codigo;
    protected String dni;
    protected String nombre;
    protected String estado;
    protected TipoComensal tipo;

    public Comensal() {}

    public Comensal(String codigo, String dni, String nombre, String estado, TipoComensal tipo) {
        this.codigo = codigo;
        this.dni = dni;
        this.nombre = nombre;
        this.estado = estado;
        this.tipo = tipo;
    }

    public String getCodigo() { return codigo; }
    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getEstado() { return estado; }
    public TipoComensal getTipo() { return tipo; }

    public void setCodigo(String codigo) { this.codigo = codigo; }
    public void setDni(String dni) { this.dni = dni; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEstado(String estado) { this.estado = estado; }
    public void setTipo(TipoComensal tipo) { this.tipo = tipo; }
}