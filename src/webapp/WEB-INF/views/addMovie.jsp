<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="jumbotron">
            <h1>Add Movie</h1>
            <p>Here you can add a movie</p>
        </div>
        <form:form action="${pageContext.request.contextPath}/admin/movieInventory/addMovie" method="post"
                   modelAttribute="movie" enctype="multipart/form-data">

            <div class="form-group">
                <label for="name">Name</label>
                <form:input path="movieName" id="name" class="form-Control"/>
            </div>
            <div class="form-group">
                <label for="type">Type</label>
                <label class="checkbox-inline"><form:radiobutton path="movieType" id="type" value="Action"/>Action</label>
                <label class="checkbox-inline"><form:radiobutton path="movieType" id="type" value="Horror"/>Horror</label>
                <label class="checkbox-inline"><form:radiobutton path="movieType" id="type" value="Comendy"/>Comedy</label>
            </div>
            <div class="form-group">
                <label for="date">Date</label>
                <form:input path="movieReleaseYear" id="date" class="form-Control"/>
            </div>
            <div class="form-group">
                <label for="price">Price</label>
                <form:input path="moviePrice" id="price" class="form-Control"/>
            </div>
            <div class="form-group">
                <label for="IMDB">IMBD Score</label>
                <label class="checkbox-inline"><form:radiobutton path="movieIMDB" id="IMDB" value="<5"/><5</label>
                <label class="checkbox-inline"><form:radiobutton path="movieIMDB" id="IMDB" value="5 - 7"/>5 - 7</label>
                <label class="checkbox-inline"><form:radiobutton path="movieIMDB" id="IMBD" value=">7"/>>7</label>
            </div>

            <div class="form-group">
                <label for="about">Description</label>
                <form:textarea path="movieAbout" id="about" class="form-Control"/>
            </div>

            <input type="submit" value="Submit" class="btn btn-success"/>
            <a href="<c:url value="/admin/movieInventory"/>">
                <button type="button" class="btn btn-default">Back</button>
            </a>

        </form:form>

    </div>
</div>


<%@include file="/WEB-INF/views/template/footer.jsp" %>
