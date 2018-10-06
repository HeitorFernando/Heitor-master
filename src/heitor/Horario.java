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
public class Horario {
    private Disciplina disciplina;
    private Docente professor;
    private Laboratorio laboratorio;

    public Horario(Disciplina disciplina, Docente professor, Laboratorio laboratorio) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.laboratorio = laboratorio;
    }
    
    

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Docente getProfessor() {
        return professor;
    }

    public void setProfessor(Docente professor) {
        this.professor = professor;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    @Override
    public String toString() {
        return "Horario{" + "disciplina=" + disciplina + ", professor=" + professor + ", laboratorio=" + laboratorio + '}';
    }
    
}
