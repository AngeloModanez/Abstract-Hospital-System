/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import pkgabstract.Enfermeiro;
import pkgabstract.EquipeLimpeza;
import pkgabstract.Medico;
import pkgabstract.Paciente;

/**
 *
 * @author labfatec
 */
public class Main {

    public static void main(String[] args) {
        Medico medico = new Medico();
        Enfermeiro enfermeiro = new Enfermeiro();
        Paciente paciente = new Paciente();
        EquipeLimpeza equipeLimpeza = new EquipeLimpeza();

        System.out.println("Medico: \n" + medico.show());
        System.out.println("Enfermeiro: \n" + enfermeiro.show());
        System.out.println("Paciente: \n" + paciente.show());
        System.out.println("Equipe da Limpeza: \n" + equipeLimpeza.show());
    }
}
