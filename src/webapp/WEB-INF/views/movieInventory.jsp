<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
            <div class="jumbotron">
                <h1>Movies list</h1>
                <p>Here you can find all the movies</p>
            </div>
        <br>
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Name</th>
                <th>Condition</th>
                <th>Price</th>
                <th>Manufacturer</th>
                <th>Info</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${movieList}" var="movie">
            <tr>
                <td>${movie.movieName}</td>
                <td>${movie.movieType}</td>
                <td>${movie.movieIMDB}</td>
                <td>${movie.moviePrice}</td>
                <td><a href="<c:url value="/movieList/${movie.movieId}"/>">Info </a>
                <a href="<c:url value="/movieList/${movie.movieId}"/>">Edit </a>
                <a href="<c:url value="/movieList/${movie.movieId}"/>">Delete </a>
                </td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
        <a href="<c:url value="/admin/movieInventory/addMovie"/>">
            <button type="button" class="btn btn-success">Add Movie</button>
        </a>
    </div>
</div>


<%@include file="/WEB-INF/views/template/footer.jsp" %>
