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
public class Medico extends Pessoa {

    private String especialidade;
    private String crm;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String show() {
        return ("\nNome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nEspecialidade: " + especialidade + "\nCRM: " + crm);
    }
}
