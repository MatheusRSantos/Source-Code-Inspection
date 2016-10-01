package br.calebe.ticketmachine.core;

import org.junit.Test;
import static org.junit.Assert.*;

public class PapelMoedaTeste {
    
    protected int valor;
    
    public PapelMoedaTeste() {}
    
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public int getValor() {
        return this.valor;
    }
    
    @Test
    public void testRetornoValorPapelMoeda() {
        PapelMoedaTeste a = new PapelMoedaTeste();
        PapelMoedaTeste b = new PapelMoedaTeste();
        
        a.setValor(3);
        b.setValor(5);
        
        assertEquals(3, a.getValor());
        assertEquals(5, b.getValor());
    }
    
}
