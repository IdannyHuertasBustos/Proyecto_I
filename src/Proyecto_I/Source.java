package Proyecto_I;

import Modelo.Empleado;
import Modelo.ModeloTableModelEmpleado;
import Modelo.Sucursal;
import Vista.VistaPrueba;

public class Source {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("6778", "nom", "rrttyt", 0.0, new Sucursal());
        ModeloTableModelEmpleado m = new ModeloTableModelEmpleado();
    m.addEmpleado(e1);
        VistaPrueba v1= new VistaPrueba(m);

    }
}
