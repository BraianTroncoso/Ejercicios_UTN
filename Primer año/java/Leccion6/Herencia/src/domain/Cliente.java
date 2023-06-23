package domain;
import java.util.Date;
public class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes; // Es para incrementar


    // Constructor
    public Cliente(Date fechaRegistro, boolean vip, String nombre,
                   char genero, int edad, String direccion){
        super(nombre, genero, edad, direccion);
        this.vip = vip;
        this.fechaRegistro = fechaRegistro;
        this.idCliente = ++ Cliente.contadorClientes;
    }


    // Getter and Setter
    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
