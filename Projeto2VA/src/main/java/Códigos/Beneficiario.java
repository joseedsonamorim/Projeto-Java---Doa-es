package Códigos;

import javax.swing.JOptionPane;

/**
 *
 * @author joseedson
 */
public class Beneficiario extends Pessoa {

    /*
        A classe Beneficiario representa um beneficiário que recebe doações. 
        Armazena o total recebido em doações e possui métodos para receber uma doação e listar as doações recebidas.
     */
    private double totalRecebido;

    public Beneficiario(String nome) {
        super(nome);
        this.totalRecebido = 0;
    }

    // Recebe um valor como parâmetro e adiciona esse valor ao totalRecebido do beneficiário.
    public void recebeDoacao(double valor) {
        this.totalRecebido += valor;
    }

    // Exibe uma mensagem com o nome do beneficiário e o total de doações recebida.
    @Override
    public void listaDoacoes() {
        JOptionPane.showMessageDialog(null, this.getNome() + " recebeu um total de " + this.totalRecebido + " em doações.");
    }
}
