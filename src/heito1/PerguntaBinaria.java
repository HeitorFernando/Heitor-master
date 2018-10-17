/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heito1;

/**
 *
 * @author User
 */
public class PerguntaBinaria extends Pergunta {
    private boolean resposta;

    public PerguntaBinaria(boolean resposta, String descricao) {
        super(descricao);
        this.resposta = resposta;
    }

    @Override
    public String getResposta() {
        if(this.resposta){
            return "C";
        }else{
            return "E";
        }
        
    }

    public void setResposta(boolean resposta) {
        this.resposta = resposta;
    }
    
}
