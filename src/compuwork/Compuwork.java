
package compuwork;
import java.util.Date;

public class Compuwork {
    public static void main(String[] args) {
        try {
            // 1. Crear Departamento
            Departamento itDept = new Departamento("Tecnología");

            // 2. Crear Empleados (Polimorfismo)
            Empleado emp1 = new EmpleadoPermanente(101, "Daniela Arango", "Desarrolladora Senior", 5000000, "Excelente", "Indefinido");
            Empleado emp2 = new EmpleadoTemporal(102, "Arlex Cuervo", "DataManager", 4500000, "Bueno", new Date(), new Date(System.currentTimeMillis() + 864000000));
            Empleado emp3 = new EmpleadoPermanente(103, "Daniela Quiceno", "Desarrolladora Junior", 3000000, "Excelente", "Indefinido");
            // 3. Asignar empleados con manejo de errores
            itDept.agregarEmpleado(emp1);
            itDept.agregarEmpleado(emp2);
            itDept.agregarEmpleado(emp3);
            // 4. Generar el reporte
            Reporte reporteFinal = new Reporte();
            reporteFinal.generarReporte(itDept);

        } catch (Exception e) {
            // Aquí capturamos cualquier error crítico para que el programa no se cierre
            System.err.println("Ha ocurrido un error en el sistema: " + e.getMessage());
        }
    }
}