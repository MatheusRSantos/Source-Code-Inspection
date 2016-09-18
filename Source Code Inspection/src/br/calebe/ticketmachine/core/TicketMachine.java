package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class TicketMachine {

    protected int saldo;
    protected int precoDoBilhete;
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};

    public TicketMachine(int precoDoBilhete) {
        this.precoDoBilhete = precoDoBilhete;
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
        this.saldo += quantia;
    }

    public int getSaldo() {
        return saldo;
    }

    public Iterator getTroco() {
        Iterator troco = new Troco(this.saldo).getIterator();
        this.saldo = 0;
        return troco;
    }

    public String imprimir() throws SaldoInsuficienteException {
        if (saldo < precoDoBilhete) {
            throw new SaldoInsuficienteException("Saldo insulficiente.");
        } else {
            saldo -= precoDoBilhete;
            String result = "**************\n";
            result += " R$ " + saldo + ",00 *\n";
            result += "**************\n";
            return result;
        }
    }
}
