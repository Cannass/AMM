<%-- 
    Document   : riepilogo_articoli
    Created on : 31-lug-2016, 19.42.38
    Author     : canna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>riepilogo_articolo.jsp</title>

    </head>
    <body>
        <p>
            <img title="${oggetto.getNome()}" src="${oggetto.getUrlimg()}" alt="${oggetto.getDescrizione()}" width="80" height="80">
        </p>
        <p>
            Nome: ${oggetto.getNome()}
        </p>
        <p>
            Descrizione: ${oggetto.getDescrizione()}
        </p>
        <p>
            Prezzo: € ${oggetto.getPrezzo()}
        </p>
        <p>
            Quantità: ${oggetto.getQuantita()} pezzi
        </p>
    </body>
</html>
