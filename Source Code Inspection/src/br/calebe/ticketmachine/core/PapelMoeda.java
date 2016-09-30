package br.calebe.ticketmachine.core;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoeda {

    protected int valor;
    protected int quant;

    public PapelMoeda(int valor, int quant) {
        this.valor = valor;
        this.quant = quant;
    }

    public int getValor() {
        return valor;
    }

}
