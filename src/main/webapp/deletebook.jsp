<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Delete Book</title>
</head>
<body>
    <h2>Delete Book Confirmation</h2>
    <p>are you sure, that you want to <strong>${book.title}</strong> (ISBN: ${book.isbn}) delete?</p>

    <a href="deletebook?isbn=${book.isbn}">Yes, delete book</a>
    <a href="viewbooks">Cancel</a>
</body>
</html>