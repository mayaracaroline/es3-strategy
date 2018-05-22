/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esiii_strategy;

/**
 *
 * @author mayarasantos
 */
public class Dependente {
    private Parentesco parentesco;
    private String nome;
    
    public Parentesco getParentesco() {
        if(parentesco == null) {
            parentesco = new Parentesco();
        }
        return parentesco;
    }

    public void setParentesco(Parentesco parentesco) {
        this.parentesco = parentesco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
