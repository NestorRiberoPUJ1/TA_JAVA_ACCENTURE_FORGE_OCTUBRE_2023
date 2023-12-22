<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

            <a href="/dashboard">dashboard</a>

            <form:form action="/song" method="post" modelAttribute="song">
                <p>
                    <form:label path="titulo">titulo</form:label>
                    <form:input path="titulo" />
                    <form:errors path="titulo" />
                </p>
                <p>
                    <form:label path="artista">artista</form:label>
                    <form:input path="artista" />
                    <form:errors path="artista" />
                </p>
                <p>
                    <form:label path="clasificacion">clasificacion</form:label>
                    <form:input type="number" path="clasificacion" />
                    <form:errors path="clasificacion" />
                </p>
                <input type="submit" value="Submit" />
            </form:form>