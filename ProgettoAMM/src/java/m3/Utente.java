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
public class Utente {

    private String nome;
    private String cognome;
    private String username;
    private String password;
    private Saldo saldo;
    private int id;
    private String tipoUtente;

    public Utente(String tipoUtente) {
        nome = "";
        cognome = "";
        username = "";
        password = "";
        saldo = new Saldo();
        id = 0;
        this.tipoUtente = tipoUtente;

    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome the cognome to set
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the saldo
     */
    public Saldo getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the tipoUtente
     */
    public String getTipoUtente() {
        return tipoUtente;
    }

    /**
     * @param tipoUtente the tipoUtente to set
     */
    public void setTipoUtente(String tipoUtente) {
        this.tipoUtente = tipoUtente;
    }
}
