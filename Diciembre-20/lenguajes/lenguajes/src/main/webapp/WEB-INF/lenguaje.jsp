<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

            <form:form action="/lenguajes/${currentlenguaje.id}" method="post" modelAttribute="lenguaje">
                <input type="hidden" name="_method" value="put">
                <form:hidden path="id" value="${currentlenguaje.id}" />

                <p>
                    <form:label path="nombre">nombre</form:label>
                    <form:input path="nombre" value="${currentlenguaje.nombre}" />
                    <form:errors path="nombre" />
                </p>
                <p>
                    <form:label path="creador">creador</form:label>
                    <form:input path="creador" value="${currentlenguaje.creador}" />
                    <form:errors path="creador" />
                </p>
                <p>
                    <form:label path="version">version</form:label>
                    <form:input path="version" value="${currentlenguaje.version}" />
                    <form:errors path="version" />
                </p>
                <input type="submit" value="Submit" />
            </form:form>