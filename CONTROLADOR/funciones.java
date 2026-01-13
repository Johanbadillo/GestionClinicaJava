package CONTROLADOR;

import MODELO.PACIENTE;
import java.util.Scanner;

public class FUNCIONES {
    validaciones v = new validaciones();
    PACIENTE p1 = null;
    PACIENTE p2 = null;
    PACIENTE p3 = null;
    PACIENTE p4 = null;

    public void agg_paciente() {
        System.out.println("Ingrese el nombre del paciente ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Ingrese El Numero de documento del paciente ");
        String numeroDocumento = new Scanner(System.in).nextLine();
        int edad = v.validacion(0, 200, "Ingrese la edad del paciente ");
        String edadV = String.valueOf(edad);
        edadV = v.VerificarTipoPaciente(edad);
        System.out.println("Ingrese el motivo ");
        String motivo = new Scanner(System.in).nextaLine();
        System.out.println("Ingrese el telefono del paciente ");
        String telefono = new Scanner(System.in).nextLine();
        if (p1 == null) {
            p1 = new PACIENTE(nombre, numeroDocumento, edad, motivo, telefono, "", "registrado");
        } else {
            if (p2 == null) {
                p2 = new PACIENTE(nombre, numeroDocumento, edad, motivo, telefono, "", "registrado");
            } else {
                if (p3 == null) {
                    p3 = new PACIENTE(nombre, numeroDocumento, edad, motivo, telefono, "", "registrado");
                } else {
                    if (p4 == null) {
                        p4 = new PACIENTE(nombre, numeroDocumento, edad, motivo, telefono, "", "registrado");
                    } else {
                        System.out.println("Ya no hay mas cupos Disponibles");
                    }
                }

            }
        }
    }

    public void mostrar_pacientes() {
        visualizar_pacientes(p1);
        visualizar_pacientes(p2);
        visualizar_pacientes(p3);
        visualizar_pacientes(p4);
    }

    public void visualizar_pacientes(PACIENTE p) {
        if (p != null) {
            System.out.println("==========================");
            System.out.println("===Informacion Paciente===");
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Numero Documento: " + p.getNumeroDocumento());
            System.out.println("Edad: " + p.getEdad());
            System.out.println("Motivo de la coonsulta: " + p.getMotivo());
            System.out.println("Telefono: \n" + p.getTelefono().replace(",", "\n"));
            System.out.println("Tipo Paciente: " + p.getTipoPaciente());
            System.out.println("Estado Paciente: " + p.getEstado());
        } else {

        }
    }
    
    public void pacientes_espera(){
        atencion_paciente(p1);
        atencion_paciente(p2);
        atencion_paciente(p3);
        atencion_paciente(p4);
    }
    
    public void atencion_paciente(PACIENTE p) {
        if (p != null && p.getEstado().equals("registrado")) {
            System.out.println("==========================");
            System.out.println("Paciente: " + p.getNombre());
            System.out.println("Estado de disponibilidad: " +p.getEstado());
            int opp = v.validacion(1, 2, "Quieres atender a este Paciente??\n1. SI\n2. NO");
            if(opp ==1){
                p.setEstado("atendido");
                System.out.println("El estado del paciente fue actualizado");
            }else{
                System.out.println("El paciente sigue en espera");
            }
        }
    }

}
