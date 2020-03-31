/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoCNYT;



import ProyectoCNYT.Numero_complejo;
import ProyectoCNYT.Vector;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author ADMIN
 */
public class VectorTest {
    
    
    
    @Before
    public void setUp() {
       
    }
    
    @Test
    public void AdicionTest(){
      double[][] elementos1={{6,-4},{7,3},{4.2,8.1},{0,-3}};
      double[][] elementos2={{16,2.3},{0,7},{6,0},{0,-4}};
      double[][] elementosR={{22,-1.7},{7,-4},{18.2,8.1},{0,-7}};
      Vector v1 =new Vector(elementos1);
      Vector v2 =new Vector(elementos2);
      Vector Result=new Vector(elementosR);
      Vector Test =v1.Sumar(v2);
      Assert.assertTrue(Result.equals(Test));
    }
    
    @Test
    public void InversoTest(){
      double[][] elementos1={{6,-4},{7,3},{4.2,8.1},{0,-3}};
      double[][] elementosR={{-6,4},{-7,-3},{-4.2,-8.1},{0,3}};
      Vector v1 =new Vector(elementos1);
      Vector Result=new Vector(elementosR);
      Vector Test =v1.Inversa();
      Assert.assertTrue(Result.equals(Test));
    }
    
    
    @Test
    public void MultiplicacionEscalarTest(){
      double[][] elementos1 = {{6,3},{0,0},{5,1},{4,0}};
      Numero_complejo num = new Numero_complejo(3,2);
      double[][] elementosR={{12,21},{0,0},{13,13},{12,8}};
      Vector v1 =new Vector(elementos1);
      Vector Result=new Vector(elementosR);
      Vector Test =v1.Multiplicacion_Escalar(num);
      Assert.assertTrue(Result.equals(Test));
    }
    
    
    @Test
    public void InnerProductTest(){
      double[][] elementos1={{6,-4},{7,3},{4.2,8.1},{0,-3}};
      double[][] elementos2={{16,2.3},{0,7},{6,0},{0,-4}};
      Numero_complejo Result=new Numero_complejo(145,78.2);
      Vector v1 =new Vector(elementos1);
      Vector v2 =new Vector(elementos2);
      Numero_complejo Test =v1.InnerProduct(v2);
      Assert.assertTrue(Result.equals(Test));
    }
    
    @Test
    public void ConjugadoTest(){
      double[][] elementos1={{6,-4},{7,3},{4.2,8.1},{0,-3}};
      double[][] elementosR={{6,4},{7,-3},{4.2,-8.1},{0,3}};
      Vector v1 =new Vector(elementos1);
      Vector Result=new Vector(elementosR);
      Vector Test =v1.Inversa();
      Assert.assertTrue(Result.equals(Test));
    }
    
    @Test
    public void NormaTest(){
      double[][] elementos1={{6,-4},{7,3},{4.2,8.1},{0,-3}};
      Vector v1 =new Vector(elementos1);
      double Test =v1.Norma();
      Assert.assertTrue(Test-1<=14.2 && 14.2<=Test+1);
    }
    
    @Test
    public void DistanciaTest(){
      double[][] elementos1={{6,-4},{7,3},{4.2,8.1},{0,-3}};
      double[][] elementos2={{6,-4},{7,3},{4.2,8.1},{0,-3}};
      Vector v1 =new Vector(elementos1);
      Vector v2 =new Vector(elementos2);
      double Test =v1.Distancia(v2);
      Assert.assertTrue(Test<=0+0.2 || 0-0.2<=Test);
    }
    
    @Test
    public void normalizarTest(){
        double[][] elementos1={{2,-3},{1,2}};
        double[][] elementosResp={{0.41714,-0.70711},{0.23570,0.47140}};
        Vector v1 =new Vector(elementos1);
        Vector vR =new Vector(elementosResp);
        v1.normalizar();
        Assert.assertTrue(v1.equals(vR));
    }
    
    @Test
    public void RespresentanMismo(){
        double[][] elementos1={{1,1},{0,1}};
        double[][] elementos2={{2,4},{3,-1}};
        Vector v1 =new Vector(elementos1);
        Vector v2 =new Vector(elementos2);
        Numero_complejo Result=new Numero_complejo(3, 1);
        v1=v1.Multiplicacion_Escalar(Result);
        v2=v2.Multiplicacion_Escalar(Result);
        Assert.assertTrue(v1.Probabilidad(0)<=v2.Probabilidad(0)+0.2 || v1.Probabilidad(0)>=v2.Probabilidad(0)-0.2);
    }
    
    @Test
    public void amplitudTest(){
        double[][] elementos1={{1,0},{0,-1}};
        double[][] elementos2={{0,1},{1,0}};
        Vector v1 =new Vector(elementos1);
        Vector v2 =new Vector(elementos2);
        Numero_complejo Result=new Numero_complejo(0, -1);
        Numero_complejo test = v1.amplitud(v2);
        test.print();
        Assert.assertTrue(test.equals(Result));
    }
    
    @After
    public void tearDown() {
    }
    
}
