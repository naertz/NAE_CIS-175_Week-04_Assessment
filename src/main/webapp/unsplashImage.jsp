<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link rel="icon" href="#">
        <title>Random Image Fetcher - Unsplash Image</title>
    </head>
    <body>
        <h1>Unsplash</h1>
        <div>
            <img src="${Unsplash.getURL()}">
        </div>
        <a href="index.jsp">Return to home</a>
    </body>
</html>