package proyectoalgoritmos;

public class Candidato {
    
    String NombreCompleto, Formación, ExperienciaProfesional,CódigoÚnicodeIdentificación;

    public Candidato(String NombreCompleto, String Formación, String ExperienciaProfesional, String CódigoÚnicodeIdentificación) {
        this.NombreCompleto = NombreCompleto;
        this.Formación = Formación;
        this.ExperienciaProfesional = ExperienciaProfesional;
        this.CódigoÚnicodeIdentificación = CódigoÚnicodeIdentificación;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getFormación() {
        return Formación;
    }

    public void setFormación(String Formación) {
        this.Formación = Formación;
    }

    public String getExperienciaProfesional() {
        return ExperienciaProfesional;
    }

    public void setExperienciaProfesional(String ExperienciaProfesional) {
        this.ExperienciaProfesional = ExperienciaProfesional;
    }

    public String getCódigoÚnicodeIdentificación() {
        return CódigoÚnicodeIdentificación;
    }

    public void setCódigoÚnicodeIdentificación(String CódigoÚnicodeIdentificación) {
        this.CódigoÚnicodeIdentificación = CódigoÚnicodeIdentificación;
    }

    
}
