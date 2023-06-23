package domain;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados; // Es para incrementar



    //Constructores
    public Empleado(){ //Constructor 1
        this.idEmpleado = ++Empleado.contadorEmpleados;
    }
    public Empleado(String nombre, double sueldo){
        //super(nombre); //Nunca se utilizan las dos cosas, o el super o el this.
        this(); //Estamos llamando desde aquí al constructor vacio(llamar a un constructor interno)
        this.nombre = nombre;
        this.sueldo = sueldo;
    }


    public int getIdEmpleado() {
        return this.idEmpleado;
    }


    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }


}
