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
        <td>${stadium.rownum}</td>
        <td>${stadium.name}</td>
        <td>${stadium.createdAt}</td>
        <td><button id="btnUpdate" class="btn btn-warning">수정</button></td>
      	<td><i onclick="deleteStadium(${stadium.id},this)" class="fa-solid fa-trash"></i></td>
      </tr>
     </c:forEach>
    </tbody>
  </table>
</div>


<script src="/js/stadium.js"></script>

<%@ include file="../layout/footer.jsp" %>