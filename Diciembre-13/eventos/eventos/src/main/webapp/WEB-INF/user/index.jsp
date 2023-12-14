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
                <h1>New User</h1>
                <form:form action="/user" method="post" modelAttribute="user">
                    <p>
                        <form:label path="firstName">Firstname</form:label>
                        <form:input path="firstName" />
                        <form:errors path="firstName" />
                    </p>
                    <p>
                        <form:label path="lastName">Lastname</form:label>
                        <form:input path="lastName" />
                        <form:errors path="lastName" />
                    </p>
                    <p>
                        <form:label path="email">Email</form:label>
                        <form:input path="email" />
                        <form:errors path="email" />
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
                        <form:label path="password">Password</form:label>
                        <form:input path="password" />
                        <form:errors path="password" />
                    </p>
                    <p>
                        <form:label path="confirmPassword">Confirm Password</form:label>
                        <form:input path="confirmPassword" />
                        <form:errors path="confirmPassword" />
                    </p>
                    <input type="submit" value="Submit" />
                </form:form>
                <hr>

            </body>

            </html>