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
            <tr>
                <td>movieName</td>
                <td>movieCondition</td>
                <td>moviePrice</td>
                <td>movieManufacturer</td>
                <td><a href="#">Info</a> </td>
            </tr>
            </tbody>
        </table>
    </div>
</div>


<%@include file="/WEB-INF/views/template/footer.jsp" %>
