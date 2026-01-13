package MODELO;

import CONTROLADOR.validaciones;

public class PACIENTE {
    private String nombre;
    private String numeroDocumento;
    private int edad;
    private String motivo;
    private String telefono;
    private String tipoPaciente;
    private String estado;
    
    public PACIENTE(String nombre, String numeroDocumento, int edad, String motivo, String telefono, String tipoPaciente, String estado) {
        validaciones v = new validaciones();
        this.nombre = nombre;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
        this.motivo = motivo;
        this.telefono = telefono;
        this.tipoPaciente = v.VerificarTipoPaciente(edad);
        this.estado = estado;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoPaciente() {
        return tipoPaciente;
    }

    public void setTipoPaciente(String tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}










