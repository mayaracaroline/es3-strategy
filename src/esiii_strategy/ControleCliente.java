/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esiii_strategy;

import java.time.Clock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author mayarasantos
 */
public class ControleCliente {
    
    void SalvarDadosCliente(StringBuilder dados){
        String[] dadosCli = dados.toString().split("\n");
        ArrayList<String> lista = new ArrayList<>();
        
        lista.addAll(Arrays.asList(dadosCli));
        
        System.out.println("---- Lista -----");
        System.out.println(lista);
        
        Cliente cliente = new Cliente();
        System.out.println("Salvo com sucesso");
    }
}
