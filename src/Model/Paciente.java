
package Model;

public class Paciente extends Pessoa{
    
    private Medico medico;
    private Funcionario funcionario;
    private Endereco end;

    public Paciente() {
    }

    public Paciente(Medico medico, Funcionario funcionario, Endereco end) {
        this.medico = medico;
        this.funcionario = funcionario;
        this.end = end;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }
    
    
    public void realizarConsulta(){
        
    }
}
