/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Códigos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author joseedson
 */
public class Doador extends Pessoa {

    private ArrayList<Doacao> historico;

    public Doador(String nome) {
        super(nome);
        this.historico = new ArrayList<Doacao>();
    }

    public void adicionaDoacao(Doacao doacao) {
        this.historico.add(doacao);
    }

    public void listaDoacoes() {
        StringBuilder sb = new StringBuilder("Doações de " + this.getNome() + ":\n");
        for (Doacao doacao : this.historico) {
            sb.append("- ").append(doacao.getValor()).append(" para ").append(doacao.getBeneficiario().getNome()).append("\n");
        }
        //JOptionPane.showMessageDialog(null, sb.toString());
    }
}
