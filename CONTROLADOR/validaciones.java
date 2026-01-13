package CONTROLADOR;

import java.util.Scanner;

public class validaciones {

    public int validacion(int valorMinimo, int valorMaximo, String mensaje) {
        boolean validar = false;
        int op = 0;
        do {
            try {
                System.out.println(mensaje);
                op = new Scanner(System.in).nextInt();
                while (op < valorMinimo || op > valorMaximo) {
                    System.out.println("Opcion no valida, ingresa nuevamente");
                    op = new Scanner(System.in).nextInt();
                }
                validar = true;
            } catch (Exception e) {
                System.out.println("Error porfavor Ingrese solo numeros");
            }
        } while (validar == false);
        return op;
    }

    public String VerificarTipoPaciente(int edadV) {
        
        int edad = edadV;
        if (edad < 18) {
            String setTipoPaciente = "Menor";
            
            return setTipoPaciente;
        } else {
            String setTipoPaciente = "Adulto";
            return setTipoPaciente;
        }
    }
}
