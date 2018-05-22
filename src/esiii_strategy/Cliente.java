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
public class Cliente extends EntidadeDominio{
    
    private 
        String nome;
        private int cpf;
        private double credito;
        private Endereco endereco;
        private Dependente dependente1;
        private Dependente dependente2;  

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

    public Endereco getEndereco() {
        if (endereco == null )
            endereco = new Endereco();
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Dependente getDependente1() {
        if (dependente1 == null) {
            dependente1 = new Dependente();
        }
        return dependente1;
    }

    public void setDependente1(Dependente dependente1) {
        this.dependente1 = dependente1;
    }

    public Dependente getDependente2() {
        if (dependente2 == null) {
            dependente2 = new Dependente();
        }
        return dependente2;
    }

    public void setDependente2(Dependente dependente2) {
        this.dependente2 = dependente2;
    }
    
    
    
    
    
}
