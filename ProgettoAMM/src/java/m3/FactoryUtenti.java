/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3;

import java.util.ArrayList;

/**
 *
 * @author canna
 */
public class FactoryUtenti {

    private static FactoryUtenti singleton;

    public static FactoryUtenti getInstance() {
        if (getSingleton() == null) {
            setSingleton(new FactoryUtenti());
        }
        return getSingleton();
    }

    /**
     * @return the singleton
     */
    public static FactoryUtenti getSingleton() {
        return singleton;
    }

    /**
     * @param aSingleton the singleton to set
     */
    public static void setSingleton(FactoryUtenti aSingleton) {
        singleton = aSingleton;
    }

    private ArrayList<Utente> listclient = new ArrayList();

    private ArrayList<Utente> listsellers = new ArrayList();

    public FactoryUtenti() {

        Cliente cliente0 = new Cliente();
        cliente0.setNome("Michele");
        cliente0.setCognome("Cannas");
        cliente0.setUsername("Mcannas");
        cliente0.setPassword("darkside");
        cliente0.getSaldo().setSaldo(100.0);
        cliente0.setId(1);
        listclient.add(cliente0);

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Ittiri");
        cliente1.setCognome("Ittiri");
        cliente1.setUsername("Ittiri0");
        cliente1.setPassword("palio");
        cliente1.getSaldo().setSaldo(5.0);
        cliente1.setId(2);
        listclient.add(cliente1);

        Venditori venditore0 = new Venditori();
        venditore0.setNome("Gaben");
        venditore0.setCognome("Gabe");
        venditore0.setUsername("Steam");
        venditore0.setPassword("money");
        venditore0.getSaldo().setSaldo(1000.0);
        venditore0.setId(3);
        listsellers.add(venditore0);

        Venditori venditore1 = new Venditori();
        venditore1.setNome("Giorgio");
        venditore1.setCognome("Mastrotta");
        venditore1.setUsername("Eminflex");
        venditore1.setPassword("soloperoggi");
        venditore1.getSaldo().setSaldo(10000.0);
        venditore1.setId(4);
        listsellers.add(venditore1);

    }

    /**
     * @return the listclient
     */
    public ArrayList<Utente> getListclient() {
        return listclient;
    }

    public Utente getUtenteId(int id) {
        for (Utente user : getListclient()) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    /**
     * @param listclient the listclient to set
     */
    public void setListclient(ArrayList<Utente> listclient) {
        this.listclient = listclient;
    }

    public ArrayList<Utente> getListaUtenti() {

        ArrayList<Utente> listaUtenti = new ArrayList();

        listaUtenti.addAll(listsellers);
        listaUtenti.addAll(listclient);

        return listaUtenti;
    }

    /**
     * @return the listsellers
     */
    public ArrayList<Utente> getListsellers() {
        return listsellers;
    }

    /**
     * @param listsellers the listsellers to set
     */
    public void setListsellers(ArrayList<Utente> listsellers) {
        this.listsellers = listsellers;
    }

}
