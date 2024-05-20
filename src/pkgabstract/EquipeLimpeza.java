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
public class EquipeLimpeza extends Pessoa {

    private String setor;
    private String funcao;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String show() {
        return ("\nNome: " + nome + "\nSexo: " + sexo + "\nIdade: " + idade + "\nSetor: " + setor + "\nFunção: " + funcao);
    }
}
