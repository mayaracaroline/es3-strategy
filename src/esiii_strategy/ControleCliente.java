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
    
    void SalvarDados(EntidadeDominio entidade){
        Cliente cliente = (Cliente) entidade;
      
        System.out.println("Salvo com sucesso");
    }
}
