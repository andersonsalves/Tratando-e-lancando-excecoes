package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public class ContaCorrente {

    private double saldo;

    /**
     * Construtor.
     * @param saldo 
     */
    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    /**
     * 
     * @param deposito 
     */
    public void depositar(double deposito) {
        
        if (deposito <= 0) {
            throw new IllegalArgumentException("O valor nao pode ser menor que zero.");
        }
        
        this.saldo += deposito;
    }

    /**
     * 
     * @param quantidade
     * @throws SaldoInsuficienteException 
     */
    public void sacar(double quantidade) throws SaldoInsuficienteException {
        
        double saldoTemp = saldo - quantidade;
        
        if(saldoTemp < 0) {
            throw new SaldoInsuficienteException("Voce nao possui saldo suficiente");
        }
        
        this.saldo -= quantidade;
    }

    
    // Getters e Setters
    
    public double getSaldo() {
        return this.saldo;
    }
}
