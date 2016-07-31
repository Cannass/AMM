/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3;

/**
 *
 * @author canna
 */
public class Saldo {

    private double saldo;

    public Saldo() {
        this.saldo = 0.0;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean controllo(double prezzo) {
        if (prezzo <= this.saldo) {
            return true;
        } else {
            return false;
        }
    }

}
