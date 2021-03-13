
package Model;

public class Medico extends Pessoa{
    
    private String CRM;
    private Administrador adm;
    private Endereco end;
    private Especialidade especialidade;
    private Paciente paciente;

    public Medico() {
    }

    public Medico(String CRM, Administrador adm, Endereco end, Especialidade especialidade, Paciente paciente) {
        this.CRM = CRM;
        this.adm = adm;
        this.end = end;
        this.especialidade = especialidade;
        this.paciente = paciente;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public Administrador getAdm() {
        return adm;
    }

    public void setAdm(Administrador adm) {
        this.adm = adm;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    private void consultarPaciente(){
        
    }
    
}
