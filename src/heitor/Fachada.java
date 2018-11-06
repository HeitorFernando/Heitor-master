/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heitor;

import java.util.ArrayList;



/**
 *
 * @author User
 */
public class Fachada {
     private static Fachada instancia = new Fachada();
     private ArrayList<Curso> cusos;
     private Fachada(){
         this.cusos = new ArrayList();
     }
    public static Fachada getInstancia() {
        return instancia;
    }

    public void addCurso(String descCurso, String cod_Curso, int duracao) {
        Curso curso = new Curso(descCurso);
        curso.setCod_Curso(cod_Curso);
        curso.setDuracao(duracao);
        this.cusos.add(curso);
    }
    public void addDisciplina(String descCurso, String nome, String acro,int periodo, int qdc){
        Curso curso = null;
        for(Curso c : this.cusos){
            if(c.getDescricao().equals(descCurso)){
                curso = c;
            }
        }
        if(curso != null){
            curso.addDisciplina(new Disciplina(nome,acro,periodo,qdc));
            System.out.println("Cadastrado");
        }
        else{
            System.out.println("Curso não encontrado - NÃO PODEMOS CADASTRAR ESSA DISCIPLINA");
        }
    }
    public void addDocente(String nomeDocente,String apelidoDocente, String emailDocente, String matriculaDocente,String areaLotacaoDocente, String vinculo){
       Curso curso = null;
        for(Curso c : this.cusos){
            if(c.getDescricao().equals(areaLotacaoDocente)){
                curso = c;
            }
        }
        if(curso != null){
            curso.addDocente(new Docente(nomeDocente,apelidoDocente, emailDocente, matriculaDocente,areaLotacaoDocente,vinculo));
            System.out.println("Cadastrado");
        }
       else{
            System.out.println("Curso não encontrado - NÃO PODEMOS CADASTRAR ESSE DOCENTE");
        }
    }
    public void addLaboratorio(String cursoNome, String desc, int cap){
        Curso curso = null;
        for(Curso c : this.cusos){
            if(c.getDescricao().equals(cursoNome)){
                curso = c;
            }
        }
        if(curso != null){
            curso.addLab(new Laboratorio(desc,cap));
            System.out.println("Cadastrado");
        }
        else{
            System.out.println("Curso não encontrado - NÃO PODEMOS CADASTRAR ESSE LAB");
        }
    }
    public void listarCursos(){
        this.cusos.forEach(curso -> System.out.println(curso));
    }
    public void listarDisciplinas(String cursoNome){
        Curso curso = null;
        for(Curso c : this.cusos){
            if(c.getDescricao().equals(cursoNome)){
                curso = c;
            }
        }
        if(curso != null){
            curso.getDisciplinas().forEach(disciplina -> System.out.println(disciplina));
        }
        else{
            System.out.println("Curso não encontrado - NÃO PODEMOS LISTAR DISCIPLINAS");
        }
    }
    public void listarDocentes(String cursoNome){
        Curso curso = null;
        for(Curso c : this.cusos){
            if(c.getDescricao().equals(cursoNome)){
                curso = c;
            }
        }
        if(curso != null){
            curso.getProfessores().forEach(Docentes -> System.out.println(Docentes));
        }
        else{
            System.out.println("Curso não encontrado - NÃO PODEMOS LISTAR PROFESSORES");
        }
    }
    public void listarLaboratorios(String cursoNome){
        Curso curso = null;
        for(Curso c : this.cusos){
            if(c.getDescricao().equals(cursoNome)){
                curso = c;
            }
        }
        if(curso != null){
            curso.getLab().forEach(laboratorios -> System.out.println(laboratorios));
        }
        else{
            System.out.println("Curso não encontrado - NÃO PODEMOS LISTAR LABORATORIO");
        }
    }
    public void listarTudo(String cursoNome){
        Curso curso = null;
        for(Curso c : this.cusos){
            if(c.getDescricao().equals(cursoNome)){
                curso = c;
            }
        }
        if(curso != null){
           System.out.println(curso);
        }
        else{
            System.out.println("Curso não encontrado");
        }
    }
    public void criarGrade(String nomeTurma, String nomeDoCurso){
        Curso curso = null;
        for(Curso c : this.cusos){
            if(c.getDescricao().equals(nomeDoCurso)){
                curso = c;
            }
        }
        if(curso != null){
            Turma t = new Turma(nomeTurma);
            curso.addTurma(t);
        }
        else{
            System.out.println("Curso não encontrado");
        }
    }
    public void addHorario(String cursoNome,String nomeTurma,String dia, int horario, String professor,String disciplina, String lab){
        Curso curso = null;
        for(Curso c : this.cusos){
            if(c.getDescricao().equals(cursoNome)){
                curso = c;
            }
        }
        if(curso != null){
            Turma t = null;
            for(Turma o : curso.getTurmas() ){
            if(o.getIdentificador().equals(nomeTurma)){
                t=o;
            }
            if(t!=null){
                Docente prof = null;
                Disciplina dis = null;
                Laboratorio labe = null;
                for(Docente d1 : curso.getProfessores() ){
                    if(d1.getApelido().equals(professor)){
                            prof=d1;
                    }
                }
                for(Disciplina d2 : curso.getDisciplinas() ){
                    if(d2.getSigla().equals(disciplina)){
                           dis=d2;
                    }
                }
                for(Laboratorio d3 : curso.getLab() ){
                    if(d3.getDescricao().equals(lab)){
                           labe=d3;
                    }
                }
                Horario h = new Horario(dis,prof,labe);
                 switch (dia){
                     case "Segunda-feira": {
                         t.getGradeDeHorarios().addHorario(h, 0 ,horario-1);
                         break;
                     }
                     case "Terça-feira": {
                         t.getGradeDeHorarios().addHorario(h, 1,horario-1);
                         break;
                     }
                     case "Quarta-feira": {
                         t.getGradeDeHorarios().addHorario(h, 2,horario-1);
                         break;
                     }
                     case "Quinta-feira": {
                         t.getGradeDeHorarios().addHorario(h, 3,horario-1);
                         break;
                     }
                     case "Sexta-feira": {
                         t.getGradeDeHorarios().addHorario(h, 4,horario-1);
                         break;
                     }
                 }
        }else{
                System.out.println("Turma não encontrada");
            }
        }}
        else{
            System.out.println("Curso não encontrado");
        }
    }
    public void verGrade(String nomeCurso, String turma){
        Curso curso = null;
        for(Curso c : this.cusos){
            if(c.getDescricao().equals(nomeCurso)){
                curso = c;
            }
        }
        if(curso != null){
            Turma t = null;
            for(Turma o : curso.getTurmas() ){
            if(o.getIdentificador().equals(turma)){
                t=o;
            }}
            if(t != null){
             System.out.println(t.getGradeDeHorarios());
            }}
        else{
            System.out.println("Curso não encontrado");
        }
    }
}
