<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link rel="icon" href="#">
        <title>Random Image Fetcher - Lorem Picsum Form</title>
    </head>
    <body>
        <h1>Lorem Picsum</h1>
        <form action="getPicsumServlet" method="post">
            <fieldset>
                <legend>Enter image parameters</legend>
                <div>
                    <label for="width">Width</label>
                    <input type="text" name="width">
                </div>
                <div>
                    <label for="height">Height</label>
                    <input type="text" name="height">
                </div>
                <div>
                    <label for="seed">Seed</label>
                    <input type="text" name="seed">
                </div>
                <div>
                    <input type="reset" name="Reset">
                    <input type="submit" name="Submit">
                </div>
            </fieldset>
        </form>
    </body>
</html>