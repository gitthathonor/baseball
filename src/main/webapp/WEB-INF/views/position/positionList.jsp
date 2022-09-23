<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

<div class="container">
  <table class="table table-striped">
    <thead>
      <tr>
        <th>포지션</th>
        <th>롯데</th>
        <th>LG</th>
        <th>키움</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="position" items="${positionList}">
      <tr>
        <td>${position.position}</td>
        <td>${position.lotte}</td>
        <td>${position.lg}</td>
        <td>${position.kiwoom}</td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
</div>


<%@ include file="../layout/footer.jsp" %>