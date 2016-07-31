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
public class FactoryOggetti {

    private static FactoryOggetti singleton;

    public static FactoryOggetti getInstance() {
        if (getSingleton() == null) {
            setSingleton(new FactoryOggetti());
        }
        return getSingleton();
    }

    /**
     * @return the singleton
     */
    public static FactoryOggetti getSingleton() {
        return singleton;
    }

    /**
     * @param aSingleton the singleton to set
     */
    public static void setSingleton(FactoryOggetti aSingleton) {
        singleton = aSingleton;
    }
    private ArrayList<Oggetti> listaoggetti = new ArrayList();

    public FactoryOggetti() {

        Oggetti ogg0 = new Oggetti();
        ogg0.setId(1);
        ogg0.setNome("Alabarda Cavaliere Nero");
        ogg0.setDescrizione("Danni extra con demoni Capra/Toro");
        ogg0.setUrlimg("alabarda.png");
        ogg0.setPrezzo(70.00);
        ogg0.setQuantita(2);

        Oggetti ogg1 = new Oggetti();
        ogg1.setId(2);
        ogg1.setNome("Spadone dell'Abisso");
        ogg1.setDescrizione("Scala con umanita'");
        ogg1.setUrlimg("abisso.png");
        ogg1.setPrezzo(35.00);
        ogg1.setQuantita(9);

        Oggetti ogg2 = new Oggetti();
        ogg2.setId(3);
        ogg2.setNome("Spadone di Artorias (maledetto)");
        ogg2.setDescrizione("Ferisce i fantasmi");
        ogg2.setUrlimg("artorias.png");
        ogg2.setPrezzo(55.00);
        ogg2.setQuantita(4);

        Oggetti ogg3 = new Oggetti();
        ogg3.setId(4);
        ogg3.setNome("Anello di Havel");
        ogg3.setDescrizione("Aumenta carico massimo di Equip del 50%");
        ogg3.setUrlimg("Havel.jpg");
        ogg3.setPrezzo(30.00);
        ogg3.setQuantita(4);

        Oggetti ogg4 = new Oggetti();
        ogg4.setId(5);
        ogg4.setNome("Anello del Lupo");
        ogg4.setDescrizione("Aumenta l'equilibrio di 40.");
        ogg4.setUrlimg("lupo.jpg");
        ogg4.setPrezzo(15.00);
        ogg4.setQuantita(8);

    }

    /**
     * @return the listaoggetti
     */
    public ArrayList<Oggetti> getListaoggetti() {
        return listaoggetti;
    }

    /**
     * @param listaoggetti the listaoggetti to set
     */
    public void setListaoggetti(ArrayList<Oggetti> listaoggetti) {
        this.listaoggetti = listaoggetti;
    }

    public Oggetti getId(Integer idAcquisto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
