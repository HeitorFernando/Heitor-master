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
public class GradeDeHorarios {
    private Horario[][] matrizHotario;

    public GradeDeHorarios(Horario[][] matrizHotario) {
        this.matrizHotario = matrizHotario;
    }
    
    
    public GradeDeHorarios() {
        this.matrizHotario = new Horario[6][5];
    }
    
    public void addHorario(Horario horario, int posicaoX, int posicaoY ){
        try{
        if(posicaoX >6 || posicaoY > 5){
            throw new RuntimeException();
        }else{
        this.matrizHotario[posicaoX][posicaoY] = horario;
        }
        }catch(RuntimeException ex){
            System.out.println("Não existe essa posição na Matriz de horários");
        }
        
    
    }
    public Horario[][] getMatrizHorario() {
        return matrizHotario;
    }

    public void setMatrizHorario(Horario[][] matrizHotario) {
        this.matrizHotario = matrizHotario;
    }

    @Override
    public String toString() {
        return "GradeDeHorarios{" + "matrizHotario=" + matrizHotario + '}';
    }
    
    
    
}
