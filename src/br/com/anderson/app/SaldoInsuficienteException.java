package br.com.anderson.app;

/**
 *
 * @author Anderson Silva
 */
public class SaldoInsuficienteException extends Exception {

    /**
     * 
     * @param mensagem 
     */
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
