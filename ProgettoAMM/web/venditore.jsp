<%-- 
    Document   : venditore.jsp
    Created on : 31-lug-2016, 15.23.19
    Author     : canna
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Venditore</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content="anima,oscura,shop anime,shop,cliente">
        <meta name="description" content="shop dell'anima oscura">
        <meta name="author" content="Michele Cannas">
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    <body>
        <div class="header">
            <ul>
                <li>
                    <a href="descrizione.jsp">Home</a>
                </li>
                <li>
                    <a href="login.jsp">Login</a>
                </li><li>
                    <a href="cliente.jsp">Cliente</a>
                </li>
                <li>
                    <a href="venditore.jsp">Venditore</a>
                </li>
        </div>

        <div class="sezione">
            <h3>Sezione Pagina</h3>
            <p>Sezione in manutenzione</p>
        </div>


        <div class="mainlog">
            <div id="venditore">
                <h1>Benvenuto Venditore!</h1>
                <c:choose>
                    <c:when test="${venditoreloggato}">
                        <c:choose>
                            <c:when test="${formOggetto}">

                                <p>
                                    L'articolo inserito.
                                </p>
                                </nav>



                                <h2>Riepilogo dati articolo</h2>
                                <jsp:include page="riepilogo_articoli.jsp"/>


                            </c:when>
                            <c:otherwise>

                                <p>
                                    Benvenuto Venditore, ${venditore.nome} ${venditore.cognome}.
                                    Compila il form per vendere un oggetto.
                                </p>                     



                                <jsp:include page="nuovo_articolo.jsp"/>

                            </c:otherwise>
                        </c:choose>
                    </c:when>
                    <c:otherwise>

                        <p>
                            Accesso negato. Effettua il login.
                        </p>
                        <jsp:include page="login_form.jsp"/>

                    </c:otherwise>
                </c:choose>
            </div>
        </div>
    </div>
    <div class="footercl">
        <ul>
            <a href="https://www.youtube.com/watch?v=2FhecVBMYLU">Youtube</a>
        </ul>
    </div>
</body>
</html>

