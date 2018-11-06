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
public class Heitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Fachada f = Fachada.getInstancia();
		
		
		f.addCurso("Informática", "123456789", 366);
		
		f.addDisciplina("Informática", "Programação OO", "POO", 2, 3);
		f.addDisciplina("Informática", "Sistemas Operacionais", "SO", 3, 2);
		f.addDisciplina("Informática", "Banco de Dados", "BD", 2, 2);
		f.addDisciplina("Informática", "Programação Web I", "WEB I", 2, 3);
		f.addDisciplina("Informática", "Programação Web II", "WEB II", 3, 2);
		f.addDisciplina("Informática", "Análise e Projeto de Sistemas", "APS", 3, 2);
		f.addDisciplina("Informática", "Algoritmos", "Algortimos", 1, 4);
		
		f.addDocente("Amélia Batista", "Amélia", null, null, null, null);
		f.addDocente("Carolina Dantas", "Carol", "carol@email.com", "123456", null, null);
		f.addDocente("Everton Fabiano", "Everton", null, "654321", "Informática", "T-40");
		f.addDocente("Guilherme Harrison", "Guilhemer", "guihar@professor.edu.br", "678909", "Informática", "T-20");
		
		f.addLaboratorio("Informática", "Laboratório de Programação I", 25);
		f.addLaboratorio("Informática","Laboratório de Programação II", 25);
		f.addLaboratorio("Informática","Laboratório de Programação III", 20);
		
		f.listarCursos();
		f.listarDisciplinas("Informática");
		f.listarDocentes("Informática");
		f.listarLaboratorios("Informática");
		// deve listar todos os dados cadastrados do curso
		f.listarTudo("Informatica");
		
		f.criarGrade("Informática - 3º Ano","Informática");
		f.addHorario("Informática","Informática - 3º Ano", "Segunda-feira", 3, "Carol", "SO", "Laboratório de Programação I");
		f.addHorario("Informática","Informática - 3º Ano", "Terça-feira", 1, "Guilherme", "APS", "Laboratório de Programação III");
		f.addHorario("Informática","Informática - 3º Ano", "Terça-feira", 3, "Everton", "WEB II", "Laboratório de Programação II");
		
		f.verGrade("Informática","Informática - 3º Ano");

     
    }
    
}
