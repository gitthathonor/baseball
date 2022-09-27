<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

<div class="container">
  <table class="table table-striped">
    <thead>
     <!-- for문을 돌려야함  -->
      <tr>
        <th>포지션</th>
        <c:forEach var="teamName" items="${teamNameList}">
        	<td>${teamName}</td>
        </c:forEach>
      </tr>
    </thead>
    <tbody>
    <!-- for문을 돌려야함  -->
    <c:forEach var="position" items="${positionList}">
      <tr>
        <td>${position.position}</td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
</div>

<%@ include file="../layout/footer.jsp" %>