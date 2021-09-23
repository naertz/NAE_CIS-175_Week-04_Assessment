<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <link rel="icon" href="#">
        <title>Random Image Fetcher - Unsplash Form</title>
    </head>
    <body>
        <h1>Unsplash</h1>
        <form action="getUnsplashServlet" method="post">
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
                    <label for="seed">Keywords (Use multiple keywords separated by commas and no spaces)</label>
                    <input type="text" name="keywords">
                </div>
                <div>
                    <input type="reset" name="Reset">
                    <input type="submit" name="Submit">
                </div>
            </fieldset>
        </form>
    </body>
</html>