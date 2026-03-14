
package compuwork;
import java.util.Date;

// Empleado Temporal
class EmpleadoTemporal extends Empleado {
    private Date fechaIngreso;
    private Date fechaFin;

    public EmpleadoTemporal(int id, String nom, String car, double sal, String des, Date fIngreso, Date fFin) {
        super(id, nom, car, sal, des); // Llama al constructor del padre
        this.fechaIngreso = fIngreso;
        this.fechaFin = fFin;
    }

    @Override
    public String generarReporteDesempeno() {
        return "[TEMPORAL] Empleado: " + getNombre() + " | Desempeño: " + getDesempeno() + " | Fin de contrato: " + fechaFin;
    }
}

// Empleado Permanente
class EmpleadoPermanente extends Empleado {
    private String tipoContrato;

    public EmpleadoPermanente(int id, String nom, String car, double sal, String des, String tipoContrato) {
        super(id, nom, car, sal, des);
        this.tipoContrato = tipoContrato;
    }

    @Override
    public String generarReporteDesempeno() {
        return "[PERMANENTE] Empleado: " + getNombre() + " | Cargo: " + getCargo() + " | Tipo: " + tipoContrato + " | Desempeño: " + getDesempeno();
    }
}