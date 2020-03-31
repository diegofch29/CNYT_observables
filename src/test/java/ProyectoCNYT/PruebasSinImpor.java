/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoCNYT;


import ProyectoCNYT.Numero_complejo;
import ProyectoCNYT.Vector;
import ProyectoCNYT.Matriz;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author diego.chinchilla
 */
public class PruebasSinImpor {
    
    Proyecto PR = new Proyecto();
    
    @Before
    public void setUp() {
    }
    
    
    @Test
    public void  TestQiz(){
        PR.TallerPrueba();
        //double[][]estado={{Math.sqrt(5)/Math.sqrt(5),2/Math.sqrt(5)},{-2/Math.sqrt(5),-Math.sqrt(5)/Math.sqrt(5)},{0,Math.sqrt(2/5)}};
        //PR.Simulacion(estado, 1);
        //double[][]estado= {{2,1},{-1,2},{0,1},{1,0},{3,-1},{2,0},{0,-2},{-2,1},{1,-3},{0,-1}};
        //double[][]estado2= {{-1,-4},{2,-3},{-7,6},{-1,1},{-5,-3},{5,0},{5,8},{4,-4},{8,-7},{2,-7}};
        //double [][] estado = {{1,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0}};
        //double [][] estado2 ={{0,0},{1,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0}};
        //PR.transicion(estado, estado2);
        //PR.quiz6();
        //PR.Taller();
    }
}
