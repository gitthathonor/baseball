<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container">
	<h1 style="text-align:center">팀 등록</h1>
	<form>
      <div class="d-flex justify-content-center">
         <select id="stadium">
            <option value="none">== 구장 선택 ==</option>
            <c:forEach var="stadium" items="${stadiumList}">
               <option value="${stadium.id}">${stadium.name}</option>
            </c:forEach>
         </select>
         <div style="width: 500px">
            <input id="name" class="form-control" placeholder="구단 이름 작성" />
         </div>
         <button id="btnSave" type="button" class="btn btn-primary">등록</button>
      </div>
   </form>
</div>

<script src="/js/team.js"></script>

<%@ include file="../layout/footer.jsp"%>