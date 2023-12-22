<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

            <table>
                <thead>
                    <tr>
                        <th>
                            Nombre
                        </th>
                        <th>
                            Creador
                        </th>
                        <th>
                            Version
                        </th>
                        <th>
                            Accion
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="item" items="${lenguajes}">

                        <tr>
                            <td>${item.nombre}</td>
                            <td>${item.creador}</td>
                            <td>${item.version}</td>
                            <td>
                                <a href="/lenguajes/${item.id}">editar</a>
                                <a href="/lenguajes/eliminar/${item.id}">eliminar</a>
                            </td>
                        </tr>

                    </c:forEach>
                </tbody>
            </table>

            <hr>

            <form:form action="/lenguajes" method="post" modelAttribute="lenguaje">
                <p>
                    <form:label path="nombre">nombre</form:label>
                    <form:input path="nombre" />
                    <form:errors path="nombre" />
                </p>
                <p>
                    <form:label path="creador">creador</form:label>
                    <form:input path="creador" />
                    <form:errors path="creador" />
                </p>
                <p>
                    <form:label path="version">version</form:label>
                    <form:input path="version" />
                    <form:errors path="version" />
                </p>
                <input type="submit" value="Submit" />
            </form:form>