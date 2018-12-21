var cartApp = angular.module("cartApp", []);

cartApp.controller("cartCtrl", function ($scope, $http) {


    $scope.refreshCart = function () {
        $http.get('/eShop/rest/cart/' + $scope.movieCartId).success(function (data) {
            $scope.movieCart = data;
        });
    };

    $scope.initCart = function (movieCartId) {
        $scope.movieCartId = movieCartId;
        $scope.refreshCart();
    }

    $scope.clearCart = function () {
        $http.delete('/eShop/rest/cart/' + $scope.movieCartId).success($scope.refreshCart());
    };

    $scope.putToCart = function (movieId) {
        $http.put('/eShop/rest/cart/add/' + movieId).success(function () {
            alert("Movie successfully added to movie list!")
        });
    };

    $scope.removeFromCart = function(movieId){
        $http.put('/eShop/rest/cart/remove/' + movieId).success(function(){
            $scope.refreshCart();
        })
    }
});