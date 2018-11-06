/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heitor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Curso {
    private String cod_Curso;
    private String descricao;
    private int duracao;
    //conjunto de Docentes
    private List<Docente> professores;
    //conjunto de Disciplinas
    private List<Disciplina> disciplinas;
    //conjunto de Turmas
    private List<Turma> turmas;
    //conjunto de Laboratórios
    private List<Laboratorio> lab;

    public List<Laboratorio> getLab() {
        return lab;
    }

    public void setLab(List<Laboratorio> lab) {
        this.lab = lab;
    }

    public Curso(String cod_Curso, String descricao, int duracao, List professores, List disciplinas, List turmas, List lab) {
        this.cod_Curso = cod_Curso;
        this.descricao = descricao;
        this.duracao = duracao;
        this.professores = professores;
        this.disciplinas = disciplinas;
        this.turmas = turmas;
        this.lab = lab;
        
    }
    public Curso(String descricao) {
        this.descricao = descricao;
        this.professores = new ArrayList();
        this.disciplinas = new ArrayList();
        this.turmas = new ArrayList();
        this.lab = new ArrayList();
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public List<Docente> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Docente> professores) {
        this.professores = professores;
    }

    public String getCod_Curso() {
        return cod_Curso;
    }

    public void setCod_Curso(String cod_Curso) {
        this.cod_Curso = cod_Curso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Curso{" + "cod_Curso=" + cod_Curso + ", descricao=" + descricao + ", duracao=" + duracao + '}';
    }
    
    //O método adiciona um professor na lista de docentes do curso
    public void addDocente(Docente professor){
        this.professores.add(professor);
    }
    //O método adiciona uma disciplina na lista de disciplinas do curso
    public void addDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }
    //O método adiciona uma turma na lista de turmas do curso
    public void addTurma(Turma turma){
        this.turmas.add(turma);
    }
    public void addLab(Laboratorio l){
        this.lab.add(l);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    
    
}
