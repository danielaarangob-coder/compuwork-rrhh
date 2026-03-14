
package compuwork;
import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombreDepartamento;
    private List<Empleado> listaEmpleados;

    public Departamento(String nombre) {
        this.nombreDepartamento = nombre;
        this.listaEmpleados = new ArrayList<>();
    }

    // Método con manejo de excepciones
    public void agregarEmpleado(Empleado e) throws Exception {
        if (e == null) {
            throw new Exception("ERROR: No se puede agregar un objeto nulo a la lista.");
        }
        listaEmpleados.add(e);
        System.out.println("SISTEMA: " + e.getNombre() + " asignado exitosamente al departamento " + nombreDepartamento);
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }
}