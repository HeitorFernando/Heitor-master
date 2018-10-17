/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heito1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Prova {
    private List<Pergunta> pesrguntas;

    public Prova(List<Pergunta> pesrguntas) {
        this.pesrguntas = pesrguntas;
    }

    public Prova() {
        this.pesrguntas = new ArrayList();
    }
    
    
    public void imprimirQuestoes(){
        this.pesrguntas.forEach((p)-> System.out.println(p.getDescricao()));
    }
    public void imprimirRespostas(){
        this.pesrguntas.forEach((p)-> System.out.println(p.getResposta()));
    }
    public void addQuestao(Pergunta p){
        this.pesrguntas.add(p);
    }
}
