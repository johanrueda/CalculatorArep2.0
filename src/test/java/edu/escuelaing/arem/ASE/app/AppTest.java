package edu.escuelaing.arem.ASE.app;

import org.junit.Test;
import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest{
    /**
     * Deberia calcular la media de los datos
     */
    @Test
    public void calculoMedia(){
        Double[] lista = {160.0,591.0,114.0,229.0,230.0,270.0,128.0,1657.0,624.0,1503.0};
        linkedList linkedlist = new linkedList();
        for (int i = 0; i < lista.length; i++) {
            linkedlist.adiccionar(lista[i]);
        }
        calculadora calculo = new calculadora(linkedlist);
        Assert.assertEquals(550.6, calculo.media(), 0);
    }

    /**
     * Deberia calcular la desviacion de los datos
     */
    @Test
    public void calculoDesviacion(){
        Double[] lista = {160.0,591.0,114.0,229.0,230.0,270.0,128.0,1657.0,624.0,1503.0};
        linkedList linkedlist = new linkedList();
        for (int i = 0; i < lista.length; i++) {
            linkedlist.adiccionar(lista[i]);
        }
        calculadora calculo = new calculadora(linkedlist);
        Assert.assertEquals(572.03, calculo.desviacion(), 0);
    }

    /**
     * Deberia calcular la media de los datos
     */
    @Test
    public void calculoMedia2(){
        Double[] lista = {15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2};
        linkedList linkedlist = new linkedList();
        for (int i = 0; i < lista.length; i++) {
            linkedlist.adiccionar(lista[i]);
        }
        calculadora calculo = new calculadora(linkedlist);
        Assert.assertEquals(60.32, calculo.media(), 0);
    }

    /**
     * Deberia calcular la desviacion de los datos
     */
    @Test
    public void calculoDesviacion2(){
        Double[] lista = {15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2};
        linkedList linkedlist = new linkedList();
        for (int i = 0; i < lista.length; i++) {
            linkedlist.adiccionar(lista[i]);
        }
        calculadora calculo = new calculadora(linkedlist);
        Assert.assertEquals(62.26, calculo.desviacion(), 0);
    }
}