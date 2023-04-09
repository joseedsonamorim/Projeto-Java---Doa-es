/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Códigos.negócios;

import Códigos.dados.Doacao;
import Códigos.apresentação.ListagemDeDoacoes;
import java.util.ArrayList;

/**
 *
 * @author joseedson
 */
public class Doador extends Pessoa implements ListagemDeDoacoes {

    private ArrayList<Doacao> historico; //Armazena o histórico de doações do doador

    public Doador(String nome) {
        super(nome);
        this.historico = new ArrayList<Doacao>();//inicializa o campo "historico" como uma nova lista vazia.
    }

    public void adicionaDoacao(Doacao doacao) {
        this.historico.add(doacao);
    }

    // Gera uma string com uma lista das doações feitas pelo doador e seus respectivos beneficiários.
    @Override
    public void listaDoacoes() {
        StringBuilder sb = new StringBuilder("Doações de " + this.getNome() + ":\n");
        for (Doacao doacao : this.historico) {
            sb.append("- ").append(doacao.getValor()).append(" para ").append(doacao.getBeneficiario().getNome()).append("\n");
        }
        //JOptionPane.showMessageDialog(null, sb.toString());
    }
}
