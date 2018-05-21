/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esiii_strategy;

import java.time.Clock;

/**
 *
 * @author mayarasantos
 */
public class ControleCliente {
    
    void SalvarDados(){
        Cliente cliente = new Cliente();
        FormCliente1 form = new FormCliente1();
        Parentesco parentesco1 = new Parentesco();
        Parentesco parentesco2 = new Parentesco();
        Dependente dependente1 = new Dependente();
        Dependente dependente2 = new Dependente();
        Endereco endereco = new Endereco();
        Estado estado = new Estado();
        Cidade cidade = new Cidade();
        
        parentesco1.setGrauParentesco(form.getParestenco1());
        parentesco2.setGrauParentesco(form.getParestenco2());
        dependente1.setParentesco(parentesco1);// não entendi
        dependente1.setNome(form.getNomeDependente1());
        dependente2.setParentesco(parentesco2);
        dependente2.setNome(form.getNomeDependente2());
        endereco.setEstado(estado);
        estado.setNomeEstado(form.getEstado());
        cidade.setNomeCidade(form.getCidade());
        cidade.setEstado(estado);
        endereco.setLogradouro(form.getRua());
        endereco.setNumero(form.getNumero());
        endereco.setCEP(form.getCep());
        endereco.setCidade(cidade);
        //Cliente
        cliente.setNome(form.getNome());
        cliente.setCpf(Integer.parseInt(form.getCpf()));
        cliente.setCredito(1000.00);
            // Endereco
        cliente.endereco.getCidade();
        cliente.endereco.getCEP();
        cliente.endereco.getLogradouro();
        cliente.endereco.getNumero();
        cliente.endereco.getEstado();
            // Dependente1
        cliente.dependente1.getNome();
        cliente.dependente1.getParentesco();
        cliente.dependente2.getNome();
        cliente.dependente2.getParentesco();
        
        System.out.println("Salvo com sucesso");
        form.setLabelResultado("Salvo com Sucesso! :)");
    }
}
