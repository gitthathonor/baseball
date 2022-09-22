<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

<div class="container">
  <table class="table table-striped">
    <thead>
      <tr>
        <th>번호</th>
        <th>경기장</th>
        <th>개장일</th>
        <th>수정</th>
        <th>삭제</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="stadium" items="${stadiumList}">
      <tr>
        <td>${stadium.id}</td>
        <td>${stadium.name}</td>
        <td>${stadium.createdAt}</td>
        <td><button>수정</button></td>
        <td><button>삭제</button></td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
</div>

<%@ include file="../layout/footer.jsp" %>