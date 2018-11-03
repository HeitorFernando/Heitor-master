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
     private static final Fachada instancia = new Fachada();
     private ArrayList disciplinas;
     private Fachada(){
         this.disciplinas = new ArrayList();
     }
    public static Fachada getInstancia() {
        return instancia;
    }
}
