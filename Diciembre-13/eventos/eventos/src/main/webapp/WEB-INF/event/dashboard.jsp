<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Document</title>
            </head>

            <body>
                <h1>Events</h1>
                <nav>
                    <h1>WELCOME NINJA</h1>
                    <a href="#">logout</a>
                </nav>

                <h2>Events in your state</h2>
                <table>
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Date</th>
                            <th>Location</th>
                            <th>Host</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="evento" items="${eventos}">
                            <tr>
                                <td>
                                    <c:out value="${evento.getName()}" />
                                </td>
                                <td>
                                    <c:out value="${evento.getDate().toString()}" />
                                </td>
                                <td>
                                    <c:out value="${evento.getLocation()}" />
                                </td>
                                <td>
                                    <c:out value="${evento.getUser().getFirstName()}" />
                                </td>
                                <td>
                                    <c:choose>
                                        
                                        <c:when test="${evento.getUser().getId()== userId}">
                                            <a href="/events/${evento.getId()}">Edit</a>
                                        </c:when>

                                       
                                        <c:when test="${1==2}">
                                            <form action="/event/${evento.getId()}/cancel">
                                                <button type="submit">Cancel</button>
                                            </form>
                                        </c:when>

                                        <c:otherwise>
                                            <form action="/event/${evento.getId()}/join">
                                                <button type="submit">JOIN</button>
                                            </form>
                                        </c:otherwise>
                                    </c:choose>
                                </td>

                            </tr>
                        </c:forEach>
                    </tbody>
                </table>

                <h2>Events in other states</h2>
                <table>
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Date</th>
                            <th>Location</th>
                            <th>State</th>
                            <th>Host</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>

                    </tbody>
                </table>
                <hr>

                <form:form action="/events" method="post" modelAttribute="event">
                    <form:hidden path="user" value="${userId}" />
                    <p>
                        <form:label path="name">name</form:label>
                        <form:input path="name" />
                        <form:errors path="name" />
                    </p>
                    <p>
                        <form:label path="location">Location</form:label>
                        <form:input path="location" />
                        <form:errors path="location" />
                    </p>
                    <p>
                        <form:label path="states">State</form:label>
                        <form:input path="states" />
                        <form:errors path="states" />
                    </p>
                    <p>
                        <!-- TAG PARA ACONDICIONAR FECHA OJO CON EL FORMATO -->
                        <fmt:formatDate value="${event.date}" var="date" pattern="yyyy-MM-dd" />
                        <form:label path="date">Date</form:label>
                        <form:input path="date" type="date" />
                        <form:errors path="date" />
                    </p>
                    <input type="submit" value="Submit" />
                </form:form>
            </body>

            </html>