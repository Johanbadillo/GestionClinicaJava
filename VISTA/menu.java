package VISTA;

import CONTROLADOR.FUNCIONES;
import CONTROLADOR.validaciones;

public class menu {

    public static void main(String[] args)  {
        validaciones v = new validaciones();
        FUNCIONES f = new FUNCIONES();
        int op =0;
        do {
            op = v.validacion(1, 4, "============================\n1- Registrar paciente\n2- Mostrar pacientes registrados\n3- Atender paciente\n4- Salir");
            switch(op){
                case 1:
                    f.agg_paciente();
                    break;
                case 2:
                    f.mostrar_pacientes();
                    break;
                case 3:
                    f.pacientes_espera();
                    break;
            }
        } while (op != 4);
    }

}
