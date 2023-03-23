<%-- 
    Document   : pet.jsp
    Created on : 17-03-2023, 13:24:00
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="include/header.jsp" %>
<%@include file="include/pet_form.jsp" %>
<div class="pagination pagination-lg justify-content-center">
    <div class="page-item"><a class="page-link" href="pet?page=first&type=${param.type}">First</a></div>
    <c:choose>
        <c:when test="${page<=3}">
            <c:forEach var="i" begin="1" end="5">
                <c:if test="${i>0 and i<=maxPage}"><div class="page-item"><a class="page-link" href="pet?page=${i}&type=${param.type}">${i}</a></div></c:if>
                </c:forEach>

        </c:when>
        <c:when test="${page>=maxPage-2}">
            <c:forEach var="i" begin="${maxPage-4}" end="${maxPage}">
                <c:if test="${i>0 and i<=maxPage}"><div class="page-item"><a class="page-link" href="pet?page=${i}&type=${param.type}">${i}</a></div></c:if>

            </c:forEach>
        </c:when>
        <c:otherwise>
            <c:forEach var="i" begin="${page-2}" end="${page+2}">
                <c:if test="${i>0 and i<=maxPage}"><div class="page-item"><a class="page-link" href="pet?page=${i}&type=${param.type}">${i}</a></div></c:if>

            </c:forEach>
        </c:otherwise>
    </c:choose>
                <div class="page-item"><a class="page-link" href="pet?page=last&type=${param.type}">Last</a></div>
</div>
<%@include file="include/footer.jsp" %>
