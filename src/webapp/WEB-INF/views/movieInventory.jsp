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
                <th>Picture</th>
                <th>Name</th>
                <th>Type</th>
                <th>IMDB</th>
                <th>Duration</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${movieList}" var="movie">
            <tr>
                <td><img src="<c:url value="/resources/image/${movie.movieId}.png"/>" alt="image" style="width: 100%;"/> </td>
                <td>${movie.movieName}</td>
                <td>${movie.movieType}</td>
                <td>${movie.movieIMDB}</td>
                <td>${movie.movieDuration}</td>
                <td><a href="<c:url value="/admin/movieInventory/${movie.movieId}"/>">Info </a>
                <a href="<c:url value="/admin/movieInventory/editMovie/${movie.movieId}"/>">Edit </a>
                <a href="<c:url value="/admin/movieInventory/deleteMovie/${movie.movieId}"/>">Delete </a>
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
