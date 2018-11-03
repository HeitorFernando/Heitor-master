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
public class PerguntaMultiEscolha extends Pergunta{
    private char alternativaCorreta;

    public PerguntaMultiEscolha(char alternativaCorreta, String descricao) {
        super(descricao);
        this.alternativaCorreta = alternativaCorreta;
    }

    public void setAlternativaCorreta(char alternativaCorreta) {
        this.alternativaCorreta = alternativaCorreta;
    }

    @Override
    public String getResposta() {
        return "Letra "+this.alternativaCorreta;
    }
    
}
