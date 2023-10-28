package proyectoalgoritmos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Elección {

        private List<Candidato> candidatos;
  
String TítulodelaElección,Propósito,Descripción,CódigoÚnicodeIdentificación,FechayHoradeInicio,FechayHoradeFinalización;

    public Elección(String TítulodelaElección, String Propósito, String Descripción, String CódigoÚnicodeIdentificación, String FechayHoradeInicio,String FechayHoradeFinalización) {
        this.TítulodelaElección = TítulodelaElección;
        this.Propósito = Propósito;
        this.Descripción = Descripción;
        this.CódigoÚnicodeIdentificación = CódigoÚnicodeIdentificación;
        this.FechayHoradeInicio = FechayHoradeInicio;
        this.FechayHoradeFinalización = FechayHoradeFinalización;
        this.candidatos = new ArrayList<>();
    }

    public String getTítulodelaElección() {
        return TítulodelaElección;
    }

    public void setTítulodelaElección(String TítulodelaElección) {
        this.TítulodelaElección = TítulodelaElección;
    }

    public String getPropósito() {
        return Propósito;
    }

    public void setPropósito(String Propósito) {
        this.Propósito = Propósito;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String Descripción) {
        this.Descripción = Descripción;
    }

    public String getCódigoÚnicodeIdentificación() {
        return CódigoÚnicodeIdentificación;
    }

    public void setCódigoÚnicodeIdentificación(String CódigoÚnicodeIdentificación) {
        this.CódigoÚnicodeIdentificación = CódigoÚnicodeIdentificación;
    }

    public String getFechayHoradeInicio() {
        return FechayHoradeInicio;
    }

    public void setFechayHoradeInicio(String FechayHoradeInicio) {
        this.FechayHoradeInicio = FechayHoradeInicio;
    }

    public String getFechayHoradeFinalización() {
        return FechayHoradeFinalización;
    }

    public void setFechayHoradeFinalización(String FechayHoradeFinalización) {
        this.FechayHoradeFinalización = FechayHoradeFinalización;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(List<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    void Candidato(List<Candidato> candidatosSelecionados) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }
}

