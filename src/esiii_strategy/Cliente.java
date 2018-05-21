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
public class Cliente {
    
    private 
        String nome;
        int cpf;
        double credito;
        Endereco endereco;
        Dependente dependente1;
        Dependente dependente2;  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    
    
    
}
