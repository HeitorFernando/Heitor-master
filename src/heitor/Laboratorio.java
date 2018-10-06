/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heitor;

/**
 *
 * @author User
 */
public class Laboratorio {
    private String descricao;
    private int capacidade;

    public Laboratorio(String descricao, int capacidade) {
        this.descricao = descricao;
        this.capacidade = capacidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Laboratorio{" + "descricao=" + this.descricao + ", capacidade=" + this.capacidade + '}';
    }
    
}
