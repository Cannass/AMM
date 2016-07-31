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
public class Oggetti {

    private Integer id;
    private String descrizione;
    private String nome;
    private String urlimg;
    private double prezzo;
    private Integer quantita;

    public Oggetti() {
        this.id = 0;
        this.prezzo = 0.0;
        this.quantita = 0;
        this.descrizione = "";
        this.urlimg = "";
        this.nome = "";
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the descrizione
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * @param descrizione the descrizione to set
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
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
     * @return the urlimg
     */
    public String getUrlimg() {
        return urlimg;
    }

    /**
     * @param urlimg the urlimg to set
     */
    public void setUrlimg(String urlimg) {
        this.urlimg = urlimg;
    }

    /**
     * @return the prezzo
     */
    public double getPrezzo() {
        return prezzo;
    }

    /**
     * @param prezzo the prezzo to set
     */
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    /**
     * @return the quantita
     */
    public Integer getQuantita() {
        return quantita;
    }

    /**
     * @param quantita the quantita to set
     */
    public void setQuantita(Integer quantita) {
        this.quantita = quantita;
    }

}
