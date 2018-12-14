<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="jumbotron">
            <h1>User register successfully!</h1>
        </div>
        <h3>
        <a href="<c:url value="/login"/>">Login</a>
        </h3>
        <a href="<c:url value="/"/>">
            <button type="button" class="btn btn-default">Back</button>
        </a>
    </div>
</div>


<%@include file="/WEB-INF/views/template/footer.jsp" %>
