<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
        </head>

        <body>
            <h1>Your GOLD :
                <c:out value="${gold}" />
            </h1>

            <div>
                <h2>FARM</h2>
                <h3>(earns 10-20 gold)</h3>
                <form action="/play" method="POST">
                    <input type="hidden" name="type" value="farm">
                    <button>Find Gold</button>
                </form>
            </div>
            <div>
                <h2>CAVE</h2>
                <h3>(earns 5-10 gold)</h3>
                <form action="/play" method="POST">
                    <input type="hidden" name="type" value="cave">
                    <button>Find Gold</button>
                </form>
            </div>
            <div>
                <h2>HOUSE</h2>
                <h3>(earns 2-5 gold)</h3>
                <form action="/play" method="POST">
                    <input type="hidden" name="type" value="house">
                    <button>Find Gold</button>
                </form>
            </div>
            <div>
                <h2>CASINO</h2>
                <h3>(earns/takes 0-50 gold)</h3>
                <form action="/play" method="POST">
                    <input type="hidden" name="type" value="casino">
                    <button>Find Gold</button>
                </form>
            </div>
            <hr>
            <div>
                <p>
                    ACTIVIDADES
                </p>
            </div>
        </body>

        </html>