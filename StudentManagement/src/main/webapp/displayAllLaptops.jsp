<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false"
%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<center>
    <!-- <h1>Students List</h1> -->
    <h1>Students List</h1>
    <!-- <form action = "updateOrDelete" method = "post"> -->
    <table border="5" cellpadding='8'>
        <tr>

            <!-- <th>Select</th> -->
            <th>ID</th>
            <th>BRAND</th>
            <th>RAM</th>
            <th>COST</th>

        </tr>
        <c:forEach var="laptop" items="${list}">
            <tr>


                <!-- <td><input type = "radio" name = "key" value = "${emp.id}" ></td> -->
                <td>${laptop.lid}</td>
                <td>${laptop.lbrand}</td>
                <td>${laptop.ram}</td>
                <td>${laptop.cost}</td>


            </tr>
        </c:forEach>
    </table>
    <br>
    <br>
    <!-- <input type = "submit" name = "action" value = "update">
     <input type = "submit" name = "action" value = "delete"> -->

    <br/>
    <!-- <form action = "updateStudent">
    <input type = "submit" value = "update">
     <form action = "deleteStudent">
    <input type = "submit" value = "delete"> -->
    <br>
    <form action="index.jsp">
        <input type="submit" value="Homepage">
    </form>
    <br>


</center>
   