package br.calebe.ticketmachine.core;

public class PapelMoedaTeste {

    protected int valor;

    public PapelMoedaTeste(int valor) {}
    
    public void setValor(int valor) {
    	this.valor = valor;
    }
    
    public int getValor() {
    	return this.valor;
    }
    
    @Teste
    public int testePapelMoeda() {
    	PapelMoedaTeste a = new PapelMoedaTeste();
    	PapelMoedaTeste b = new PapelMoedaTeste();
    	
    	a.setValor(3);
    	b.setValor(5);
    	
    	assertEquals(3, a.getValor()); 
    	assertEquals(5, b.getValor());    	
    }

}
