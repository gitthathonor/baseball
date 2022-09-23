<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>

<div class="container">
  <table class="table table-striped">
    <thead>
      <tr>
        <th>번호</th>
        <th>팀명</th>
        <th>포지션</th>
        <th>선수명</th>
        <th>사유</th>
        <th>퇴출일</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="expelled" items="${expelledList}">
      <tr>
        <td>${expelled.rownum }</td>
        <td>${expelled.teamName }</td>
        <td>${expelled.position}</td>
        <td>${expelled.playerName}</td>
        <td>${expelled.reason}</td>
        <td>${expelled.expelledDate}</td>
        <td></td>
        <td></td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
</div>

<%@ include file="../layout/footer.jsp" %>