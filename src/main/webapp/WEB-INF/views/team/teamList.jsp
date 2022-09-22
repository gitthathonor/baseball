<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

<div class="container">
  <table class="table table-striped">
    <thead>
      <tr>
        <th>번호</th>
        <th>팀</th>
        <th>창단일</th>
        <th>수정</th>
        <th>삭제</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="team" items="${teamList}">
      <tr>
        <td>${team.id}</td>
        <td>${team.stadiumName}</td>
        <td>${team.teamName}</td>
        <td>${team.createdAt}</td>
        <td><button id="btnUpdate" class="btn btn-warning">수정</button></td>
        <td><button id="btnDelete" class="btn btn-danger">삭제</button></td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
</div>

<%@ include file="../layout/footer.jsp" %>