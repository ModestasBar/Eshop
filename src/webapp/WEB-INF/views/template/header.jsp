<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Landing Page - Start Bootstrap Theme</title>
    <%--Angular script--%>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.1/angular.min.js"></script>

    <%--Jquery--%>
    <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.4.min.js"></script>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="<c:url value="/resources/vendor/fontawesome-free/css/all.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/vendor/simple-line-icons/css/simple-line-icons.css"/>" rel="stylesheet"
          type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet"
          type="text/css">


    <!-- Custom styles for this template -->
    <link href="<c:url value="/resources/css/landing-page.min.css"/>" rel="stylesheet">

    <%--Edit bootstrap css--%>
    <link href="<c:url value="/resources/css/custom.css"/>" rel="stylesheet">


</head>

<body>

<!-- Navigation -->

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="<c:url value="/"/>">Movies for you</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active custom-control-inline"><a href="<c:url value="/"/>">Home</a></li>
            <li><a href="<c:url value="/movieList"/>">Movies</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="<c:url value="/admin"/>"><span class="glyphicon glyphicon-user"></span> Admin </a></li>
            <li><a href="<c:url value="/register"/>"><span class="glyphicon glyphicon-user"></span> Sign Up </a></li>
            <li><a href="<c:url value="/login"/> "><span class="glyphicon glyphicon-log-in"></span> Login </a></li>
        </ul>
    </div>
</nav>