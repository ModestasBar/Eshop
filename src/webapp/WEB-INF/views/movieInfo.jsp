<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="jumbotron">
            <h1>${movie.movieName}</h1>
        </div>
        <br>
        <div class="row">
            <div class="col-sm-6">
                <img src="#" alt="image" style="width:100%"/>
            </div>
            <div class="col-sm-6">
                <p>${movie.movieType}</p>
                <p>${movie.movieIMDB}</p>
                <p>${movie.movieReleaseYear}</p>
                <p>${movie.moviePrice}</p>
                <p>${movie.movieAbout}</p>
            </div>
        </div>
        <a href="<c:url value="/admin/movieInventory"/>">
        <button type="button" class="btn btn-default">Back</button>
        </a>
    </div>
</div>


<%@include file="/WEB-INF/views/template/footer.jsp" %>
