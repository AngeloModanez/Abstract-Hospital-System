/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author labfatec
 */
public class Paciente extends Pessoa {

    private String numeroProntuario;
    private String diagnostico;

    public String getNumeroProntuario() {
        return numeroProntuario;
    }

    public void setNumeroProntuario(String numeroProntuario) {
        this.numeroProntuario = numeroProntuario;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String show() {
        return ("\nNome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nNumero do Prontuario: " + numeroProntuario + "\nDiagnostico: " + diagnostico);
    }
}
