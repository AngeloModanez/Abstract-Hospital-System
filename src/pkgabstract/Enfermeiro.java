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
public class Enfermeiro extends Pessoa {

    private String areaAtuacao;
    private String coren;

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public String show() {
        return ("\nNome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nArea de Atuação: " + areaAtuacao + "\nCoren: " + coren);
    }
}
