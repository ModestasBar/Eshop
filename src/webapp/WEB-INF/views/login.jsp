<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="jumbotron">
            <h1>Login Page</h1>
            <p>Enter your credentials</p>
        </div>
        <c:if test="${not empty error}">
            <div clas="error" style="color:#ff253a">${error}</div>
        </c:if>

        <c:if test="${not empty logout}">
            <div class="logout" style="color:#ff253a">${logout}</div>
        </c:if>

        <form name="loginForm" action="<c:url value="/j_spring_security_check"/>" method="post">
            <div class="form-group">
                <label for="username">User: </label>
                <input type="text" id="username" name="username" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="password">Password: </label>
                <input type="password" id="password" name="password" class="form-control"/>
            </div>

            <input type="submit" value="Submit" class="btn btn-default"/>
            <input type="hidden" value="${_csrf.token}" name="${_csrf.parameterName}">
        </form>
    </div>
</div>


<%@include file="/WEB-INF/views/template/footer.jsp" %>
