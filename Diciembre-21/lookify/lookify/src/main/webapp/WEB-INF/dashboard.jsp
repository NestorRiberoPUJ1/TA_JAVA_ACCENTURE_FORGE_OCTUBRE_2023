<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


            <nav>
                <a href="/song/new">Add New</a>
                <form action="/dashboard">
                    <input type="hidden" name="top" value="10">
                    <button type="submit">Top Songs</button>
                </form>
                <form action="/dashboard">
                    <input type="text" name="artist">
                    <button type="submit">Buscar Artista</button>
                </form>
            </nav>

            <main>
                <table>
                    <thead>
                        <tr>
                            <th>Titulo</th>
                            <th>Rating</th>
                            <th>Acciones</th>
                        </tr>
                    </thead>
                    <tbody>

                        <c:forEach var="song" items="${songs}">

                            <tr>
                                <td>${song.titulo}</td>
                                <td>${song.clasificacion}</td>
                                <td>
                                    <form:form action="/song/${song.id}" method="post">
                                        <input type="hidden" name="_method" value="delete">
                                        <button type="submit">eliminar</button>
                                    </form:form>
                                </td>
                            </tr>

                        </c:forEach>

                    </tbody>
                </table>

            </main>