<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="jumbotron">
            <h1>Movie list</h1>
            <p>Here is your movie list</p>
        </div>
        <br>
        <section class="container" ng-app="cartApp">
            <div ng-controller="cartCtrl" ng-init="initCart('${cartId}')">
                <div>
                    <a class="btn btn-danger -pull-left" ng-click="clearCart()">
                        <span class="glyphicon glyphicon-remove-sign"></span>
                        Clear cart
                    </a>
                </div>
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>Name</th>
                        <th>Type</th>
                        <th>IMDB</th>
                        <th>Duration</th>
                        <th>Action</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr ng-repeat="movieItem in movieCart.movieItem">
                        <td>{{movieItem.movie.movieName}}</td>
                        <td>{{movieItem.movie.movieType}}</td>
                        <td>{{movieItem.movie.movieIMDB}}</td>
                        <td>{{movieItem.movie.movieDuration}}</td>
                        <td><a href="#" class="label label-danger" ng-click="removeFromCart(movieItem.movie.movieId)">
                            <span class="glyphicon glypicon-remove"></span>
                            remove
                        </a></td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </section>
    </div>
</div>

<script src="<c:url value="/resources/vendor/bootstrap/js/controller.js" /> "></script>

<%@include file="/WEB-INF/views/template/footer.jsp" %>
