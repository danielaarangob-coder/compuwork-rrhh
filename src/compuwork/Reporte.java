
package compuwork;
import java.util.Date;

public class Reporte {
    private String contenido;
    private Date fechaGeneracion;

    public void generarReporte(Departamento dep) {
        this.fechaGeneracion = new Date();
        System.out.println("\n======= REPORTE DE DESEMPEÑO - DEPARTAMENTO: " + dep.getNombreDepartamento() + " =======");
        System.out.println("Fecha: " + fechaGeneracion);
        
        if (dep.getListaEmpleados().isEmpty()) {
            System.out.println("No hay empleados registrados en este departamento.");
        } else {
            for (Empleado e : dep.getListaEmpleados()) {
                // Aquí ocurre el polimorfismo: se llama al reporte de cada tipo de empleado
                System.out.println(e.generarReporteDesempeno());
            }
        }
        System.out.println("==================================================================\n");
    }
}