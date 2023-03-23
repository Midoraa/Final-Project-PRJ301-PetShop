<%-- 
    Document   : food
    Created on : 17-03-2023, 13:24:20
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
<%@include file="include/food_form.jsp" %>
<div class="pagination pagination-lg m-2 d-flex justify-content-center">
    <div class="page-item"><a class="page-link" href="food?page=first">First</a></div>
<c:choose>
    <c:when test="${page<=3}">
        <c:forEach var="i" begin="1" end="5">
            <c:if test="${i>0 and i<=maxPage}"><div class="page-item"><a class="page-link" href="food?page=${i}">${i}</a></div></c:if>
        </c:forEach>

    </c:when>
    <c:when test="${page>=maxPage-2}">
        <c:forEach var="i" begin="${maxPage-4}" end="${maxPage}">
            <c:if test="${i>0 and i<=maxPage}"><div class="page-item"><a class="page-link" href="food?page=${i}">${i}</a></div></c:if>

        </c:forEach>
    </c:when>
    <c:otherwise>
        <c:forEach var="i" begin="${page-2}" end="${page+2}">
            <c:if test="${i>0 and i<=maxPage}"><div class="page-item"><a class="page-link" href="food?page=${i}">${i}</a></div></c:if>

        </c:forEach>
    </c:otherwise>
</c:choose>
            <div class="page-item"><a class="page-link" href="food?page=last">last</a></div>
</div>
<%@include file="include/footer.jsp" %>