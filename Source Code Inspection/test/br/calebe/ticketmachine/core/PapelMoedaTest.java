package br.calebe.ticketmachine.core;

import org.junit.Test;
import static org.junit.Assert.*;

public class PapelMoedaTest {
    
    protected int valor;
    
    public PapelMoedaTest() {}
    
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public int getValor() {
        return this.valor;
    }
    
    @Test
    public void testRetornoValorPapelMoeda() {
        PapelMoedaTest a = new PapelMoedaTest();
        PapelMoedaTest b = new PapelMoedaTest();
        
        a.setValor(3);
        b.setValor(5);
        
        assertEquals(3, a.getValor());
        assertEquals(5, b.getValor());
    }
    
}
