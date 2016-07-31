<%-- 
    Document   : login
    Created on : 31-lug-2016, 13.01.57
    Author     : canna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content="anima,oscura,shop anime,shop,login">
        <meta name="description" content="Login dell'anima oscura">
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
            <h1 id="login">Benvenuto nella sezione Login dell'anima Oscura!</h1>
            <div id="form">
                <jsp:include page="login_form.jsp"/>     

                </form>
            </div>


        </div>
        <div class="footerlog">
            <a href="https://www.youtube.com/watch?v=2FhecVBMYLU">Youtube</a>
        </div>
    </body>
</html>
