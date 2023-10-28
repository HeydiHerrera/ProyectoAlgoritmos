package proyectoalgoritmos;

public class Votantes {
    
    private boolean votó;
    
    String nombres,apellidos,Cui,sexo,fechadenacimiento,direcciónderesidencia,departamentoderesidencia,municipioderesidencia,paisderesidencia;

    public Votantes(String nombres, String apellidos, String Cui, String sexo, String fechadenacimiento, String direcciónderesidencia, String departamentoderesidencia, String municipioderesidencia, String paisderesidencia) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.Cui = Cui;
        this.sexo = sexo;
        this.fechadenacimiento = fechadenacimiento;
        this.direcciónderesidencia = direcciónderesidencia;
        this.departamentoderesidencia = departamentoderesidencia;
        this.municipioderesidencia = municipioderesidencia;
        this.paisderesidencia = paisderesidencia;
        this.votó = false;
    }
    public boolean haVotado() {
        return votó;
    }

    public void marcarComoVotado() {
        votó = true;
    }
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCui() {
        return Cui;
    }

    public void setCui(String Cui) {
        this.Cui = Cui;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(String fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public String getDirecciónderesidencia() {
        return direcciónderesidencia;
    }

    public void setDirecciónderesidencia(String direcciónderesidencia) {
        this.direcciónderesidencia = direcciónderesidencia;
    }

    public String getDepartamentoderesidencia() {
        return departamentoderesidencia;
    }

    public void setDepartamentoderesidencia(String departamentoderesidencia) {
        this.departamentoderesidencia = departamentoderesidencia;
    }

    public String getMunicipioderesidencia() {
        return municipioderesidencia;
    }

    public void setMunicipioderesidencia(String municipioderesidencia) {
        this.municipioderesidencia = municipioderesidencia;
    }

    public String getPaisderesidencia() {
        return paisderesidencia;
    }

    public void setPaisderesidencia(String paisderesidencia) {
        this.paisderesidencia = paisderesidencia;
    }
    
}Cui