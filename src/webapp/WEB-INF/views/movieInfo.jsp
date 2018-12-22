<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="jumbotron">
            <h1>${movie.movieName}</h1>
        </div>
        <br>
        <div class="container" ng-app="cartApp">
            <div class="row">
                <div class="col-sm-5">
                    <img src="<c:url value="/resources/image/${movie.movieId}.png"/>" alt="image"
                         style="width:100%"/> </p>
                </div>
                <div class="col-sm-5">
                    <p>${movie.movieName}</p>
                    <p>${movie.movieType}</p>
                    <p>${movie.movieIMDB}</p>
                    <p>${movie.movieDuration}</p>
                    <p>${movie.movieReleaseYear}</p>
                    <p>${movie.movieAbout}</p>
                    <br>
                    <p ng-controller="cartCtrl">

                        <c:if test="${pageContext.request.userPrincipal.name == null}">
                            <a href="<c:url value="/movieList"/>">
                                <button type="button" class="btn btn-default">Back</button>
                            </a>
                            <a href="<c:url value="/login"/>" class="btn btn-warning btn-large">
                                Order Now
                            </a>
                            <a href="<c:url value="/customer/cart/"/>" class="btn btn-defaul">
                                View Cart
                            </a>
                        </c:if>
                        <c:if test="${pageContext.request.userPrincipal.name != 'admin'}">
                            <a href="<c:url value="/movieList"/>">
                                <button type="button" class="btn btn-default">Back</button>
                            </a>
                            <a href="#" class="btn btn-warning btn-large" ng-click="putToCart('${movie.movieId}')">
                                Order Now
                            </a>
                            <a href="<c:url value="/customer/cart/"/>" class="btn btn-default">
                                View Cart
                            </a>
                        </c:if>
                        <c:if test="${pageContext.request.userPrincipal.name == 'admin'}">
                            <a href="<c:url value="/admin/movieInventory"/>">
                                <button type="button" class="btn btn-default">Back</button>
                            </a>
                        </c:if>
                    </p>
                </div>
            </div>
        </div>
    </div>
</div>


<script src="<c:url value="/resources/vendor/bootstrap/js/controller.js" /> "></script>


<%@include file="/WEB-INF/views/template/footer.jsp" %>
