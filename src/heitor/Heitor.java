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
public class Heitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GradeDeHorarios gh = new GradeDeHorarios();
        Disciplina d = new Disciplina("kkkk","PT",7,5);
        Docente p = new Docente("João","YU");
        Laboratorio l = new Laboratorio("jkjkjk",8);
        Horario h1 = new Horario(d,p,l);
        gh.addHorario(h1, 0, 0);
        System.out.print(h1);
    }
    
}
