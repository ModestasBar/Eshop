<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="jumbotron">
            <h1>Administrator page</h1>
            <p>This is administrator page!</p>
        </div>
        <br>
        <h3><a href="<c:url value="/admin/movieInventory"/>">
            Movies inventory
        </a> </h3>
        <p>Movies library controller</p>
        <br>

        <br>
        <h3><a href="#">
            Users
        </a> </h3>
        <p>User information</p>
        <br>

        <a href="<c:url value="/admin/movieInventory"/>">
        <button type="button" class="btn btn-default">Back</button>
        </a>
    </div>
</div>


<%@include file="/WEB-INF/views/template/footer.jsp" %>
