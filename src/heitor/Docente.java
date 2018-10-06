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
public class Docente {
    private String nome;
    private String apelido;
    private String email;
    private int matricula;
    private String areaDeLotacao;
    private String vinculo;

    public Docente(String nome, String apelido, String email, int matricula, String areaDeLotacao, String vinculo) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.matricula = matricula;
        this.areaDeLotacao = areaDeLotacao;
        this.vinculo = vinculo;
    }
    public Docente(String nome, String apelido) {
        this.nome = nome;
        this.apelido = apelido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getAreaDeLotacao() {
        return areaDeLotacao;
    }

    public void setAreaDeLotacao(String areaDeLotacao) {
        this.areaDeLotacao = areaDeLotacao;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    @Override
    public String toString() {
        return "Docente{" + "nome=" + this.nome + ", apelido=" + this.apelido + ", email=" + this.email + ", matricula=" + this.matricula + ", areaDeLotacao=" + this.areaDeLotacao + ", vinculo=" + this.vinculo + '}';
    }
    
    
}
