<%-- 
    Document   : login_form
    Created on : 31-lug-2016, 12.22.45
    Author     : canna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login_form.jsp</title>
    </head>
    <body>
        <form method="get">
            <label for="nome">Nome</label>
            <input type="text" name="nome" id="nome" value="Inserisci nome"/>
            <br/>
            <label for="pass">Password</label>
            <input type="password" name="pass" id="pass" value="Inserisci password"/>
            <br/>
            <p>
                <input class='bottone' type="Submit" name="valore" value="Invia">
                <br/>
            </p>


        </form>
    </body>
</html>
