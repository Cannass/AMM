<%-- 
    Document   : nuovo_articolo
    Created on : 31-lug-2016, 19.38.29
    Author     : canna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>nuovo_articolo.jsp</title>
    </head>
    <body>
        <form method="get">
            <label for="nomeogg">Nome Oggetto</label>
            <input type="text" name="nomeogg" id="nomeogg" value="Inserisci il nome dell'oggetto"/>
            <br />
            <label for="url">Url immagine</label>
            <input type="text" name="url" id="url" value="Inserisci Url immagine"/>
            <br />
            <label for="descrizione">Descrizione</label>
            <textarea rows="4" cols="20" name="descrione" id="descrizione">Inserisci descrizione oggetto</textarea>
            <br />
            <label for="prezzo">Prezzo</label>
            <input type="text" name="prezzo" id="prezzo" value="Inserisci prezzo oggetto"/>
            <br />
            <label for="quantita">Quantita'</label>
            <input type="text" name="quantita" id="quantita" value="Inserisci numero oggetti"/>

            <div class="bottone">
                <input class='bottone' name="SubmitForm" type="submit" value="Invia">
                <br/> 
            </div>
        </form>
    </body>
</html>
