/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoadapter;

/**
 *
 * @author Guilherme
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClienteGrauito clienteGratuito = new ClienteGrauito();
        AdapterBancoDeDados ContaGratuita = new AdapterBancoDeDados(clienteGratuito);
        ContaGratuita.criarClienteGratuito();
        
        ClienteBasico clientBasico = new ClienteBasico();
        AdapterBancoDeDados ContaBasica = new AdapterBancoDeDados(clientBasico);
        ContaBasica.criarClienteBasico();
        
        ClienteUltimate clienteUltimate = new ClienteUltimate();
        AdapterBancoDeDados ContaUltimate = new AdapterBancoDeDados(clienteUltimate);
        ContaUltimate.criarClienteUltimate();
    }
    
}
