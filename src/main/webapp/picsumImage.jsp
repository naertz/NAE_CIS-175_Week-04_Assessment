<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link rel="icon" href="#">
        <title>Random Image Fetcher - Lorem Picsum Image</title>
    </head>
    <body>
        <h1>Lorem Picsum</h1>
        <div>
            <img src="${Picsum.getURL()}">
        </div>
        <a href="index.jsp">Return to home</a>
    </body>
</html>