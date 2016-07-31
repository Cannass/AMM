<%-- 
    Document   : tab_articoli.jsp
    Created on : 31-lug-2016, 15.27.58
    Author     : canna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr class="inde">
                <th> Nome</th>
                <th>Immagine</th>
                <th> Descrizione</th>
                <th>Costo</th>
                <th>Disponibilità</th>
                <th>Acquista</th>                   
            </tr>
            <c:forEach items="${listaOggetti}" var="oggetto">

                <td>${oggetto.getNome()}</td>
                <td><img title="${oggetto.getNome()}" alt="${oggetto.getDescrizione()}" src="${oggetto.getUrlimg()}" width="80" height="80"></td>
                <td>${oggetto.getQuantita()}</td>
                <td>€ ${oggett.getPrezzo()}</td>
                <td> <a href="cliente.html?idAcquisto=${oggetto.getId()}">Aggiungi al carrello</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
