/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esiii_strategy;

import java.time.Clock;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mayarasantos
 */
public class ControleCliente {
    
    void SalvarDadosCliente(StringBuilder dados){
        String a = dados.toString();
        String[] dadosCli;
        ArrayList<String> lista = new ArrayList<String>();
        dadosCli = a.split("\n");
        for(String i : dadosCli) {
            lista.add(i);
        }
        
        Cliente cliente = new Cliente();
        System.out.println(dadosCli[0]);
        System.out.println("Salvo com sucesso");
    }
}
