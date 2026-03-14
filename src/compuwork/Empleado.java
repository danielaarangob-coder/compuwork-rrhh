
package compuwork;
public abstract class Empleado {
    // Atributos privados (Principio de Encapsulamiento)
    private int idEmpleado;
    private String nombre;
    private String cargo;
    private double salario;
    private String desempeno;

    
    
    // Constructor para inicializar los datos
    public Empleado(int idEmpleado, String nombre, String cargo, double salario, String desempeno) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.desempeno = desempeno;
    }

    // Getters y Setters (Para acceder a los datos privados)
    public int getIdEmpleado() { return idEmpleado; }
    public String getNombre() { return nombre; }
    public String getCargo() { return cargo; }
    public double getSalario() { return salario; }
    public String getDesempeno() { return desempeno; }

    // Método abstracto (Polimorfismo: cada hijo lo hace a su manera)
    public abstract String generarReporteDesempeno();
}



