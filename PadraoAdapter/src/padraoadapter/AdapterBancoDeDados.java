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
public class AdapterBancoDeDados extends ClienteUltimate {
    private ClienteGrauito clienteGratuito;
    private ClienteBasico clienteBasico;
    private ClienteUltimate clienteUtimate;

    public AdapterBancoDeDados(ClienteUltimate clienteUtimate) {
        
        this.clienteUtimate = clienteUtimate;
    }

    public AdapterBancoDeDados(ClienteGrauito clienteGratuito) {
        this.clienteGratuito = clienteGratuito;
    }

    public AdapterBancoDeDados(ClienteBasico clienteBasico) {
        this.clienteBasico = clienteBasico;
    }
    
    public void criarClienteGratuito() {
        clienteGratuito.SgbdGratuito();
    }
    
    public void criarClienteBasico() {
        clienteBasico.SgbdBasico();
    }
    
    public void criarClienteUltimate() {
        clienteUtimate.SgbdUltimate();
    }
}
