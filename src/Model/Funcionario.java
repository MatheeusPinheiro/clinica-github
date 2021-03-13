
package Model;

public class Funcionario extends Pessoa {
    
    private String cargo;
    private int matricula;
    private Administrador adm;
    private Endereco end;
    private Paciente paciente;

    public Funcionario() {
    }

    public Funcionario(String cargo, int matricula, Administrador adm, Endereco end, Paciente paciente) {
        this.cargo = cargo;
        this.matricula = matricula;
        this.adm = adm;
        this.end = end;
        this.paciente = paciente;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public void cadastrarPaciente (){
        
    }
    
    
}
