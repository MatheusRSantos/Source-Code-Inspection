package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class TicketMachine {

    protected int valor;
    protected int precoDoBilhete;
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};

    public TicketMachine(int valor) {
        this.valor = valor;
        this.precoDoBilhete = 0;
    }

    public void inserir(int quantia) throws PapelMoedaInvalidaException {
        boolean achou = false;
        for (int i = 0; i < papelMoeda.length && !achou; i++) {
            if (papelMoeda[i] == quantia) {
                achou = true;
            }
        }
        if (!achou) {
            throw new PapelMoedaInvalidaException("Nota inválida");
        }
        this.precoDoBilhete += quantia;
    }

    public int getSaldo() {
        return precoDoBilhete;
    }

    public Iterator<PapelMoeda> getTroco() {
        return new Troco(this.precoDoBilhete).getIterator();
    }

    public String imprimir() throws SaldoInsuficienteException {
        if (precoDoBilhete < valor) {
            throw new SaldoInsuficienteException("Saldo insulficiente.");
        } else {
            precoDoBilhete -= valor;
            String result = "**************\n";
            result += " R$ " + precoDoBilhete + ",00 *\n";
            result += "**************\n";
            return result;
        }
    }
}
