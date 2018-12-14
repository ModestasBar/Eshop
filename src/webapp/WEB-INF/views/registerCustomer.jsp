<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="jumbotron">
            <h1>Registration</h1>
            <p>Customer registration</p>
        </div>
        <form:form action="${pageContext.request.contextPath}/register" method="post"
                   modelAttribute="customer" enctype="multipart/form-data">
            <div class="form-group">
                <label for="name">Name</label>
                <form:input path="customerName" id="name" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <form:input path="customerEmail" id="email" class="form-control"/>
            </div>

            <div class="form-group">
                <label for="phone">Phone number</label>
                <form:input path="customerPhone" id="phone" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="username">Username</label>
                <form:input path="username" id="username" class="form-control"/>
            </div>
            
            <div class="form-group">
                <label for="password">Password</label>
                <form:password path="password" id="password" class="form-control"/>
            </div>

            <br>
            <h3>Billing Address</h3>

            <div class="form-group">
                <label for="street">Street Name</label>
                <form:input path="billingAddress.streetName" id="street" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="apartment">Apartment number</label>
                <form:input path="billingAddress.apartmentNumber" id="apartment" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="city">City</label>
                <form:input path="billingAddress.city" id="city" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="state">State</label>
                <form:input path="billingAddress.state" id="state" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="country">Country</label>
                <form:input path="billingAddress.country" id="country" class="form-control"/>
            </div>
            <div class="form-group">
                <label for="zip">Zip code</label>
                <form:input path="billingAddress.zipCode" id="zip" class="form-control"/>
            </div>

            <input value="Submit" class="btn btn-success" type="submit">
            <a href="<c:url value="/"/>" class="btn btn-default">Cancel</a>
        </form:form>


    </div>
</div>


<%@include file="/WEB-INF/views/template/footer.jsp" %>
