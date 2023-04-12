/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

import apresentacao.ListagemDeDoacoes;
import java.util.ArrayList;
import negocios.DoacaoInvalidaException;
import negocios.Pessoa;

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

    public void adicionaDoacao(Doacao doacao) throws DoacaoInvalidaException {
        if (doacao == null) {
            throw new DoacaoInvalidaException("Não é possível adicionar uma doação nula.");
        }
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
